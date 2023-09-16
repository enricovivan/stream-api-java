package desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Desafio13 {
    
    public static void main(String[] args) {
        
        var cl = new Desafio13();
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Filtrar os números que estão dentro de um intervalo
        List<Integer> listaFiltrada = cl.filtraNumeros(numeros, 5, 10);

        listaFiltrada.forEach(System.out::println);
        

    }

    public List<Integer> filtraNumeros(List<Integer> lista, int n1, int n2){
            
        List<Integer> listaFiltro = new ArrayList<>(lista);

        listaFiltro = listaFiltro.stream().filter(n -> n > n1 && n < n2).toList();

        return listaFiltro;

    }

}
