package suppliers;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    
    public static void main(String[] args) {
        
        Supplier<String> saudacoes = () -> "Olá, seja bem vindo(a)!";

        // usa o supplier para obter uma lista com 5 saudações
        List<String> listSaudacoes = Stream.generate(saudacoes).limit(5).collect(Collectors.toList());

        // ou melhor:
        List<String> listSaudacoes2 = Stream.generate(saudacoes).limit(5).toList();


        // imprime as saudações
        listSaudacoes.forEach(o -> {
            System.out.println(o);
        });

        System.out.println("----------------");

        listSaudacoes2.forEach(n -> {
            System.out.println(n);
        });

        // Reference method
        System.out.println("----------------");

        listSaudacoes.forEach(System.out::println);

    }

}
