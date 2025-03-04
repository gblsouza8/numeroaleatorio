package numeroaleatorio;
import java.util.Random;
import java.util.Scanner;

public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        // Especifica ao usuário o que ele terá que fazer a seguir
        System.out.println("Escolha o intervalo em que será gerado o número");

        // Inicializa o scanner, faz a pergunta e armazena o numero escolhido na variável num1
        Scanner pergunta = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = pergunta.nextInt();

        // Faz a pergunta novamente e armazena o numero escolhido na variável num2
        System.out.println("Digite o segundo número: ");
        int num2 = pergunta.nextInt();

        // Inicializa o objeto da classe Random e armazena um número aleatório dentro do intervalo na variável numeroAleatorio
        Random random = new Random();
        int numeroAleatorio = random.nextInt(num1, num2);

        // Exibe o número gerado
        System.out.println("Número gerado: " + numeroAleatorio);

        // Fecha o scanner
        pergunta.close();
        
        }
}