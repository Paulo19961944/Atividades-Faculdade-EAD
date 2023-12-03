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
public class SigmaSomaRecursivo {
    public static int SigmaSum(int n){
        if(n == 1){
            return 1;
        } else {
            return n + SigmaSum(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n---------- CALCULO DE SIGMA RECURSIVO ----------\n");
        System.out.print("Digite um Numero para Calcular o Sigma: ");
        int sigmaNum = scanner.nextInt();
        int resultado = SigmaSum(sigmaNum);
        System.out.println("O Sigma calculado é : " + resultado);
        System.out.println("\n---------- FIM DA EXECUÇÃO ----------\n");
    }
}
