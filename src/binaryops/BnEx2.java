package binaryops;

import java.util.Arrays;
import java.util.List;

public class BnEx2 {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);

        int resultado = numeros.stream().reduce(0, (n1, n2)->n1+n2);
        int resultado2 = numeros.stream().reduce(0, Integer::sum);

        System.out.println(resultado);
        System.out.println("-----");
        System.out.println(resultado2);

    }
}
