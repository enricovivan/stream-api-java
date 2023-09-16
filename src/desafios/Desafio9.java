package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio9 {
    
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verificar se todos os números da lista são distintos (não se repetem)
        List<Integer> listaSemRepetidos = numeros.stream().distinct().toList();
        
        if (listaSemRepetidos.size() < numeros.size()) {
            System.out.println("Alguns números se repetem");
        }
        else {
            System.out.println("Nenhum número se repete");
        }

    }

}
