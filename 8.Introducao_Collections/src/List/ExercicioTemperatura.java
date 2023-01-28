package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

public class ExercicioTemperatura {
    public static void main(String[] args) {
        List<Temperatura> temp = new ArrayList<>();  

        for(int i = 0; i < 6; i++){
            Temperatura tempX = new Temperatura(i, i);
            tempX.setMes(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o Mês: ")));
            tempX.setTemperatura(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a média da Temperatura: ")));
            
            temp.add(tempX);            
        }
        System.out.println(temp);

        Iterator<Temperatura> iteratorMedia = temp.iterator();
            Double soma = 0d;
            int count = 0;
            while(iteratorMedia.hasNext()){
                Temperatura next = iteratorMedia.next();
                soma += next.getTemperatura();
                count++;

                if(next.getTemperatura() <= soma/count){
                    iteratorMedia.remove();                    
                }           
            
        };

        System.out.println("A media das Temperaturas no Semestre eh: " + soma/count);
        System.out.println("Temperatura Mensal acima da Media Semestral: " + temp);
    }
    
}

class Temperatura{

    private double temperatura;
    private int mes;
    
    public Temperatura(double temperatura, int mes) {
        this.temperatura = temperatura;
        this.mes = mes;
    }
    public double getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    @Override
    public String toString() {
        switch(mes){
            case 1:
            return "Temperatura Media de Janeiro eh: " + temperatura;
            case 2:
            return "Temperatura Media de Fevereiro eh: " + temperatura;
            case 3:
            return "Temperatura Media de Marco eh: " + temperatura;
            case 4:
            return "Temperatura Media de Abril eh: " + temperatura;
            case 5:
            return "Temperatura Media de Maio eh: " + temperatura;
            case 6:
            return "Temperatura Media de Junho eh: " + temperatura;
        }
        return null;
       }

}