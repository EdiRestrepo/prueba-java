public class ArrayNumeroMasAlto {
    public static void main(String[] args) {
        int[] myArray = {13, 2, 4, 35, 1,35,50}; // Arreglo de ejemplo

        int maxNumber = myArray[0]; // Asignamos el primer elemento como máximo

        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > maxNumber) {
                maxNumber = myArray[i];
            }
        }

        System.out.println(maxNumber);
    }

}
