package predicates;

import java.util.Arrays;
import java.util.List;

public class PredEx2 {
    
    public static void main(String[] args) {
        
        List<String> palavras = Arrays.asList("java", "dart", "python", "c++");
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        palavras.stream().filter(palavra -> palavra.length() >= 4).forEach(System.out::println);
        System.out.println("----------");
        nums.stream().filter(n -> n % 2 == 0).forEach(System.out::println);


    }

}
