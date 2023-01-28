public class SobrecargaReturn {

    public static double areaRetorno(double lado){
        return lado * lado;
        //System.out.println("Área do Quadrado: " + lado*lado);
    }

    public static double areaRetorno(double lado1, double lado2){
        return lado1 * lado2;
        //System.out.println("Área do Triângulo: " + lado1*lado2);
    }

    public static double areaRetorno(double baseMaior, double baseMenor, double altura){
        return (baseMaior + baseMenor) * altura/2;
        //System.out.println("Área do Trapézio: " + ((baseMaior+baseMenor)*altura)/2);
    }
    
}
