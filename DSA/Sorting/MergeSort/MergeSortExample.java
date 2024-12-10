import java.util.Scanner;

public class MergeSortExample {

    // Merge function to merge two halves
    public static void merger(int[] arr, int L, int mid, int R) {
        int n1 = mid - L + 1;
        int n2 = R - mid;

        int[] LArr = new int[n1];
        int[] RArr = new int[n2];

        // Fill LArr and RArr with values from the main array
        for (int i = 0; i < n1; i++) {
            LArr[i] = arr[L + i];
        }
        for (int i = 0; i < n2; i++) {
            RArr[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = L;
        // Merge the two arrays back into arr
        while (i < n1 && j < n2) {
            if (LArr[i] <= RArr[j]) {
                arr[k] = LArr[i];
                i++;
            } else {
                arr[k] = RArr[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of LArr[], if any
        while (i < n1) {
            arr[k] = LArr[i];
            i++;
            k++;
        }

        // Copy the remaining elements of RArr[], if any
        while (j < n2) {
            arr[k] = RArr[j];
            j++;
            k++;
        }
    }

    // MergeSort function
    public static void MergeSort(int[] arr, int L, int R) {
        if (L < R) {
            int mid = (L + R) / 2;
            MergeSort(arr, L, mid);
            MergeSort(arr, mid + 1, R);
            merger(arr, L, mid, R);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        // Get array size from the user
        System.out.println("Enter the size of the array:");
        int size = scan.nextInt();

        int[] arr = new int[size];

        // Get array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        // Array before sorting
        System.out.println("Array before sorting:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Call MergeSort function
        MergeSort(arr, 0, arr.length - 1);

        // Array after sorting
        System.out.println("Array after sorting:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
