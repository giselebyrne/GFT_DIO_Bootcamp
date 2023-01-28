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

        int a, b;

        a = 5;
        b = 6;

        // EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        // String resultado = "";
        // if (a == b)
        // resultado = "verdadeiro";
        // else
        // resultado = "falso";

        // Operador Ternario
        String resultadoS = a == b ? "verdadeiro" : "falso";
        int resultado = a == b ? 1 : 2;
        System.out.println(resultadoS);
        System.out.println(resultado);

        // Operador Relacional
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        if(numero1 < numero2){
            System.out.println("A nossa condição é verdadeira!");
        }

        System.out.println("Numero 1 é igual a numero 2? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("Numero 1 é diferente a numero 2? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("Numero 1 é maior que numero 2? " + simNao);

        simNao = numero1 >= numero2;
        System.out.println("Numero 1 é maior ou igual a numero 2? " + simNao);

        String nomeUm = "Gisele";
        //String nomeDois = "Gisele";
        //System.out.println(nomeUm == nomeDois);
        String nomeDois = new String("Gisele");
        System.out.println(nomeUm.equals(nomeDois));

        // Operadores  Lógicos && -> 'e' ... || -> 'ou'
        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && condicao2){
        System.out.println("As duas condições são verdadeiras!");
        }
        
    }
}
