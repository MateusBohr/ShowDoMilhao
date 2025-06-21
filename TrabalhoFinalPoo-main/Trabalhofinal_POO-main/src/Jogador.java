public class Jogador {
    //Armazena dados do jogador e de sua jogatina atual
    private String nome;
    private double premio =0;

    private static final double[] premiosPorPergunta = {
            500, 1000, 2000, 5000, 10000,
            15000, 20000, 30000, 50000, 75000,
            100000, 150000, 200000, 250000, 300000,
            400000, 500000, 600000, 750000, 1000000
    };




    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setPremio(double premio){
        this.premio=premio;
    }

    public double getPremio() {
        return premio;
    }

        public double pontuar(int numeroPergunta){
            if (numeroPergunta >= 1 && numeroPergunta <= premiosPorPergunta.length) {
                premio = premiosPorPergunta[numeroPergunta - 1];
            } else {
                System.out.println("Número da pergunta inválido!");
            }
            return premio;
        }
    }
