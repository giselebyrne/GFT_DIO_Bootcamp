import javax.swing.*;

//Fazer a divisão de 2 valores inteiros
public class UncheckedException {
      public static void main(String[] args) {

        boolean continueLooping = true;
        do{
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try{
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e){
                //e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Entrada Inválida! Informe um número inteiro." + e.getMessage());
            }catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null,"Impossivel dividir número por zero" + e.getMessage());                            
            }
            finally{
                System.out.println("Chegou no Finally...");
            }
        }while(continueLooping);           

        System.out.println("O código continua...");
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
