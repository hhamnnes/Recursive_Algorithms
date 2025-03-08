package isep.eleve.hhamnnes.exercises.recursive.algorithms.firstTask;

public class determinantCalculator {


    public static int det(int a[][]) {

        int numberOfRows = a.length;
        int numberOfColumns = a[0].length;

        if (!squareMatrix(numberOfColumns, numberOfRows)) {
            throw new IllegalArgumentException("The matrix must be a square");
        }

        if(numberOfColumns == 1) {
            return a[0][0];
        }

        else {

            for (int i = 0, j = 0; i < numberOfColumns; i++, j++){

                

            }

        }

    }

    public static boolean squareMatrix(int numberOfColumns,
                                       int numberOfRows) {

        if(numberOfRows % 2 == 0 && numberOfColumns == numberOfRows) return true;
        else return false;

        if()

    }
    
}
