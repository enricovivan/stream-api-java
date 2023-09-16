package predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredEx {
    
    public static void main(String[] args) {
        
        List<String> palavras = Arrays.asList("java", "dart", "python", "c++");

        Predicate<String> maisDe4Caracteres = palavra -> palavra.length() >= 4;

        palavras.stream().filter(maisDe4Caracteres).forEach(System.out::println);

    }

}
