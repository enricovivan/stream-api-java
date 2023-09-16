package suppliers;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample2 {
    
    public static void main(String[] args) {

        List<String> saudacoes = Stream.generate(
            new Supplier<String>(){

                @Override
                public String get() {
                    return "Olá, como vai?";
                }

            }
        ).limit(4).toList();

        saudacoes.forEach(System.out::println);

    }

}
