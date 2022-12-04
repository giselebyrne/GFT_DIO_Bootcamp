// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;

public class DesafioFilaBanco {
   public static void main(String[] args) {

    // Resolução exata do Desafio (A entrada estão sendo randomicas)
    String[] nomesFila = new String[3];
    Scanner nome = new Scanner(System.in);

    for( int i = 0; i < nomesFila.length; i++){
        nomesFila[i] = nome.next();
        System.out.print("%s - esta na posicao: %d%n", nomesFila[i], (i+1));
        }
        
    // Possibilidade de Resolução com entrada dos nomes pelo teclado:    
    // for( int i = 0; i <3; i++){
    //     System.out.println("Informe o nome do Cliente: ");
    //     Scanner nome = new Scanner(System.in);
    //     nomesFila[i] = nome.next();
    // }
    // int count = 1;
    // for (int a = 0; a < nomesFila.length; a++){
    //     System.out.println(nomesFila[a] + " - está na posição " + count);
    //     count++;
    // }
   }
}
