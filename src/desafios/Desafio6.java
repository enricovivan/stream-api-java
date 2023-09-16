package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verificar se a lista tem um numero maior qe 10 e exibir o resultado

        long quantidade = numeros.stream().filter(n->n>10).count();
        
        if (quantidade > 0) {
            System.out.println("Há " + quantidade + " número(s) maior(es) que 10");
        }
        else {
            System.out.println("Não Há");
        }
    }

}
