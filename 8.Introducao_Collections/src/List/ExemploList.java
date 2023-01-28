package List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

public class ExemploList {
    /**
     * @param args
     */
    public static void main(String[] args) {

        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        // List notas = new ArrayList(); //antes do java 5
        // ArrayList<Double> notas = new ArrayList<>();
        // List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d,
        // 0d,3.6));
        
        //  List<Double> notasX = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        //  notasX.add(10d);
        //  System.out.println(notasX);
    
         //Dessa forma não pode adicionar e nem excluir elementos dentro do array
        //  List<Double> notasX = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        //  notasX.add(1d);
        //  notasX.remove(5d);
        //  System.out.println(notasX);
         
        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>(); // Generics(jdk 5) - Diamond Operator(jdk 7)
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        // IndexOf é um método para retornar a posição de um objeto na lista
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        // Nesse caso o parâmetro 4 é a posição que queremos add o elemento na List
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        // Contains é um método que verifica se o parâmetro passado está na lista
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        // System.out.println("Exiba todas as notas na ordem em que foram informados:");
        // for (Double nota : notas)
        // System.out.println(nota);

        // System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        // System.out.println(notas.toString());

        // Para esse exemplo utilizamos a Classe Collections e o método 'min' e 'max' que recebe
        // a collection 'List'(notas) para exibir a menor e a maior nota
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        //
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        // Método size() retorna o tamanho da collection
        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        // Nesse exemplo iremos remover o objeto 0.0, então usamos a notação 'o: 0d'
        // 0d é a notação para double no Java! 0d substitui 0.0
        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        // Nesse exemplo iremos remover o objeto da posição 0, então usamos a notação
        // 'index: 0'
        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7)
                iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());



        // DESAFIO LINKEDLIST

        // Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:

        System.out.println("Crie uma lista chamada notas2 " +
        "e coloque todos os elementos da list Arraylist nessa nova lista: ");
        LinkedList<Double> notas2 = new LinkedList<Double>(notas); 
        //notas2.addAll(notas);
        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: " + notas2.getFirst() );

        System.out.println("Mostre a primeira nota da nova lista removendo-o: " + notas2.removeFirst());

        System.out.println("Lista após remoção da primeira Nota: " + notas2);      

    }

}
