package InsertionSort;

public class InsertionSortMethod {
    static final int TAMANHO = 10;
    
    public static void main(String[] args) {
        int[] v = {30, 20, 50, 60, 80, 40, 70, 10, 90, 100};

        System.out.print("Array Original: ");
        printArray(v);

        insertionSort(v);
    }
    static void printArray(int[] v) {
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
    static void insertionSort(int[] v) {
        int i, j, chave;
        
        for (i = 1; i < TAMANHO; i++) {
            chave = v[i];
            j = i - 1;

            while (j >= 0 && v[j] > chave) {
                v[j + 1] = v[j];
                j = j - 1;
            }
            v[j + 1] = chave;
            System.out.print("Passo " + i + ": ");
            printArray(v);
        }
        System.out.print("Array Ordenado: ");
        printArray(v);
    }
}
