package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio15 {
    
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verifique se a lista contém pelo menos um número negativo
        long quantNegativos = numeros.stream().filter(n->n<0).count();

        if (quantNegativos > 0) {
            System.out.println("Há números negativos");
        }
        else {
            System.out.println("Não há numeros negativos");
        }
    }

}
