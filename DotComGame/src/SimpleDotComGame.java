import java.util.Scanner;

public class SimpleDotComGame {
    public static void main(String[] args) {
        // Cria uma instância do jogo
        SimpleDotCom dot = new SimpleDotCom();

        // Define posições fixas para o "navio" (poderia ser aleatório)
        int[] locations = {2, 3, 4};  // Exemplo: ocupa posições 2, 3 e 4
        dot.setLocationCells(locations);

        // Cria Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Boas-vindas
        System.out.println("Bem-vindo ao SimpleDotCom!");
        System.out.println("Tente afundar o navio (3 células) com o menor número de palpites!");

        // Contador de tentativas
        int numOfGuesses = 0;

        // Loop principal do jogo
        boolean isAlive = true;
        while(isAlive) {
            System.out.print("Digite um número como palpite: ");
            String userGuess = scanner.nextLine();

            // Incrementa contador de tentativas
            numOfGuesses++;

            // Verifica o palpite
            String result = dot.checkYourSelf(userGuess);

            // Verifica se o jogo terminou
            if(result.equals("kill")) {
                isAlive = false;
                System.out.println("Você afundou o navio!");
                System.out.println("Número de tentativas: " + numOfGuesses);
            }
        }

        // Fecha o scanner
        scanner.close();
    }
}