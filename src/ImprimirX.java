

public class ImprimirX {
    public static void main(String[] args) {
        int n = 6; // Tamaño de la letra (n x n)

        if (n == 0) {
            System.out.println("ERROR");
        } else {
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < n; col++) {
                    if (col == row || col == (n - 1 - row)) {
                        System.out.print("X");
                    } else {
                        System.out.print("_");
                    }
                }
                System.out.println();
            }
        }
    }
}