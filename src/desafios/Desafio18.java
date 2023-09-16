package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // List<Integer> numeros = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);

        // Verifique se todos os números da lista são iguais:
        boolean count = numeros.stream().sorted().distinct().count() == 1;

        System.out.println((count)?"Todos os elementos são iguais": "Há elementos diferentes");
    }

}
