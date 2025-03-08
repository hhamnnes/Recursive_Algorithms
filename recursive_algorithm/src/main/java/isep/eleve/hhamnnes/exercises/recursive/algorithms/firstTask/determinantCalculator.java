package isep.eleve.hhamnnes.exercises.recursive.algorithms.firstTask;

public class determinantCalculator {


    public static int det(int a[][]) {

        int numberOfRows = a.length;
        int numberOfColumns = a[0].length;

        if (!squareMatrix(numberOfColumns, numberOfRows)) {
            throw new IllegalArgumentException("The matrix must be a square");
        }

        

        

    }

    public static boolean squareMatrix(int numberOfColumns,
                                       int numberOfRows) {
        int sideLength = numberOfColumns + numberOfRows;

        if(sideLength % 2 == 0) return true;
        else return false;

    }
    
}
