import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {

    public static void main(String[] args) {
        
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        //System.out.println("Imprima todos os elementos dessa lista de String: ");
        // numerosAleatorios.stream().forEach(System.out::println);

        // numerosaleatorios.stream().forEach(new Consumer<String>() {
        //     @Override
        //     public void accept(String s) {
        //         System.out.println(s);
        //     }
        // });

        // numerosaleatorios.stream().forEach(s -> System.out.println(s));

        // numerosaleatorios.forEach(s -> System.out.println(s));

        // numerosaleatorios.forEach(System.out::println);

        // System.out.println(numerosaleatorios);
       

        //System.out.println("Pegue os 5 últimos primeiros e coloque dentro de um Set: ");
        //numerosaleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

        //Set<String> collectSet = numerosaleatorios.stream().limit(5).collect(Collectors.toSet());
        // System.out.println(numerosaleatorios);


        //System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
        // List<Integer> numerosAleatorios1 = numerosaleatorios.stream()
        //         .map(Integer::parseInt).collect(Collectors.toList());

        // numerosaleatorios.stream().map(new Function<String, Integer>() {
        //     @Override
        //     public Integer apply(String s) {
        //         return Integer.parseInt(s);
        //     }
        // });

        // numerosaleatorios.stream().map(s -> Integer.parseInt(s));

        // numerosaleatorios.stream().map(Integer::parseInt);

        // numerosaleatorios.stream().map(Integer::parseInt).collect(Collectors.toList())
        // .forEach(System.out::println);;

        // List<Integer> collectList = numerosaleatorios.stream()
        // .map(Integer::parseInt).collect(Collectors.toList());
        // System.out.println(numerosaleatorios);
                 

        //System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
        // numerosaleatorios.stream().map(Integer::parseInt)
        // .filter(i -> i % 2 == 0 && i > 2).collect(Collectors.toList()).forEach(System.out::println);

        // List<Integer> ListParesMaioresQue2 = numerosaleatorios.stream().map(Integer::parseInt)
        // .filter(new Predicate<Integer>() {
        //     @Override
        //     public boolean test(Integer i) {
        //         if (i % 2 == 0 && i > 2) return true;
        //         return false;
        //     }
        // }).collect(Collectors.toList());
        // System.out.println(ListParesMaioresQue2);

        // List<Integer> ListParesMaioresQue2 = numerosaleatorios.stream().map(Integer::parseInt)
        //         .filter(i -> i % 2 == 0 && i > 2).collect(Collectors.toList());
        // System.out.println(ListParesMaioresQue2);


        //System.out.println("Mostre a lista na ordem numérica: ");
        // numerosAleatorios1.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);


        //System.out.println("Mostre a média dos números: ");
        // numerosaleatorios1.stream().average().ifPresent(System.out::println);

        // numerosaleatorios.stream().mapToInt(new ToIntFunction<String>() {
        //     @Override
        //     public int applyAsInt(String s) {
        //         return Integer.parseInt(s);
        //     }
        // });

        // numerosaleatorios.stream().mapToInt(s -> Integer.parseInt(s));

        // numerosaleatorios.stream().mapToInt(Integer::parseInt);
        // System.out.println(numerosaleatorios);

        // numerosaleatorios.stream().mapToInt(Integer::parseInt)
        // .average().ifPresent(new DoubleConsumer() {
        //     @Override
        //     public void accept(double v) {
        //         System.out.println(v);
        //     }
        // });

        // numerosaleatorios.stream().mapToInt(Integer::parseInt)
        //         .average().ifPresent(System.out::println);
                  

        System.out.println("Remova os valores ímpares: ");
        // numerosaleatorios1.removeIf(integer -> integer % 2 != 0);
        // System.out.println(numerosaleatorios1);

        List<Integer> numerosAleatoriosInt = numerosAleatorios.stream()
        .map(Integer::parseInt).collect(Collectors.toList());
        // numerosAleatoriosInt.removeIf(new Predicate<Integer>() {
        //     @Override
        //     public boolean test(Integer integer) {
        //         if (integer % 2 != 0) return true;
        //         return false;
        //     }
        // });
        // System.out.println(numerosAleatoriosInt);

        numerosAleatoriosInt.removeIf(i -> i % 2 != 0);
        System.out.println(numerosAleatoriosInt);
    }
    
}
