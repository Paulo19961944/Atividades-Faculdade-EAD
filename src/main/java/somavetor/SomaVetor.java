package somavetor;

public class SomaVetor {
    public static void main(String[] args) {
        int vetor[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; 
        int soma = 0;
        System.out.println("\n---------- SOMA DE VETORES ---------- \n");
        System.out.print("Vetor: ");
        for (int somaVet : vetor) {
            System.out.print(somaVet + " ");
            soma += somaVet;
        }
        System.out.println("\nA soma do vetor é: " + soma);
        System.out.println("\n---------- FIM DA EXECUÇÃO ---------\n");
    }
}
