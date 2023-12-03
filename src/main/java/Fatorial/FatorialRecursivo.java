package Fatorial;
import java.util.Scanner;

public class FatorialRecursivo {
    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n---------- CALCULO FATORIAL RECURSIVO ----------\n");
        System.out.print("Digite um número para calcular o fatorial: ");
        int num = scanner.nextInt();
        System.out.println("O Fatorial de " + num + " é: " + fatorial(num));
        System.out.println("\n---------- FIM DA EXECUÇÃO ----------\n");
    }
}
