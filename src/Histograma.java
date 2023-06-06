/*
import java.util.HashMap;

public class Histograma {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 1, 3, 3, 1, 2, 1, 5, 1};
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Calcular la frecuencia de cada número en el arreglo
        for (int num : myArray) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Imprimir el histograma
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ": ");

            // Obtener la frecuencia del número o 0 si no está presente en el arreglo
            int frequency = frequencyMap.getOrDefault(i, 0);

            // Imprimir asteriscos según la frecuencia
            for (int j = 0; j < frequency; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
*/
public class Histograma {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 1, 3, 3, 1, 2, 1, 5, 1};
        int[] frequencyArray = new int[6]; // El índice 0 no se utiliza, por eso se crea con tamaño 6

        // Calcular la frecuencia de cada número en el arreglo
        for (int num : myArray) {
            frequencyArray[num]++;
        }

        // Imprimir el histograma
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ": ");

            // Obtener la frecuencia del número
            int frequency = frequencyArray[i];

            // Imprimir asteriscos según la frecuencia
            for (int j = 0; j < frequency; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
