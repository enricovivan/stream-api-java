package suppliers;

import java.util.List;
import java.util.stream.Stream;

public class SupplierExample3 {
    
    public static void main(String[] args) {

        List<String> saudacoes = Stream.generate(()->"Olá, bão?").limit(5).toList();

        saudacoes.forEach(System.out::println);

    }

}
