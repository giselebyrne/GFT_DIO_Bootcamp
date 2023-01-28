// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;

public class DesafioQualTurno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual o Turno que você estuda? ");
        System.out.println("Digite: M-matutino, T-vespertino, N-noite: ");
        
        char turno = leitor.next().toUpperCase().charAt(0);

//TODO: Implemente uma solução para que seja impresso a saída correto do seu turno:   
        //   if (turno == 'M' ) {            
        //         System.out.println("Bom dia!");
        //     } else if (turno == 'V'){
        //         System.out.println("Boa Tarde!");
        // } else if (turno == 'N') {           
        //         System.out.println("Boa Noite!");
        // } else System.out.println("Valor Inválido!");

        String msg;
     
     switch(turno){
            case 'M':
            msg="Bom Dia!";
            break;

            case 'V':
            msg="Boa Tarde!";
            break;

            case 'N':
            msg="Boa Noite!";
            break;

            default:
            msg="Valor Inválido!";
            break;
        }
        System.out.println(msg);
    }

}
