package fibonacci;
import java.util.Scanner;

public class FibonacciRecursivo {
    public static int fibonacci(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        System.out.print("Digite a quantidade de termos na série: ");
        n = scanner.nextInt();
        
        System.out.println("\nA Sequência de Fibonacci é: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
