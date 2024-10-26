import java.util.Scanner;

public class do_while_1 {
    public static void main(String[] args) {
        System.out.println("");
        Scanner scanner = new Scanner(System.in);

        int userNum;

        do {
            System.out.println("***MENU***");
            System.out.println("Opção 1: Adcionar;");
            System.out.println("Opção 2: Remover;");
            System.out.println("Opção 3: Sair;");
            
            userNum = scanner.nextInt();
            
            switch (userNum) {
                case 1:
                    System.out.println("Opção 'Adicionar' escolhida:");
                    break;    
                case 2:
                    System.out.println("Opção 'Remover' escolhida:");
                    break;    
                case 3:
                    System.out.println("Opção 'Sair' escolhida:");
                    break;
                default:
                    System.out.println("Escolha um valor Valido do 'Menu':");
            }   
        } while (userNum != 3);
        System.out.println("Você saiu do Loop!");
        scanner.close();
    }
}
