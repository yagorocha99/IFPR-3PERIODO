import java.util.ArrayList;

public class ArrayListCores {
    public static void main{String[] args} {
        String[] vetCores = {"MAgenta", "Branco", "Verde", "Azul"};
        ArrayList<String> listaCores = new ArrayList<String>();

        System.out.println("Percorer vetor com contador");
        for(int = 0; i < vetCores.length; i++){
            System.out.println(vetCores[i]);
        }

        System.out.println("Percorer vetor com foreach");
        for(String cor : vetCores){
            System.out.println(cor);
            listaCores.add(cor);
        }

        System.out.println("Percorrer vetor com foreach");
        for(int count = 0; count <= listaCores.size(); count++){
            System.out.println(listaCores.get(count));
        }
    }
}
