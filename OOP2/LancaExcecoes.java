import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LancaExcecoes {
    public static void main(String[] args){
        LancaExcecoes le = new LancaExcecoes();
        le.lerArquivo();
    }

    public void lerArquivo() {
        try {
            String arqEntrada = "arq.txt";
            BufferedReader arq = new BufferedReader(
                    new FileReader(arqEntrada));
            String linha;
            while ((linha = arq.readLine()) != null) {
                System.out.println(linha + "\n");
            }
            arq.close();
        } catch (FileNotFoundException e1) {
            System.out.println("Arquivo não encontrado");
        } catch (IOException e2) {
            System.out.println("Erro na leitura do arquivo");
        } catch (Exception e3) {
            System.out.println("Erro inesperado.");
            System.out.println("Detalhes:" + e3.getMessage());
        } finally {
            System.out.println("Encerrando.");
        }
    }
}