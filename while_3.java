import java.util.Scanner;

public class while_3 {
    public static void main(String[] args) {
        System.out.println("Sistema de advinhação de números (Tente advinhar o número com palpites):");
        Scanner scanner = new Scanner(System.in);

        int numAdv = 33;
        int numTentativa = 0;
        int tent = 0;

        while (tent != numAdv) {
            tent = scanner.nextInt();
            numTentativa ++;

            if (tent > numAdv) {
                System.out.println("O número "+tent+" inserido pelo usuário é maior que o número a ser advinhado:");
            } else if (tent < numAdv) {
                System.out.println("O número "+tent+" inserido pelo usuário é menor que o número a ser advinhado:");                
            }
        }
        
        System.out.println("Muito bem! Você acertou o número oculto! Que era: "+numAdv+" com "+numTentativa+" tentativas:");
        scanner.close();
    }
}
