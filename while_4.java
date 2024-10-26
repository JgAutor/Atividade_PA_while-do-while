import java.util.Scanner;

public class while_4 {
    public static void main(String[] args) {
        System.out.println("Sistema de exibição de números pares abaixo do número inserido:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Isira um número inteiro:");
        int userNum = scanner.nextInt();
        int index = 1;
        int count = 0;

        System.out.println("Números pares até o número inserido "+userNum+":");
        while (index <= userNum) { 
            if (index % 2 == 0) {
                System.out.println(index);
                count ++;
            }
            index++;
        }
        System.out.println("Há "+count+" números pares nesse intervalo:");
        scanner.close();
    }    
}
