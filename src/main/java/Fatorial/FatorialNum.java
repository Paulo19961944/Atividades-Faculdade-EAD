package Fatorial;
import java.util.Scanner;

public class FatorialNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n---------- CALCULO DE FATORIAL ----------\n");
        System.out.print("Digite um número para calcular o Fatorial: ");
        int num = scanner.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        System.out.println("O Fatorial de " + num + " é: " + fatorial);
        System.out.println("\n---------- FIM DA EXECUÇÃO ----------\n");
    }
}
