public class QtdDenominadorMaiorQueNumeradorException extends Exception {

    private int numerador;

    public QtdDenominadorMaiorQueNumeradorException(String message, int numerador) {
        super(message);
        this.numerador = numerador;
    }
   
}
