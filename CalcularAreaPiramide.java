import java.util.Scanner;
public class CalcularAreaPiramide {
    public static void main(String[] args) 
    {
        Scanner leia = new Scanner(System.in);
        float ladoB, aux;

        System.out.print("Informe o tamanho em cm do lado da base da piramide: ");
        ladoB = leia.nextFloat();

        System.out.print("Informe o apotema da piramide (altura inclinada): ");
        aux = leia.nextFloat();

        aux = (ladoB*ladoB)+((ladoB*4)*aux)/2;

        System.out.println("\u001B[33m===============ANALIZANDO===============\u001B[0m");

        System.out.printf("A area total da piramide e: %.2fcm²",aux);
    }
    
}
