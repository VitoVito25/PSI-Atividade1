import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static int generateRandomNumber(int minNumber, int maxNumber) {
        
        return (int)(Math.random() * (maxNumber - minNumber + 1)) + minNumber;
    }

    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                // Comando para limpar o console no Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Comando para limpar o console no Unix/Linux/MacOS
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Erro ao limpar o console.");
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Cria um scanner para capturar entradas do usuário
        clearConsole();
        System.out.println("Bem-vindo ao Jogo de Adivinhar o número!");
        System.out.println("Insira uma letra a qualquer momento para sair");

        int minNumber, maxNumber;
        boolean playAgain = true;

        while(playAgain) {
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
    
                System.out.printf("Partida e numero aleatorio entre %d e %d gerado! \n", minNumber, maxNumber);
                System.out.println(randomNumber);
                
                do {
                    System.out.println("De um palpite sobre qual o numero aleatório: ");
                    int attemptNumber = scanner.nextInt();
                    match.setAttemptNumber(attemptNumber);
                    match.tryAttempt(attemptNumber);
    
                } while (!match.isFinished());
                
                System.out.println("PARABENS VOCÊ ACERTOU O NUMERO!!!");
                System.out.printf("O numero era: %d \n", randomNumber);
                System.out.printf("Você acertou em %d tentativas! \n", match.getAttemptCount());
                System.out.println("Deseja jogar novamente? (Digite qualquer número para sim ou uma letra para sair): ");
                scanner.nextInt();
                clearConsole();
                
            } catch (InputMismatchException e) {
                // Se a entrada não for um número inteiro, sai do jogo
                System.out.println("Você inseriu uma letra! Saindo do jogo...");
                playAgain = false;
            }
        }
        scanner.close(); // Fecha o scanner para liberar o recurso
    }
}