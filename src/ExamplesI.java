import java.util.Scanner;

public class ExamplesI extends  Exception {

    static void printMatrix(int matrix[][], int nF, int nC) {
        for (int i = 0; i < nF; ++i) {
            for (int j = 0; j < nC; ++j) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main (String [] args)     {

        Scanner scanner = new Scanner(System.in);

       int matriz[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}, {13,14,15,16}};
       int nF = matriz.length;
       int nC =  matriz[0].length;


        try {

            if(nF == nC) {
                System.out.println("Esta matriz es cuadrada");

            }

        }

        catch (Exception e) {

            System.out.println("Esta matriz NO es cuadrada");

        }

        finally {

            printMatrix(matriz, nF, nC);

        }

    }





}

