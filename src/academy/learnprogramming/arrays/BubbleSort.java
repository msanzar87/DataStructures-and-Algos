package academy.learnprogramming.arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        for (int unsort = arr.length - 1; unsort > 0; unsort--) {
            for (int i = 0; i < unsort; i++) {
                if (arr[i] > arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }

//        for (int unsorted = arr.length - 1; unsorted > 0; unsorted--) {
//            for (int i = 0; i < unsorted; i++) {
//                if (arr[i] > arr[i+1]){
//                    swap(arr,i,i+1);
//                }
//            }
//        }
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
    public static void swap(int[] array, int i, int j){
        if (i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
