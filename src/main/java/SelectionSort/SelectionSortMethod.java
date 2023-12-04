package SelectionSort;

public class SelectionSortMethod {
    static final int TAMANHO = 10;

    public static void main(String[] args) {
        int[] v = {30, 20, 50, 60, 80, 40, 70, 10, 90, 100};

        System.out.print("Lista Inicial: ");
        printArray(v);

        selecao(v);

        System.out.print("Lista Ordenada: ");
        printArray(v);
    }

    static void printArray(int[] v) {
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    static void selecao(int[] v) {
        int i, j, aux, minimo, pos_minimo;

        for (i = 0; i < TAMANHO - 1; i++) {
            minimo = v[i];
            pos_minimo = i;

            for (j = i + 1; j < TAMANHO; j++) {
                if (minimo > v[j]) {
                    minimo = v[j];
                    pos_minimo = j;
                }
            }
            if (pos_minimo != i) {
                aux = v[pos_minimo];
                v[pos_minimo] = v[i];
                v[i] = aux;
            }
            System.out.print("Passo " + (i + 1) + ": ");
            printArray(v);
        }
    }
}
