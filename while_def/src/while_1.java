import java.util.Scanner;

public class while_1 {
    public static void main(String[] args) throws Exception {
        // Oq fazer no trampo ;)
        System.out.println("Insira apenas números inteiros para calculo (Digite '0' ou negativo para finalizar o loop):");
        Scanner scanner = new Scanner(System.in);
        // Armazenamento e entrada dos dados.
        int userNum;
        int sum = 0;
        // Processamento.
        while (true) {
            userNum = scanner.nextInt();
            if (userNum <= 0) {
                break;
            }
            sum += userNum;
        }
        // Saida.
        System.out.println("A soma dos números positivos inserido e de: "+sum);
        scanner.close();
    }
}