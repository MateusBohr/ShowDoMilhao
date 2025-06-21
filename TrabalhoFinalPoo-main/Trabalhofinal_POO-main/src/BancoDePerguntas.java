import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BancoDePerguntas {
    public static List<PerguntasRespostas> carregarPerguntas() {
        List<PerguntasRespostas> perguntas = new ArrayList<>();

        // Adicionando todas as perguntas
        perguntas.add(new PerguntasRespostas(
            "Qual é a capital do Brasil?",
            Arrays.asList("Brasília", "Rio de Janeiro", "São Paulo", "Belo Horizonte"),
            "Brasília"
        ));

        perguntas.add(new PerguntasRespostas(
            "Quem pintou a Mona Lisa?",
            Arrays.asList("Leonardo da Vinci", "Michelangelo", "Rafael", "Donatello"),
            "Leonardo da Vinci"
        ));

        perguntas.add(new PerguntasRespostas(
            "Qual é o maior planeta do Sistema Solar?",
            Arrays.asList("Júpiter", "Saturno", "Marte", "Terra"),
            "Júpiter"
        ));

        perguntas.add(new PerguntasRespostas(
            "Em que ano o Brasil foi descoberto?",
            Arrays.asList("1500", "1492", "1808", "1822"),
            "1500"
        ));

        perguntas.add(new PerguntasRespostas(
            "Qual o símbolo químico da água?",
            Arrays.asList("H2O", "CO2", "O2", "NaCl"),
            "H2O"
        ));

        perguntas.add(new PerguntasRespostas(
            "Quem escreveu 'Dom Casmurro'?",
            Arrays.asList("Machado de Assis", "José de Alencar", "Camilo Castelo Branco", "Eça de Queirós"),
            "Machado de Assis"
        ));

        perguntas.add(new PerguntasRespostas(
            "Qual é o idioma oficial da Argentina?",
            Arrays.asList("Espanhol", "Português", "Inglês", "Francês"),
            "Espanhol"
        ));

        perguntas.add(new PerguntasRespostas(
            "Qual é o resultado da soma 7 + 5?",
            Arrays.asList("12", "10", "13", "11"),
            "12"
        ));

        perguntas.add(new PerguntasRespostas(
            "Qual o nome do presidente do Brasil em 2023?",
            Arrays.asList("Lula", "Bolsonaro", "Temer", "Dilma"),
            "Lula"
        ));

        perguntas.add(new PerguntasRespostas(
            "Qual o maior animal terrestre?",
            Arrays.asList("Elefante", "Rinoceronte", "Baleia", "Leão"),
            "Elefante"
        ));

        perguntas.add(new PerguntasRespostas(
            "Qual é o continente onde fica o Egito?",
            Arrays.asList("África", "Ásia", "Europa", "América"),
            "África"
        ));

        perguntas.add(new PerguntasRespostas(
            "Em que esporte Pelé ficou famoso?",
            Arrays.asList("Futebol", "Basquete", "Atletismo", "Tênis"),
            "Futebol"
        ));

        perguntas.add(new PerguntasRespostas(
            "Quem descobriu a gravidade ao observar uma maçã cair?",
            Arrays.asList("Isaac Newton", "Albert Einstein", "Galileu Galilei", "Nikola Tesla"),
            "Isaac Newton"
        ));

        perguntas.add(new PerguntasRespostas(
            "Qual é o maior oceano do planeta?",
            Arrays.asList("Pacífico", "Atlântico", "Índico", "Ártico"),
            "Pacífico"
        ));

        perguntas.add(new PerguntasRespostas(
            "Qual é a cor da mistura do azul com o amarelo?",
            Arrays.asList("Verde", "Laranja", "Roxo", "Marrom"),
            "Verde"
        ));

        perguntas.add(new PerguntasRespostas(
            "Quantos estados tem o Brasil incluindo o DF?",
            Arrays.asList("26", "25", "27", "28"),
            "27" // 27 estados (incluindo DF)
        ));

        perguntas.add(new PerguntasRespostas(
            "Qual é o país conhecido como 'Terra do Sol Nascente'?",
            Arrays.asList("Japão", "China", "Coreia", "Índia"),
            "Japão"
        ));

        perguntas.add(new PerguntasRespostas(
            "Quem foi o primeiro homem a pisar na Lua?",
            Arrays.asList("Neil Armstrong", "Yuri Gagarin", "Buzz Aldrin", "Michael Collins"),
            "Neil Armstrong"
        ));

        perguntas.add(new PerguntasRespostas(
            "Qual é a moeda oficial dos Estados Unidos?",
            Arrays.asList("Dólar", "Euro", "Iene", "Libra"),
            "Dólar"
        ));

        perguntas.add(new PerguntasRespostas(
                "Qual é a fórmula para calcular a área do círculo?",
                Arrays.asList("pi * r²", "2 * pi * r", "pi * d", "r² * pi"),
                "pi * r²"
        ));

        perguntas.add(new PerguntasRespostas(
                "Qual é o nome do criador do universo Marvel nos quadrinhos?",
                Arrays.asList("Stan Lee", "Jack Kirby", "Steve Ditko", "Jim Lee"),
                "Stan Lee"
        ));

        perguntas.add(new PerguntasRespostas(
                "Em qual jogo aparece o personagem Master Chief?",
                Arrays.asList("Halo", "Call of Duty", "Gears of War", "Doom"),
                "Halo"
        ));

        perguntas.add(new PerguntasRespostas(
                "Qual é o nome do assistente virtual da Apple?",
                Arrays.asList("Siri", "Alexa", "Cortana", "Google Assistente"),
                "Siri"
        ));

        perguntas.add(new PerguntasRespostas(
                "Qual franquia tem o personagem Link como protagonista?",
                Arrays.asList("The Legend of Zelda", "Final Fantasy", "Metroid", "Pokémon"),
                "The Legend of Zelda"
        ));

        perguntas.add(new PerguntasRespostas(
                "Qual é o nome do famoso robô de 'Star Wars' que é dourado?",
                Arrays.asList("C-3PO", "R2-D2", "BB-8", "K-2SO"),
                "C-3PO"
        ));

        // Novas perguntas - Cultura Brasileira
        perguntas.add(new PerguntasRespostas(
                "Qual festa tradicional brasileira acontece no mês de junho?",
                Arrays.asList("Festa Junina", "Carnaval", "Réveillon", "Oktoberfest"),
                "Festa Junina"
        ));

        perguntas.add(new PerguntasRespostas(
                "Quem é conhecido como o 'Rei do Futebol' no Brasil?",
                Arrays.asList("Pelé", "Zico", "Ronaldo Fenômeno", "Neymar"),
                "Pelé"
        ));

        perguntas.add(new PerguntasRespostas(
                "Qual é o ritmo musical típico do Nordeste brasileiro?",
                Arrays.asList("Forró", "Samba", "Bossa Nova", "Frevo"),
                "Forró"
        ));

        perguntas.add(new PerguntasRespostas(
                "Qual cidade é famosa pela festa do Carnaval com grandes desfiles de escolas de samba?",
                Arrays.asList("Rio de Janeiro", "Salvador", "São Paulo", "Recife"),
                "Rio de Janeiro"
        ));

        perguntas.add(new PerguntasRespostas(
                "Quem foi o primeiro presidente do Brasil após a Proclamação da República?",
                Arrays.asList("Deodoro da Fonseca", "Getúlio Vargas", "Juscelino Kubitschek", "Washington Luís"),
                "Deodoro da Fonseca"
        ));

        // Novas perguntas - Cinema
        perguntas.add(new PerguntasRespostas(
                "Quem dirigiu o filme 'Titanic'?",
                Arrays.asList("James Cameron", "Steven Spielberg", "Christopher Nolan", "Quentin Tarantino"),
                "James Cameron"
        ));

        perguntas.add(new PerguntasRespostas(
                "Qual filme ganhou o Oscar de Melhor Filme em 2020?",
                Arrays.asList("Parasita", "1917", "Coringa", "Era Uma Vez em... Hollywood"),
                "Parasita"
        ));

        perguntas.add(new PerguntasRespostas(
                "Qual personagem é conhecido como 'O Cavaleiro das Trevas'?",
                Arrays.asList("Batman", "Superman", "Homem-Aranha", "Super-Homem"),
                "Batman"
        ));

        perguntas.add(new PerguntasRespostas(
                "Em qual saga o personagem 'Darth Vader' aparece?",
                Arrays.asList("Star Wars", "Star Trek", "Matrix", "O Senhor dos Anéis"),
                "Star Wars"
        ));

        perguntas.add(new PerguntasRespostas(
                "Quem interpreta o personagem Tony Stark no Universo Cinematográfico Marvel?",
                Arrays.asList("Robert Downey Jr.", "Chris Evans", "Chris Hemsworth", "Mark Ruffalo"),
                "Robert Downey Jr."
        ));

        // Novas perguntas - Música
        perguntas.add(new PerguntasRespostas(
                "Qual banda lançou o álbum 'Abbey Road'?",
                Arrays.asList("The Beatles", "The Rolling Stones", "Pink Floyd", "Queen"),
                "The Beatles"
        ));

        perguntas.add(new PerguntasRespostas(
                "Quem é conhecido como 'Rei do Pop'?",
                Arrays.asList("Michael Jackson", "Elvis Presley", "Prince", "Freddie Mercury"),
                "Michael Jackson"
        ));

        perguntas.add(new PerguntasRespostas(
                "Qual gênero musical é originário da Jamaica?",
                Arrays.asList("Reggae", "Samba", "Jazz", "Blues"),
                "Reggae"
        ));

        perguntas.add(new PerguntasRespostas(
                "Qual cantora lançou o álbum '1989'?",
                Arrays.asList("Taylor Swift", "Adele", "Beyoncé", "Katy Perry"),
                "Taylor Swift"
        ));

        perguntas.add(new PerguntasRespostas(
                "Qual instrumento musical tem teclas pretas e brancas?",
                Arrays.asList("Piano", "Violão", "Bateria", "Saxofone"),
                "Piano"
        ));

        // Novas perguntas - Curiosidades Gerais
        perguntas.add(new PerguntasRespostas(
                "Qual é o animal mais rápido do mundo?",
                Arrays.asList("Falcão-peregrino", "Guepardo", "Águia", "Leopardo"),
                "Falcão-peregrino"
        ));

        perguntas.add(new PerguntasRespostas(
                "Quantos ossos tem o corpo humano adulto?",
                Arrays.asList("206", "210", "195", "220"),
                "206"
        ));

        perguntas.add(new PerguntasRespostas(
                "Qual é o país com a maior população do mundo?",
                Arrays.asList("China", "Índia", "Estados Unidos", "Indonésia"),
                "China"
        ));

        perguntas.add(new PerguntasRespostas(
                "Em que ano foi inventada a internet?",
                Arrays.asList("1969", "1985", "1991", "1975"),
                "1969"
        ));

        perguntas.add(new PerguntasRespostas(
                "Qual é o maior órgão do corpo humano?",
                Arrays.asList("Pele", "Fígado", "Coração", "Pulmão"),
                "Pele"
        ));

        return perguntas;
    }
}