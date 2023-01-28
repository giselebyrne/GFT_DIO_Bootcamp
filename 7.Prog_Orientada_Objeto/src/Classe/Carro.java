package Classe;

public class Carro extends Veiculo{
  
    //Boa Prática de Organização de Código
    // 1. Atributos
    // 2. Construtor
    // 3. Get e Set
    // 4. Métodos


    // Exercício da Aula de Atributos
    String cor;
    String modelo;
    int capacidadeTanque;

    //Construtor e Sobrecarga
    Carro(){

    }

    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
        
    }

    //Exercício da Aula de Métodos
    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setcapacidadeTanque(int tanque){
        this.capacidadeTanque = tanque;
    }

    int getcapacidadeTanque(){
        return capacidadeTanque;
    }
    
    double totalValorTanque(double valorGasolina){
        return capacidadeTanque * valorGasolina;
    }       
}
