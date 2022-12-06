package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExerciciosStreamAPI {

        public static void main(String[] args) {

                List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

                // System.out.println("Imprima todos os elementos dessa lista de String: ");
                // Esse
                // numerosAleatorios.stream().forEach(s -> System.out.println(s));
                // Ou esse
                // numerosAleatorios.forEach(System.out::println);

                // System.out.println("Pegue os 5 primeiros números e coloque dentro de um
                // Set:");
                // Esse
                // numerosAleatorios.stream()
                // .limit(5)
                // .collect(Collectors.toSet())
                // .forEach(System.out::println);
                // Ou esse
                // Set<String> numerosAleatorios5Primeiros = numerosAleatorios.stream()
                // .limit(5)
                // .collect(Collectors.toSet());
                // System.out.println(numerosAleatorios5Primeiros);

                System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
                // Primeira Codificação:
                // numerosAleatorios.stream()
                // .map(new Function<String,Integer>() {
                // @Override
                // public Integer apply(String s){
                // return Integer.parseInt(s);
                // }
                // }
                // );

                // Segunda Refatoração:
                // numerosAleatorios.stream().map(s -> Integer.parseInt(s));

                // Terceira Refatoração:
                // List<Integer> collectList =
                // numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
                // System.out.println(collectList);

                System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
                // Primeira Codificação:
                // List<Integer> ListParesMaioresQue2 = numerosAleatorios.stream()
                // .map(Integer::parseInt)
                // .filter(new Predicate<Integer>() {
                // @Override
                // public boolean test(Integer i) {
                // if(i %2 == 0 && i > 2 ) return true;
                // return false;
                // }
                // }).collect(Collectors.toList());
                // System.out.println(ListParesMaioresQue2);

                // Segunda Refatoração:
                // List<Integer> ListParesMaioresQue2 = numerosAleatorios.stream()
                // .map(Integer::parseInt)
                // .filter(i -> (i %2 == 0 && i > 2)).collect(Collectors.toList());
                // System.out.println(ListParesMaioresQue2);

                System.out.println("Mostre a média dos números: ");
                // Primeira Codificação:
                // numerosAleatorios.stream()
                // .mapToInt(new ToIntFunction<String>() {
                // @Override
                // public int apllyAsInt(String s){
                // return Integer.parseInt(s);
                // }
                // });

                // Primeira Refatoração:
                // numerosAleatorios.stream()
                // .mapToInt(s -> Integer.parseInt(s));

                // Segunda Refatoração:
                // numerosAleatorios.stream().mapToInt(Integer::parseInt)
                // .average()
                // .ifPresent(new DoubleConsumer() {
                // @Override
                // public void accept(double v) {
                // System.out.println(v);
                // }
                // });

                // Terceira Refatoração:
                // numerosAleatorios.stream().mapToInt(Integer::parseInt)
                // .average()
                // .ifPresent(v -> System.out.println(v));

                // Quarta Refatoração:
                // numerosAleatorios.stream().mapToInt(Integer::parseInt)
                // .average()
                // .ifPresent(System.out::println);

                System.out.println("Remova os valores ímpares: ");
                List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());
                // Primeira Codificação:
                // numerosAleatoriosInteger.removeIf( new Predicate<Integer>() {
                // @Override
                // public boolean test(Integer i) {
                // if (i %2 != 0) return true;
                // return false;
                // }
                // });
                // System.out.println(numerosAleatoriosInteger);

                // Primeira Refatoração:
                numerosAleatoriosInteger.removeIf(i -> (i % 2 != 0));
                System.out.println(numerosAleatoriosInteger);



                // // Para você
                // System.out.println("Ignore os 3 primeiros elementos da lista e imprima o
                // restante:");

                // System.out.println("Retirando os números repetidos da lista, quantos números
                // ficam? ");

                // System.out.print("Mostre o menor valor da lista: ");
     
                // System.out.print("Mostre o maior valor da lista: ");

                // System.out.println("Pegue apenas os números pares e some: ");

                // System.out.println("Mostre a lista na ordem númerica: ");

                // System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");

        }
}
