package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio17 {
    
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Filtrar os números primos da lista
        List<Integer> numeroPrimo = numeros.stream()
            .filter(n->n%2!=0 || n==2)
            .filter(n -> n == 1 || n == 2 || n == 3 || (n % 2 != 0 && n % 3 != 0))
            .toList();

        numeroPrimo.forEach(System.out::println);
    }

}
