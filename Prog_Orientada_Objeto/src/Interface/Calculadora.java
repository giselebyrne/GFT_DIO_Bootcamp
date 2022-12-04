package Interface;

public class Calculadora implements OperacaoMatematica{

    @Override
    public void soma(double num1, double num2){
        System.out.println("Soma: " + (num1 + num2);
    }

    @Override
    public void subtracao(double num1, double num2){
        System.out.println("Subtracao: " + (num1 - num2));
    }

    @Override
    public void multiplicacao(double num1, double num2){
        System.out.println("Multiplicacao: " + (num1 * num2));
    }

    @Override
    public void divisao(double num1, double num2){
        System.out.println("Divisao: " + (num1/num2));
    }
    
}
