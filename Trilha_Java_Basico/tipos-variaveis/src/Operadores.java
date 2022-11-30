public class Operadores {
    public static void main(String[] args) {
        // String nomeCompleto = "LINGUAGEM " + "JAVA";
        // System.out.println(nomeCompleto);
        String concatenacao = "?";
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

        int numero = 5;
        numero = -numero;
        System.out.println(numero);
        // Forma errada de converter um numero negativo em positivo
        // numero = + numero;
        // Forma correta de converter um numero negativo em postivio
        numero = numero * -1;
        System.out.println(numero);

        // Incremento -> numero++ é igual a 'numero + 1'
        numero++;
        System.out.println(numero);

        // Decremento -> numero-- é igual a 'numero - 1'
        numero--;
        System.out.println(numero);

        // Negando uma variável Booleana com '!'
        boolean variavel = true;
        variavel = !variavel;

        System.out.println(variavel);

    }
}
