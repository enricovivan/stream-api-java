package functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FuncEx {
    
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Function<Integer, Integer> dobrar = numero -> numero * 2;

        // usar a function para dobrar os numeros
        List<Integer> numerosDobrados = numeros.stream().map(dobrar).toList();

        numerosDobrados.forEach(System.out::println);

    }

}
