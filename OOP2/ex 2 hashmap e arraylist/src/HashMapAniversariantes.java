package exercicio_hashmap_arraylist;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class HashMapAniversariantes {
    HashMap<String, ArrayList<String>> aniversariantes;
    BufferedReader reader;

    public static void main(String[] args) {
        HashMapAniversariantes aniv = new HashMapAniversariantes();
        aniv.reader = new BufferedReader (new InputStreamReader(System.in));
        aniv.aniversariantes = new HashMap<String, ArrayList<String>>();
    }
}