package functions;

import java.util.Arrays;
import java.util.List;

public class FuncEx2 {
    
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> nDobrados = numeros.stream().map(n -> n*2).toList();

        numeros.forEach(n-> System.out.println(n*2));

        System.out.println("---------------");

        nDobrados.forEach(n -> System.out.println(n));

    }

}
