import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
public class Arquivo implements ManipulaArquivos {
    @Override
    public boolean gerarRanking(Jogador jogador) {
        String csvfile = "Ranking.csv";
        File file = new File(csvfile);
        boolean sucesso = false;

        boolean arquivoExiste = file.exists();
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(csvfile,StandardCharsets.UTF_8, true));
            if (!arquivoExiste) {
                writer.println("Nome, Prêmio");
            }
            writer.println(jogador.getNome() + "," + jogador.getPremio());
            writer.close();
            System.out.println("Emissão de ranking completa");
            System.out.println("-------------------------------------------------------");
            System.out.println("Você pode visualizar o ranking em: " + new File("Ranking.csv").getAbsolutePath());
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(file);}
            sucesso = true;
        } catch (IOException e) {
            System.out.println("Erro ao salvar o ranking.");
            e.printStackTrace();
        }
        return sucesso;
    }
}
