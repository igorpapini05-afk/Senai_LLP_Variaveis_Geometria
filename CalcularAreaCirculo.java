import java.util.Scanner;

public class CalcularAreaCirculo {
    public static void main(String[] args) 
    {
        //Scanner leia = new Scanner(System.in);
        float raio = args.length > 0 ? Float.parseFloat(args[0]) : 0;
        //float raio = leia.nextFloat();

        float area = 3.14f*(raio*raio);

        System.out.printf("Area do Circulo e: %.2f\n",area);



    }
}
