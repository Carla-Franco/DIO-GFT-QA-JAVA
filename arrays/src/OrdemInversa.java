/*
 * Crie um vetor de 6 números inteiros
 * e mostre-os na ordem inversa.
 */

public class OrdemInversa {

    public static void main(String[] args) {
        
        int[] vetor = {-5, -6, 15, 50, 8, 4};
        int contador = 0;

        System.out.println("Vetor: ");
        while(contador <= (vetor.length -1)) {

            System.out.print(vetor[contador] + " ");
            contador++;

        }

        System.out.println("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0; i--) {

            System.out.print(vetor[i] + " ");

        }
    }

}