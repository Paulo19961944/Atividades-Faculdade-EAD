/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sigma;
import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class SigmaSoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n---------- CALCULO DE SIGMA ----------\n");
        System.out.print("Digite um número para o calculo do Sigma: ");
        int sigma = scanner.nextInt();
        int sigmaSum = 0;
        
        for(int i = 1; i <= sigma; i++){
            sigmaSum += i;
        }
        System.out.println("O Valor do Sigma é: " + sigmaSum);
        System.out.println("\n---------- FIM DA EXECUÇÃO ----------\n");
    }
}
