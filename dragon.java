import java.util.Scanner;
public class dragon {
    public static void insertionSort(int[] arr, int[] b, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int k = b[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                b[j + 1] = b[j];
                j = j - 1;
            }

            arr[j + 1] = key;
            b[j + 1] = k;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int s = sc.nextInt();
            int n = sc.nextInt();

            int[] arr = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                b[i] = sc.nextInt();
            }

            insertionSort(arr, b, n);

            for (int i = 0; i < n; i++) {
                if (s > arr[i]) {
                    s += b[i];
                } else {
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
            sc.close();
        }
    }
}
