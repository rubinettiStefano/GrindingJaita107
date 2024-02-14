package esercizi;

import java.util.Random;

public class Generatore 
{
     public static char[][] generaMatriceRigaConCane() {
        char[][] matrix = new char[5][5];
        Random random = new Random();

        // Generazione della posizione casuale per la sequenza "cane"
        int row = random.nextInt(5);
        int position = random.nextInt(2);

        // Riempimento della riga con la sequenza "cane"
        matrix[row][position] = 'c';
        matrix[row][position + 1] = 'a';
        matrix[row][position + 2] = 'n';
        matrix[row][position + 3] = 'e';

        // Riempimento degli altri elementi della riga con caratteri alfabetici casuali
        for (int j = 0; j < 5; j++) {
            if (matrix[row][j] == 0) {
                matrix[row][j] = (char) (random.nextInt(26) + 'a');
            }
        }

        // Riempimento delle altre righe con caratteri alfabetici casuali
        for (int i = 0; i < 5; i++) {
            if (i != row) {
                for (int j = 0; j < 5; j++) {
                    matrix[i][j] = (char) (random.nextInt(26) + 'a');
                }
            }
        }

       return matrix;
    }

    public static char[][] generaMatriceRigaSenzaCane() {

        char[][] matrix = new char[5][5];
        Random random = new Random();

        // Riempimento della matrice con caratteri alfabetici casuali
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = (char) (random.nextInt(26) + 'a');
            }
        }

        return matrix;
    }

    public static char[][] generaMatriceColonnaConCane() {

        char[][] matrix = new char[5][5];
        Random random = new Random();

        // Generazione della posizione casuale per la sequenza "cane"
        int col = random.nextInt(5);
        int position = random.nextInt(2);

        // Riempimento della colonna con la sequenza "cane"
        matrix[position][col] = 'c';
        matrix[position + 1][col] = 'a';
        matrix[position + 2][col] = 'n';
        matrix[position + 3][col] = 'e';

        // Riempimento degli altri elementi della colonna con caratteri alfabetici casuali
        for (int i = 0; i < 5; i++) {
            if (matrix[i][col] == 0) {
                matrix[i][col] = (char) (random.nextInt(26) + 'a');
            }
        }

        return matrix;
    }
}
