import java.util.Scanner;
public class CalcularAreaRetangulo{
    public static void main(String[] args) 
    {
        Scanner leia = new Scanner(System.in);
        float baseRetangulo = 0, alturaRetangulo = 0;
        
        System.out.print("Digite a Base do Retangulo: ");
        baseRetangulo = leia.nextFloat();

        System.out.print("Digite a Altura do Retangulo: ");
        alturaRetangulo = leia.nextFloat();
        leia.close();

        System.out.printf("A Area do Retangulo e: %.2f/n",(baseRetangulo*alturaRetangulo));
    }

}