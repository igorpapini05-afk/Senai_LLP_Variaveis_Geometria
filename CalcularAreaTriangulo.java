import java.util.Scanner;
public class CalcularAreaTriangulo{
    public static void main(String[] args) 
    {
        Scanner leia = new Scanner(System.in);
        float baseTriangulo = 0, alturaTriangulo = 0;

        System.out.print("Digite a Base do Triangulo: ");
        baseTriangulo = leia.nextFloat();

        System.out.print("Digite a Altura do Triangulo: ");
        alturaTriangulo = leia.nextFloat();
        leia.close();

        System.out.printf("A Base do Triangulo e: %.2f\n",(alturaTriangulo*baseTriangulo)/2f);
        
    }

}