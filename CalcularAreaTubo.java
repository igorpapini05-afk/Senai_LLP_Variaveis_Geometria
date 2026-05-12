import java.util.Scanner;
public class CalcularAreaTubo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float raioB, altura;

        System.out.print("Informe o raio da base do Tubo em cm: ");
        raioB = leia.nextFloat();

        System.out.print("Informe a altura do Tubo em cm: ");
        altura = leia.nextFloat();

        System.out.println("\u001b[32m===============ANALIZANDO===============\u001b[0m");
        
        System.out.printf("Area total do tubo e: %.2fcm²",(2 * 3.14159f * (raioB * raioB) 
                                                                 + 2 * 3.14159f * (raioB * altura)));
    }
    
}
