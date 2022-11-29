package edu.gisele.segundasemana;
public class MinhaClasse {
    
    // Anatomia das Classes 3
    public static void main(String[] args){ 
        String primeiroNome = "Gisele";
        String segundoNome = "Byrne";     

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }



}
