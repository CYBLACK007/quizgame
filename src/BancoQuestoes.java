import java.util.ArrayList;
import java.util.List;

public class BancoQuestoes {
    private List<Questao> questoes;

    public BancoQuestoes() {
        questoes = new ArrayList<>();
        initializeQuestions();
    }

    private void initializeQuestions() {
        questoes.add(new Questao("Quem veio primeiro a galinha ou o ovo",
                new String[]{"A)A casca", "B) O ovo", "C) Clara", "D) Galinha"}, 1));
        questoes.add(new Questao("teste de pergunta 1",
                new String[]{"A) Teste 1", "B) Teste 2", "C) Teste 3", "D) Teste 4"}, 0));
        questoes.add(new Questao("Autores",
                new String[]{"A) William Shakespeare", "B) Machado de Assis", "C) Miguel de Cervantes", "D) Dante Alighieri"}, 2));

    }

    public List<Questao> getQuestoes() {
        return questoes;
    }
}