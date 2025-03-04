package numeroaleatorio;
import java.util.Random;
import java.util.Scanner;

public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        System.out.println("Escolha o intervalo em que será gerado o número");


        Scanner pergunta = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = pergunta.nextInt();


        System.out.println("Digite o segundo número: ");
        int num2 = pergunta.nextInt();

        Random random = new Random();
        int numeroAleatorio = random.nextInt(num1, num2);

        System.out.println("Número gerado: " + numeroAleatorio);

        pergunta.close();
        
        }
}