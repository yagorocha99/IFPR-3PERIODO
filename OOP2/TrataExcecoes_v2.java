import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TrataExcecoes_v2 {
    public static void main(String[] args){
        TrataExcecoes_v2 te = new TrataExcecoes_v2();
        String res = te.lerArquivo();
        System.out.println(res);
    }

    public String lerArquivo() {
        String retorno = "OK ";
        try {
            String arqEntrada = "arq2.txt";
            BufferedReader arq = new BufferedReader(
                    new FileReader(arqEntrada));
            String linha;
            while ((linha = arq.readLine()) != null) {
                System.out.println(linha + "\n");
            }
            arq.close();
        } catch (FileNotFoundException e1) {
            retorno = "Arquivo não encontrado";
        } catch (IOException e2) {
            retorno = "Erro na leitura do arquivo";
        } catch (Exception e3) {
            retorno = "Erro inesperado.";
            retorno += "Detalhes:" + e3.getMessage();
        } finally {
            retorno += " Encerrando.";
        }
        return retorno;
    }
}