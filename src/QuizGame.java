import java.util.Scanner;
import java.util.Stack;

public class QuizGame {

    public static void main(String[] args) {
        BancoQuestoes bancoQuestoes = new BancoQuestoes();
        Stack<Questao> questoesStack = new Stack<>();
        questoesStack.addAll(bancoQuestoes.getQuestoes());

        Scanner scanner = new Scanner(System.in);

        System.out.println("CENTRO DE ENSINO ALFREDO NASSER \nPROFESSOR: BRENNO PIMENTA \nALUNO: KEVEN AFONSO");
        int score = 0;
        int totalQuestoes = questoesStack.size();
        while (!questoesStack.isEmpty()) {
            Questao QuestaoAtual = questoesStack.pop();
            System.out.println(QuestaoAtual.questao);
            for (String option : QuestaoAtual.alternativas) {
                System.out.println(option);
            }

            String answer;

            while (true) {
                System.out.print("Escolha uma opção (A, B, C , D): ");
                answer = scanner.nextLine().toLowerCase();

                int optionIndex = -1;
                switch (answer) {
                    case "a":
                        optionIndex = 0;
                        break;
                    case "b":
                        optionIndex = 1;
                        break;
                    case "c":
                        optionIndex = 2;
                        break;
                    case "d":
                        optionIndex = 3;
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        continue;
                }
                break;
            }

            int optionIndex;
            switch (answer) {
                case "a":
                    optionIndex = 0;
                    break;
                case "b":
                    optionIndex = 1;
                    break;
                case "c":
                    optionIndex = 2;
                    break;
                case "d":
                    optionIndex = 3;
                    break;
                default:
                    optionIndex = -1;
                    break;
            }

            if (optionIndex == QuestaoAtual.opcaocerta) {
                System.out.println("Resposta correta!");
                score++;
            } else {
                System.out.println("Resposta incorreta.");
            }
            System.out.println();
        }

        System.out.println("Fim do jogo!");
        System.out.println("Pontuação final: " + score + "/" + totalQuestoes);
    }
}