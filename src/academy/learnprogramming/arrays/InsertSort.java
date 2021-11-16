package academy.learnprogramming.arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j-1;
            while (i > -1 && arr[i] > key){
                arr[i+1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
//        for (int unsort = 1; unsort < arr.length; unsort++) {
//            int newElement = arr[unsort];
//            int i;
//            for (int i = unsort; i > 0 && arr[i-1] > newElement; i--) {
//                arr[i] = arr[i-1];
//            }
//            arr[unsort] = i;
//        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
