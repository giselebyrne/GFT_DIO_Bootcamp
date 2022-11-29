
// Tipos Primitivos e seus Valores
// Int, byte, short, long, float, double, char
// tipo float tem que terminar o valor com 'f'... ex: float pi = 3.14f
// tipo long tem que terminar o valor com 'l' ... ex: long cpf = 81909045873l
public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        System.out.println(numero);

        // Utilizamos o 'final' para ficar um valor de uma variavel 
        //e a variavel tem que ser declarado em maiusculo
        final double VALOR_DE_PI = 3.14;

    }
}
