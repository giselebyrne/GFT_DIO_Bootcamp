package Heranca;

public class RodarAplicacao {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        // Upcast Ex: De Gerente para Funcionario
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        // Downcast - Apesar de ser permitido, em Java não é bom ser utilizado pois provavelmente exibirá
        // um erro de ClassCast
        // Gerente gerente_ = new Funcionario();
        //Vendedor vendedor1 = (Vendedor) new Funcionario();

    }

}
