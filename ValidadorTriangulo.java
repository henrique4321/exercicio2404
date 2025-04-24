import java.util.Scanner;

public class ValidadorTriangulo{
    public static void main(String[] args) {
        //Declaração de variaveis
        int a, b, c; //lados do triangulo

        //criação e instãncia do objeto de entrada
        Scanner entrada = new   Scanner(System.in);

        //Apresentação
        System.out.println("\n\t\t\t -- Validador de Triãngulo -- \n");

        //Entradas
        System.out.println("Informe o lado a: ");
        a = entrada.nextInt();
        System.out.println("Informe o lado b");
        b = entrada.nextInt();
        System.out.println("Informe o lado c");
        c = entrada.nextInt();

        //Processamento
        if((a < (b+c)) && (b<(a+c)) && (c<(a+b))){
            //É triângulo
            System.out.printf("\n%d, %d e %d formam triângulo!\n", a, b, c);
        } else {
            //Não é triângulo
            System.out.printf("\n%d, %d e %d NÃO formam triângulo!\n", a, b, c);

        }

    }
}