package QuickSort;

public class Main {
    public static void main(String[] args) {
        int[] v = {30, 20, 50, 60, 80, 40, 70, 10, 90, 100};

        System.out.print("Lista Inicial: ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();

        QuickSortMethod.quickSort(v, 0, v.length - 1);

        System.out.print("Lista Ordenada: ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}
