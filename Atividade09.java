package Atividade12;
import java.util.Random;

public class Atividade09 {
    public static void main(String[] args) {
        // Passo 1: Inicializar arrayOriginal com 10 valores aleatórios entre 1 e 100
        int[] arrayOriginal = new int[10];
        Random random = new Random();
        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayOriginal[i] = random.nextInt(100) + 1; // Gera um número aleatório entre 1 e 100
        }

        // Passo 2: Inicializar arrayOrdenado com zeros (valores padrão)
        int[] arrayOrdenado = new int[arrayOriginal.length];

        // Passo 3: Copiar os elementos de arrayOriginal para arrayOrdenado
        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayOrdenado[i] = arrayOriginal[i];
        }

        // Passo 4: Implementar o algoritmo de ordenação Bubble Sort para ordenar arrayOrdenado
        for (int i = 0; i < arrayOrdenado.length - 1; i++) {
            for (int j = 0; j < arrayOrdenado.length - 1 - i; j++) {
                if (arrayOrdenado[j] > arrayOrdenado[j + 1]) {
                    // Troca os elementos de lugar
                    int temp = arrayOrdenado[j];
                    arrayOrdenado[j] = arrayOrdenado[j + 1];
                    arrayOrdenado[j + 1] = temp;
                }
            }
        }

        // Passo 5: Imprimir o conteúdo de arrayOriginal antes da transferência
        System.out.println("Elementos de arrayOriginal antes da transferência:");
        for (int num : arrayOriginal) {
            System.out.print(num + " ");
        }

        // Passo 6: Imprimir o conteúdo de arrayOrdenado após a ordenação
        System.out.println("\n\nElementos de arrayOrdenado após a ordenação:");
        for (int num : arrayOrdenado) {
            System.out.print(num + " ");
        }
    }
}
