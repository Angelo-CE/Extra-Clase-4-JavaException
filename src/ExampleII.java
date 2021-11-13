import java.util.InputMismatchException;
import java.util.Scanner;

public class ExampleII {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bool;

        try {
            //Arreglar
            System.out.println("Ingresar un número booleano");
            bool = scanner.nextInt();
            if(bool==1 || bool ==0) {
                System.out.println("El número ingresado: " + bool + " es booleano");
            }
            System.out.println("Este valor es entero pero debe se booleano");

        } catch (InputMismatchException ex) {
            System.out.println("Ingrese un número verdaderamente entero y que sea booleano");
        }

    }
}
