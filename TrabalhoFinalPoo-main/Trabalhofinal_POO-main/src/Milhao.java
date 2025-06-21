import java.util.List;
import java.util.Scanner;

public class Milhao extends Jogo {
    Arquivo arquivo = new Arquivo();
    Jogador jogador;
    GerenciadorDePerguntas gerenciadorDePerguntas;
    Scanner scanner = new Scanner(System.in);
    List<PerguntasRespostas> perguntas;

    public Milhao(Jogador jogador) {
        this.jogador = jogador;
        this.gerenciadorDePerguntas = new GerenciadorDePerguntas();
        this.perguntas = gerenciadorDePerguntas.getPerguntas();
    }

    @Override
    public void jogar() {
        System.out.println("=======================================================");
        System.out.println("BEM VINDO AO SHOW DO MILHÃO!!!!!!!!!!!!!");
        System.out.println("=======================================================");
        
        for (int i = 0; i<20 && i < perguntas.size(); i++) {
            PerguntasRespostas p = perguntas.get(i);

            System.out.println("\nPergunta " + (i + 1) + ":");
            System.out.println(p.getPergunta());
            //Inicia o processo de perguntar ao jogador se ele quer continuar ou desistir
            if(i>13){
                System.out.println("Deseja continuar?");
                System.out.println("Você tem um prêmio de: "+jogador.getPremio());
                System.out.println("Digite 1 para continuar, 2 para sair");
                int escolha =scanner.nextInt();
                scanner.nextLine();//Consumir a quebra de linha e evitar bugs
                if(escolha!=1){
                    System.out.println("Fim de jogo, obrigado por jogar até aqui!");
                    System.out.println("Você juntou um prêmio de: R$" + jogador.getPremio());
                    resultado();
                    return;
                }else{
                    System.out.println("Boa sorte, vamos continuar o jogo");

                }
            }

            List<String> alternativas = gerenciadorDePerguntas.getAlternativasEmbaralhadas(p);
            for (int j = 0; j < alternativas.size(); j++) {
                System.out.println((j + 1) + " - " + alternativas.get(j));
            }

            int respostaEscolhida = 0;
            boolean respostaValida = false;
            
            while (!respostaValida) {
                try {
                    System.out.print("Escolha a alternativa correta (1-4): ");
                    String input = scanner.nextLine();
                    
                    // Verifica se o input é uma letra (A-D)
                    if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
                        char letra = Character.toUpperCase(input.charAt(0));
                        if (letra >= 'A' && letra <= 'D') {
                            respostaEscolhida = letra - 'A' + 1;
                            respostaValida = true;
                        }
                    } 
                    // Verifica se é um número (1-4)
                    else {
                        respostaEscolhida = Integer.parseInt(input);
                        if (respostaEscolhida >= 1 && respostaEscolhida <= 4) {
                            respostaValida = true;
                        }
                    }
                    
                    if (!respostaValida) {
                        System.out.println("Opção inválida! Digite um número de 1 a 4 ou uma letra de A a D.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida! Digite um número de 1 a 4 ou uma letra de A a D.");
                }
            }

            if (alternativas.get(respostaEscolhida - 1).equals(p.getAlternativaCorreta())) {
                System.out.println("Resposta correta!");
                jogador.pontuar(i+1);
                System.out.println("Prêmio atual: R$" + jogador.getPremio());
            } else {
                System.out.println("Resposta incorreta.");
                System.out.println("A resposta correta era: " + p.getAlternativaCorreta());
                System.out.println("Você juntou um prêmio de: R$" + jogador.getPremio());
                System.out.println("Fim do jogo. Obrigado por participar!");
                resultado();
                return;
            }
        }
        System.out.println("PARABÉNS! Você ganhou o prêmio máximo de R$1.000.000!");
        resultado();
    }
    //Metodo para criação do csv que irá guardar as infos da jogatina
    @Override
    public void resultado() {
        arquivo.gerarRanking(jogador);
    }
}