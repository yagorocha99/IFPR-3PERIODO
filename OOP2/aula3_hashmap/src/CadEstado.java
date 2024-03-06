import java.util.HashMap;

public class CadEstado {
    public static void main(String[] args){
        HashMap<String, Estado> estados =
                new HashMap<String, Estado>();

        Estado e1 = new Estado();
        e1.setNome("Parana");
        e1.setRegiao("Sul");
        estados.put("PR", e1);

        Estado e2 = new Estado();
        e2.setNome("Sao Paulo");
        e2.setRegiao("Sudeste");
        estados.put("SP", e2);

        Estado e3 = new Estado();
        e3.setNome("Rio Grande do Norte");
        e3.setRegiao("Nordeste");
        estados.put("RN", e3);

        System.out.println("Estados armazenados" + estados);

        System.out.println("Verificando se um estado existe:");
        String pesquisado = "SP";
        if(estados.containsKey(pesquisado)){
            System.out.println(pesquisado + " existe no hashmap");
            System.out.println("Buscando a regiao do estado de " + pesquisado);
            System.out.println("Regiao " + estados.get(pesquisado).getRegiao());
        } else{
            System.out.println(pesquisado + " nao encontrado");
        }
    }
}
