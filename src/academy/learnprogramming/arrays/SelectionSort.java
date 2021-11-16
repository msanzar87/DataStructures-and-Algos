package academy.learnprogramming.arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        for (int unsort = arr.length - 1; unsort > 0; unsort--) {
            int largest = 0;
            for (int i = 0; i <= unsort; i++) {
                if (arr[i] > arr[largest]){
                    largest = i;
                }
            }swap(arr,largest,unsort);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//        for (int unsorted = arr.length - 1; unsorted > 0; unsorted--) {
//            int largest = 0;
//            for (int i = 1; i <= unsorted; i++) {
//                if (arr[i] > arr[largest]) {
//                    largest = i;
//                }
//
//            }
//        for (int i = 0; i < arr.length - 1; i++) {
//            int index = i;
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[j] < arr[index]){
//                    index = j;
//                }
//            }swap(arr,index,i);
//        }
    }
        public static void swap(int[] array, int i, int j){
            if (i == j) {
                return;
            }
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

