package Classe;

public class RodarAplicacao {
    
    public static void main(String[] args) {
        
        Carro carrinho = new Carro();
        carrinho.setCor("rosa");
        carrinho.setModelo("Ford");
        carrinho.setcapacidadeTanque(30);       
        
        System.out.println(carrinho.getCor());
        System.out.println(carrinho.getModelo());
        System.out.println(carrinho.getcapacidadeTanque());

        Carro carro2 = new Carro("Cinza", "Mercedes-Benz Classe C ", 66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getcapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.46));

        System.out.println(carrinho.totalValorTanque(5.6));
        
        
    }
}
