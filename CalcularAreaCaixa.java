import java.util.Scanner;
public class CalcularAreaCaixa {
    public static void main(String[]args)
    {
        Scanner leia = new Scanner(System.in);
        float lado;
        
        System.out.print("Informe o tamanho de um dos lados da caixa em cm: ");
        lado = leia.nextFloat();
        leia.close();

        System.out.println("\u001B[33m===============ANALIZANDO===============\u001B[0m");

        System.out.printf("Area total da caixa = %.2fcm²\n",(lado*lado)*6);
    }
    
}
