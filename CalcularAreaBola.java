import java.util.Scanner;
public class CalcularAreaBola {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float raioBola;

        System.out.print("Informe o raio da bola em cm: ");
        raioBola = entrada.nextFloat();

        System.out.println("\u001b[31m===============ANALIZANDO===============\u001b[0m");
        
        System.out.printf("A area total da bola e: %.2fcm²",4 * 3.14159f * (raioBola * raioBola));
    }
}
