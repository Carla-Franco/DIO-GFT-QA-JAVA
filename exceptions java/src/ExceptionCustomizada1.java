import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class ExceptionCustomizada1 {

    public static void main(String[] args) {
        
        String nomeArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido");

        imprimirArquivoConsole(nomeArquivo);
        System.out.println("\nCom exception ou não, o programa continua...");
    }

    public static void imprimirArquivoConsole(String nomeArquivo) {

        try {
            BufferedReader br = lerArquivo(nomeArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            bw.close();
        } catch (ImpossivelAberturaArquivoException e) {
            JOptionPane.showMessageDialog(null,
                    "" + e.getMessage());
            e.printStackTrace();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro não esperado, por favor, fale com o suporte." + ex.getMessage());
            ex.printStackTrace();
        }    
        
    }

    public static BufferedReader lerArquivo(String nomeArquivo) throws ImpossivelAberturaArquivoException {
        File file = new File(nomeArquivo);
        try {
            return new BufferedReader(new FileReader(nomeArquivo));
        } catch (FileNotFoundException e) {
            throw new ImpossivelAberturaArquivoException(file.getName(), file.getPath());
        }   
    } 
}

class ImpossivelAberturaArquivoException extends Exception {

    private String nomeArquivo;
    private String diretorio;
    
    public ImpossivelAberturaArquivoException(String nomeArquivo, String diretorio) {
        super("O arquivo " + nomeArquivo + " nao foi encontrado no diretorio " + diretorio);
        this.nomeArquivo = nomeArquivo;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "ImpossivelAberturaArquivoException [nomeArquivo=" + nomeArquivo + ", diretorio=" + diretorio + "]";
    }
}
