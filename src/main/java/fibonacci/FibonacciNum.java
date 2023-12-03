package fibonacci;
import java.util.Scanner;

public class FibonacciNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fibonacci, n1 = 0, n2 = 1, soma;
        System.out.print("Digite um número para a sequencia de Fibonnacci: ");
        fibonacci = scanner.nextInt();
        System.out.print("\nA Sequencia de Fibonacci é: " + n2);
        
        for(int i = 1; i < fibonacci; i++){
            soma = n1 + n2;
            n1 = n2;
            n2 = soma;
            System.out.print(" " + soma);
        }
    }
}
