import java.util.Scanner;

public class Mensagem {

    public static void saudacao() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o Horário: ");
        int horario = scan.nextInt();

        if (horario >= 1) {
            if (horario <= 12) {
                System.out.println("Bom dia");
            }
        } if (horario > 12) {
            if (horario <= 18) {
                System.out.println("Boa Tarde");
            }
        } if (horario > 18) {
            if (horario <= 24) {
                System.out.println("Boa Noite");
            }
        } 
        
        // else {
        //     System.out.println("Horário Inválido! \n");
        // }
    }

}
