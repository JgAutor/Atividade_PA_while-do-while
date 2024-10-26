import java.util.Scanner;

public class do_while_4 {
    public static void main(String[] args) {
        System.out.println("Sistema de contagem de números ímpares:");
        Scanner scanner = new Scanner(System.in);

        int userNum;
        int countImpar = 0;
        int countPar = 0;

        do { 
            userNum = scanner.nextInt();
            if (userNum != 0) {
                if (userNum %2 != 0) {
                    countImpar ++;
                } else {
                    countPar ++;
                }
            }
        } while (userNum!= 0);

        System.out.println("A quantidade de números ímapares inseridos e dê: "+countImpar+" e a quantidade de números pares de dê: "+countPar);
    }
}