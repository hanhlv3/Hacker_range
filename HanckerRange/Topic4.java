package HanckerRange;

public class Topic4 {

    public static void main(String[] args) {
        int a[] = { 1, 5, 2, 3};
        bubbleSort(a, 4);
    }

    public static void bubbleSort(int a[], int n) {
        // sắp xếp mảng tăng dần
        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n -1  - i; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j+1] = temp;
                }
            }
        }
        for (int i: a) {
            System.out.print(i + " ");
        }
    }

    public static void insertionSort(int a[], int n) {

    }
}
