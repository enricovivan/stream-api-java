package consumers;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemplo2 {
    
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        numeros.stream().forEach(new Consumer<Integer>() {
            
            @Override
            public void accept(Integer n) {

                if (n % 2 == 0) {
                    System.out.println(n);
                }

            }
        });

    }

}
