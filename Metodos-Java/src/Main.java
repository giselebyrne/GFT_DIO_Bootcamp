public class Main {
    public static void main(String[] args) {

        System.out.println("Exercício da Calculadora: \n");
        Calculadora.somarValor(5,10);
        Calculadora.diminuirValor(58, 8);
        Calculadora.multiplicarValor(10, 9);
        Calculadora.diminuirValor(10, 2.5);


        System.out.println("Exercício da Mensagem: ");
        Mensagem.saudacao();
        Mensagem.saudacao();
        Mensagem.saudacao();

        System.out.println("Exercício do Empréstimo: ");
        Emprestimo.calcularEmprestimo(45.5, Emprestimo.getDuasParcelas());
        Emprestimo.calcularEmprestimo(12, Emprestimo.getTresParcelas());
        Emprestimo.calcularEmprestimo(5, 5);

        System.out.println("Exercício de Sobrecarga: ");
        Sobrecarga.area(25);
        Sobrecarga.area(10, 5, 3);
        Sobrecarga.area(25.2, 10.7);

        System.out.println("Exercício de Sobrecarga Return: ");
        System.out.println("Área do Quadrado: " + SobrecargaReturn.areaRetorno(15) ); 
        System.out.println("Área do Triângulo: " + SobrecargaReturn.areaRetorno(15.2, 11.2));

        double areaTrapezio = SobrecargaReturn.areaRetorno(10, 5, 2.5);
        System.out.println("Área do Trapézio: " + areaTrapezio);
    }   

}
