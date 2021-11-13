package academy.learnprogramming.arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//    int n = arr.length;
//    int temp;
//        for (int i = 0; i < n; i++) {
//            for (int j = 1; j < (n - i); j++) {
//                if (arr[j - 1] > arr[j]) {
//                    temp = arr[j - 1];
//                    arr[j - 1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        for (int i = 0; i <arr.length; i++) {
//            System.out.println(arr[i]);
//        }
    
    }

}
