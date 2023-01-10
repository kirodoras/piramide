import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número inteiro: ");
            int num1 = scanner.nextInt();
            System.out.println("Num1: " + num1);
            System.out.print("Digite o segundo número inteiro: ");
            int num2 = scanner.nextInt();
            System.out.println("Num2: " + num2);

            if (num2 < num1) {
                int aux = num1;
                num1 = num2;
                num2 = aux;
            }
            
            for (int i = num1; i <= num2; i++) {
                String numbers = "";
                for (int j = 1; j <= i; j++) {
                    numbers += i;
                }
                System.out.println(numbers);
            }
        } catch (InputMismatchException e) {
            System.out.println("O valor informado não é um número!");
        }
    }
}
