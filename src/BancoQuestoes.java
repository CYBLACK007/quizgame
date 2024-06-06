import java.util.ArrayList;
import java.util.List;

public class BancoQuestoes {
    private List<Questao> questoes;

    public BancoQuestoes() {
        questoes = new ArrayList<>();
        initializeQuestions();
    }

    private void initializeQuestions() {
       questoes.add(new Questao("Qual é o personagem principal da série de jogos The Legend of Zelda?",
                new String[]{"A) Mario", "B) Link", "C) Samus", "D) Donkey Kong"}, 1));

questoes.add(new Questao("Qual é o nome do vilão principal da série de jogos Resident Evil?",
                new String[]{"A) Albert Wesker", "B) Nemesis", "C) Jill Valentine", "D) Chris Redfield"}, 0));

questoes.add(new Questao("Em que ano foi lançado o jogo Minecraft?",
                new String[]{"A) 2009", "B) 2010", "C) 2011", "D) 2012"}, 2));

questoes.add(new Questao("Qual é o nome do ouriço azul em Sonic the Hedgehog?",
                new String[]{"A) Tails", "B) Knuckles", "C) Sonic", "D) Shadow"}, 2));

questoes.add(new Questao("Qual é o console mais vendido de todos os tempos?",
                new String[]{"A) PlayStation 2", "B) Nintendo DS", "C) Xbox 360", "D) PlayStation 4"}, 0));

questoes.add(new Questao("Qual é o nome do protagonista de Grand Theft Auto V?",
                new String[]{"A) Niko Bellic", "B) Tommy Vercetti", "C) Carl Johnson", "D) Michael De Santa"}, 3));

questoes.add(new Questao("Qual jogo é famoso pela frase 'It's-a me, Mario!'?",
                new String[]{"A) Sonic the Hedgehog", "B) Super Mario Bros.", "C) The Legend of Zelda", "D) Metroid"}, 1));

questoes.add(new Questao("Qual jogo popular tem o objetivo de 'capturar todos' os monstros conhecidos como Pokémon?",
                new String[]{"A) Digimon", "B) Yo-kai Watch", "C) Pokémon", "D) Monster Rancher"}, 2));

questoes.add(new Questao("Qual é o nome do personagem principal da série de jogos Metal Gear Solid?",
                new String[]{"A) Sam Fisher", "B) Solid Snake", "C) Gordon Freeman", "D) Marcus Fenix"}, 1));

questoes.add(new Questao("Qual jogo é conhecido por sua dificuldade extrema e pela frase 'You Died'?",
                new String[]{"A) Dark Souls", "B) Sekiro: Shadows Die Twice", "C) Bloodborne", "D) Demon's Souls"}, 0));

questoes.add(new Questao("Qual desses jogos foi desenvolvido pela CD Projekt Red?",
                new String[]{"A) The Witcher 3: Wild Hunt", "B) Cyberpunk 2077", "C) Assassin's Creed Valhalla", "D) Horizon Zero Dawn"}, 0));

questoes.add(new Questao("Em qual jogo você pode encontrar a cidade fictícia de Los Santos?",
                new String[]{"A) Grand Theft Auto V", "B) Watch Dogs", "C) Saints Row IV", "D) Red Dead Redemption 2"}, 0));

questoes.add(new Questao("Qual é o nome do herói em 'The Witcher'?",
                new String[]{"A) Geralt of Rivia", "B) Ezio Auditore", "C) Aloy", "D) Master Chief"}, 0));

questoes.add(new Questao("Qual jogo popular apresenta uma batalha entre equipes de 5 jogadores conhecida como 'Summoner's Rift'?",
                new String[]{"A) Dota 2", "B) League of Legends", "C) Smite", "D) Heroes of the Storm"}, 1));

questoes.add(new Questao("Qual jogo foi lançado com o console Nintendo Switch e se tornou um sucesso imediato?",
                new String[]{"A) The Legend of Zelda: Breath of the Wild", "B) Mario Kart 8 Deluxe", "C) Splatoon 2", "D) Super Mario Odyssey"}, 0));
        questoes.add(new Questao("Qual é o nome do mundo fictício onde se passa a série de jogos Final Fantasy VII?",
                new String[]{"A) Midgar", "B) Gaia", "C) Spira", "D) Ivalice"}, 1));

questoes.add(new Questao("Em que ano foi lançado o primeiro jogo da série Halo?",
                new String[]{"A) 2000", "B) 2001", "C) 2002", "D) 2003"}, 1));

questoes.add(new Questao("Qual personagem é conhecido por sua frase 'Do a barrel roll!' em Star Fox?",
                new String[]{"A) Fox McCloud", "B) Falco Lombardi", "C) Peppy Hare", "D) Slippy Toad"}, 2));

questoes.add(new Questao("Qual jogo popular é ambientado em uma escola fictícia chamada Bullworth Academy?",
                new String[]{"A) Bully", "B) Persona 5", "C) Life is Strange", "D) Danganronpa"}, 0));

questoes.add(new Questao("Qual desses jogos pertence ao gênero Battle Royale?",
                new String[]{"A) Fortnite", "B) Overwatch", "C) Destiny 2", "D) Warframe"}, 0));

questoes.add(new Questao("Qual é o nome do protagonista da série de jogos God of War?",
                new String[]{"A) Kratos", "B) Zeus", "C) Ares", "D) Hades"}, 0));

questoes.add(new Questao("Qual desses jogos foi desenvolvido pela Bethesda Game Studios?",
                new String[]{"A) The Elder Scrolls V: Skyrim", "B) The Witcher 3: Wild Hunt", "C) Dark Souls III", "D) Mass Effect 3"}, 0));

questoes.add(new Questao("Qual é o nome do primeiro jogo da série Assassin's Creed?",
                new String[]{"A) Assassin's Creed", "B) Assassin's Creed II", "C) Assassin's Creed: Brotherhood", "D) Assassin's Creed: Revelations"}, 0));

questoes.add(new Questao("Em que ano foi lançado o jogo The Last of Us?",
                new String[]{"A) 2011", "B) 2012", "C) 2013", "D) 2014"}, 2));

questoes.add(new Questao("Qual desses jogos é conhecido pelo seu modo de construção e sobrevivência?",
                new String[]{"A) Minecraft", "B) Terraria", "C) Rust", "D) Todos os anteriores"}, 3));

questoes.add(new Questao("Qual é o nome do protagonista em Red Dead Redemption 2?",
                new String[]{"A) John Marston", "B) Arthur Morgan", "C) Dutch van der Linde", "D) Micah Bell"}, 1));

questoes.add(new Questao("Qual desses jogos é uma série de RPGs de ação da FromSoftware?",
                new String[]{"A) Final Fantasy", "B) Dark Souls", "C) The Witcher", "D) Dragon Age"}, 1));

questoes.add(new Questao("Qual é o nome do jogo de simulação de vida desenvolvido pela Maxis?",
                new String[]{"A) The Sims", "B) SimCity", "C) Animal Crossing", "D) Stardew Valley"}, 0));

questoes.add(new Questao("Qual desses jogos é conhecido por sua mecânica de parkour?",
                new String[]{"A) Mirror's Edge", "B) Prince of Persia", "C) Assassin's Creed", "D) Todos os anteriores"}, 3));

questoes.add(new Questao("Qual jogo é famoso por seu personagem que coleta anéis dourados?",
                new String[]{"A) Mario", "B) Sonic", "C) Mega Man", "D) Kirby"}, 1));


    }

    public List<Questao> getQuestoes() {
        return questoes;
    }
}
