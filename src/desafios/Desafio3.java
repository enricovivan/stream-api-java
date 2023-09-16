package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // verificar se todos os numeros da lista são positivos
        if (numeros.stream().filter(n -> n >=0).count() == numeros.size()){
            System.out.println("Todos os números são positivos");
        }
        else {
            System.out.println("Nem todos os números são positivos");
        }
    }

}
