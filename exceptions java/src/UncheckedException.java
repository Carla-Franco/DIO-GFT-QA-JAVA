import javax.swing.JOptionPane;

//Fazer a divisão de 2 valores inteiros
public class UncheckedException {
    
    public static void main(String[] args) {

        boolean continueLooping = true;
        do {

            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {

                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;

            } catch (NumberFormatException e) {
                // e.printStackTrace();
               JOptionPane.showMessageDialog(null, "Entrada invalida, informe um numero inteiro! " + e.getMessage());
            } catch (ArithmeticException e) {
                // e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Impossivel dividir um numero por 0!");
            } finally {
                System.out.println("Chegou no finally!");
            }

        } while(continueLooping);
        
        

        System.out.println("O código continua...");
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}