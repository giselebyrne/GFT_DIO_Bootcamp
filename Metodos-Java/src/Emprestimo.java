public class Emprestimo {

    public static int getDuasParcelas(){
        return 2;
    }

    public static int getTresParcelas(){
        return 3;
    }

    public static double getTaxaDuas(){
        return 0.3;
    }

    public static double getTaxaTres(){
        return 4.5;
    }

    public static void calcularEmprestimo(double valor, int parcela){
        if(parcela == 2){
            double valorFinal = valor + (valor * Emprestimo.getDuasParcelas());
            System.out.println(" O valor Final para um Emprestimo com duas parcelas é: " + valorFinal );        
        } else if (parcela == 3){
            double valorFinal = valor + (valor * Emprestimo.getTaxaTres());
            System.out.println(" O valor Final para um Emprestimo com três parcelas é: " + valorFinal ); 
        } else {
            System.out.println("Quantidade de Parcelas não é válida!!!!");
        }
    }    
}
