import java.util.Scanner;

public class do_while_2 {
    public static void main(String[] args) {
        System.out.println("Insira um valor em graus Celsius e veja como ele é em graus Fahrenheit:");
        Scanner scanner = new Scanner(System.in);
        
        double userCelsius;

        do { 
            System.out.println("Insira o valor '0' para finalizar o Loop");
            userCelsius = scanner.nextDouble();

            if (userCelsius != 0) {
                double valorFahr = (userCelsius * 9 / 5) + 32;
                System.out.println("O valor em fahrenheit de "+userCelsius+" e igual a: "+valorFahr);
            }
        } while (userCelsius != 0);
        scanner.close();
    }
}
