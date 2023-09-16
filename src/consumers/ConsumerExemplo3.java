package consumers;

import java.util.Arrays;
import java.util.List;

public class ConsumerExemplo3 {
    
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        numeros.stream().forEach(numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        });

        System.out.println("-----------------------");

        // ou apenas o forEach
        numeros.forEach(n -> { // função lambda
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });

    }

}
