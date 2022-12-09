
import javax.swing.*;
import java.io.*;

public class ExceptionCustomizada_1 {
    public static void main(String[] args) {
        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");

        imprimirArquivoNoConsole(nomeDoArquivo);
        System.out.println("\nCom exception ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) {

        try {
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();
        } catch (ImpossivelAberturaDeArquivo2Exception e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage());
            e.printStackTrace();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro não esperado, por favor, fale com o suporte." + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivo2Exception {
        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException e) {
            throw new ImpossivelAberturaDeArquivo2Exception(file.getName(), file.getPath());
        }
    }
}

// class ImpossivelAberturaDeArquivoException extends Exception {

//     private String nomeDoArquivo;
//     private String diretorio;

//     public ImpossivelAberturaDeArquivoException(String nomeDoArquivo, String diretorio) {
//         super("O arquivo " + nomeDoArquivo + " não foi encontrado no diretório " + diretorio);
//         this.nomeDoArquivo = nomeDoArquivo;
//         this.diretorio = diretorio;
//     }

    /*@Override
    public String toString() {
        return "ImpossivelAberturaDeArquivoException{" +
                "nomeDoArquivo='" + nomeDoArquivo + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }*/

//}

    
class ImpossivelAberturaDeArquivo2Exception extends Exception{
    private String NomeDoArquivo;   
    private String diretorio;

    public ImpossivelAberturaDeArquivo2Exception(String nomeDoArquivo, String diretorio) {
        super("O arquivo " + nomeDoArquivo + " não foi encontrado no diretorio! " + diretorio);
        NomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
    }

    // @Override
    // public String getMessage() {        
    //     return "Teste de Override do método mensagem";
    // }

    // @Override
    // public String toString() {
    //     return "ImpossivelAberturaDeArquivo2Exception [NomeDoArquivo=" + NomeDoArquivo + ", diretorio=" + diretorio
    //             + "]";
    // }  
}
