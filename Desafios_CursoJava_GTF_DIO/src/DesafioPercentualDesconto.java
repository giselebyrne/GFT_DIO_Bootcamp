import java.util.Scanner;

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

public class DesafioPercentualDesconto {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor inicial do Produto: ");
        double M = input.nextDouble();
        System.out.println("Informe o valor com desconto do Produto: ");
        double S = input.nextDouble();

        // TODO: Retorne o percentual de desconto que foi aplicado no produto
        double desconto = ((M - S)/ M)*100;      
        System.out.println("O valor do desconto aplicado no produto foi de " + String.format("%.0f", desconto)+ "%");
    }

}
