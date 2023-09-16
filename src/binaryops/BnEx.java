package binaryops;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BnEx {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);

        BinaryOperator<Integer> somar = (n1, n2) -> n1 + n2;

        int resultado = numeros.stream().reduce(0, somar);

        System.out.println(resultado);

    }
}
