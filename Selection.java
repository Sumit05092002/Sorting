package Sorting;
public class Selection {
    public static void main(String args[]) {
        int arr[] = { 45, 12, 67, 43, 21 };
        selection(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void selection(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
