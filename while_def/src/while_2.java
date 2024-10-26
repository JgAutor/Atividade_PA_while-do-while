import java.util.Scanner;

public class while_2 {
    public static void main(String[] args) {
        System.out.println("Quer descobrir a tabuada de qual número? (Insira um número positivo): ");
        Scanner scanner = new Scanner(System.in);
        
        int userNum = scanner.nextInt();
        int index = 1;

        System.out.println("A tabuada do número "+userNum+" e igual a: ");
        while (index <= 10) {
            System.out.println(userNum+" * "+index+" = "+(userNum*index));
            index ++;
        }
        scanner.close();
    }
}
