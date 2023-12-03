package somavetor;

public class SomaVetorRecursivo {
    static int[] vetor = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    static int n = 10;

    public static int sumVet(int[] vetor, int n) {
        if (n == 0) {
            return vetor[0];
        } else {
            return vetor[n] + sumVet(vetor, n - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println("\n---------- SOMA DE VETORES RECURSIVO ----------");
        System.out.print("\nA soma dos vetores é: ");
        System.out.print(" " + sumVet(vetor, n - 1)); 
        System.out.println("\n\n---------- FIM DA EXECUÇÃO ----------\n");
    }
}
