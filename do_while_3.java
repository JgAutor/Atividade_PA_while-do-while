import java.util.Scanner;

public class do_while_3 {
    public static void main(String[] args) {
        System.out.println("Sistema de contagem regressiva:");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira um número para a contagem regressiva apartir do mesmo:");
        int userNum = scanner.nextInt();        
        
        do {
            System.out.println(userNum);
            userNum--;
        } while (userNum != 0);
        System.out.println("BOM!!!!!!");
        scanner.close();
    }
}
