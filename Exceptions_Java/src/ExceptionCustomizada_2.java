import javax.swing.*;
import java.io.*;

public class ExceptionCustomizada_2 {

    public static void main(String[] args) {
        int[] numerador = { 4, 5, 8, 10, }; // 4,5,8,10
        int[] denominador = { 2, 4, 0, 2, 8 }; // 2,4,0,2,8

        for (int i = 0; i < denominador.length; i++) {
            try {
                if (i >= numerador.length) {
                    throw new QtdDenominadorMaiorQueNumeradorException("Error Fatal! Qtd de Denominadores e Numeradores tem que ser igual!", i);
                } else if (numerador[i] % 2 != 0) {
                    throw new DivisaoNaoExataException("Divisao nao exata!", numerador[i], denominador[i]);
                } else if (denominador[i] == 0) {
                    throw new DivisaoPorZeroException("Divisao por zero", numerador[i], denominador[i]);
                }
                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            } catch (QtdDenominadorMaiorQueNumeradorException | DivisaoNaoExataException | DivisaoPorZeroException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        System.out.println("O programa continua...");
    }
}
