public class NumeroDeOcurrenciasSeguidas {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 2, 4, 5, 6, 7, 8, 8, 8};
        int longestNumber = 0;
        int longestCount = 0;

        int currentNumber = 0;
        int currentCount = 0;

        for (int num : myArray) {
            if (num == currentNumber) {
                currentCount++;
            } else {
                if (currentCount > longestCount) {
                    longestNumber = currentNumber;
                    longestCount = currentCount;
                }

                currentNumber = num;
                currentCount = 1;
            }
        }

        // Comprobar si la última secuencia es la más larga
        if (currentCount > longestCount) {
            longestNumber = currentNumber;
            longestCount = currentCount;
        }

        System.out.println("Longest: " + longestCount);
        System.out.println("Number: " + longestNumber);
    }
}
