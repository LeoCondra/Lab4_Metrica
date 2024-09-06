import java.util.Random;

public class OrdenadorAleatorio {

    public static void main(String[] args) {
        int[] numeros = new int[100];
        Random rand = new Random();
        
        for (int i = 0; i <= 100; i++) {
            numeros[i] = rand.nextInt(1000); 
        }

        // Ordenando o vetor
        ordenar(numeros);

        // Imprimindo o vetor ordenado
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }

    public static void ordenar(int[] vetor) {
        // Algoritmo de ordenação simples (Bubble Sort)
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    // Trocar os elementos
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }
    }
}
