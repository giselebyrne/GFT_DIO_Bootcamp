public class Calculadora {

    public static void somarValor(double num1, double num2) {
        double valor = num1 + num2;
        System.out.println("A soma de " + num1 + " mais " + num2 + " é igual a: " + valor);
    }

    public static void diminuirValor(double num1, double num2) {
        double valor = num1 - num2;
        System.out.println("A subtração de " + num1 + "mais " + num2 + "é igual a:" + valor);
    }

    public static void dividirValor(double num1, double num2) {
        double valor = num1 / num2;
        System.out.println("A divisão de " + num1 + "mais " + num2 + "é igual a:" + valor);
    }

    public static void multiplicarValor(double num1, double num2) {
        double valor = num1 * num2;
        System.out.println("A multiplicação de " + num1 + "mais " + num2 + "é igual a:" + valor);
    } 
    
}
