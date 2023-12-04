package BubbleSort;

public class BubbleSortMethod {
    static final int TAMANHO = 10;

    public static void main(String[] args) {
        int[] v = {30, 20, 50, 60, 80, 40, 70, 10, 90, 100};

        System.out.print("Array original: ");
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();

        bolha(v, TAMANHO);

        System.out.print("Array ordenado: ");
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    static void bolha(int[] v, int tamanho) {
        boolean troca;
        int i, j;
        int aux;

        for (i = 0; i < tamanho - 1; i++) {
            troca = false;
            for (j = 0; j < tamanho - i - 1; j++) {
                if (v[j] > v[j + 1]) {
                    aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                    troca = true;
                }
            }
            System.out.print("Passo " + (i + 1) + ": ");
            for (int k = 0; k < tamanho; k++) {
                System.out.print(v[k] + " ");
            }
            System.out.println();

            // Se não houve trocas, a lista já está ordenada, então podemos sair do loop
            if (!troca) {
                break;
            }
        }
    }
}
