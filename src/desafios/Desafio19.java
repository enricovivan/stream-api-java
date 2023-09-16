package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio19 {
    
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // List<Integer> numeros = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);

        // Encontre a soma dos números divisíveis por 3 e 5:
        List<Integer> por3E5 = numeros.stream().filter(n -> n%3 == 0 && n%5 == 0).toList();
        List<Integer> por3 = numeros.stream().filter(n -> n%3 == 0).toList();
        List<Integer> por5 = numeros.stream().filter(n -> n%5 == 0).toList();


        System.out.println("------ Por 3 e 5 ------");
        if (por3E5.size() == 0) System.out.println("null");
        por3E5.forEach(System.out::println);
        System.out.println("-----------------------");

        System.out.println("-------- Por 3 --------");
        if (por3.size() == 0) System.out.println("null");
        por3.forEach(System.out::println);
        System.out.println("-----------------------");

        System.out.println("-------- Por 5 --------");
        if (por5.size() == 0) System.out.println("null");
        por5.forEach(System.out::println);
        System.out.println("-----------------------");


    }

}
