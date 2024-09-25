import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static int generateRandomNumber(int minNumber, int maxNumber) {
        
        return (int)(Math.random() * (maxNumber - minNumber + 1)) + minNumber;
    }
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Cria um scanner para capturar entradas do usuário
        System.out.println("Bem-vindo ao Jogo de Adivinhar o número!");
        System.out.println("Insira uma letra a qualquer momento para sair");

        int minNumber, maxNumber;

        try {

            System.out.println("Insira o intervalo minimo para gerar o numero aleatorio");
            minNumber = scanner.nextInt();

            // Validação caso o segundo numero seja menor que o primeiro
            do {
                System.out.println("Insira o intervalo maximo para gerar o numero aleatorio (deve ser maior que o minimo):");
                maxNumber = scanner.nextInt();

                if (maxNumber <= minNumber) {
                    System.out.println("Erro: O número máximo deve ser maior que o número mínimo. Tente novamente.");
                }

            } while (maxNumber <= minNumber);

            // Gera e atibui o numero aleatorio
            int randomNumber = generateRandomNumber(minNumber, maxNumber);

            // Instancia a partida utilizando a classe Game
            Game match = new Game(randomNumber);

            System.out.println("Partida e numero aleatorio gerado, comece com um palpite:");
            
            int attemptNumber = scanner.nextInt();

            System.out.println(randomNumber);
            
        } catch (InputMismatchException e) {
            // Se a entrada não for um número inteiro, sai do jogo
            System.out.println("Você inseriu uma letra! Saindo do jogo...");
        } finally {
            scanner.close(); // Fecha o scanner para liberar o recurso
        }

    }
}