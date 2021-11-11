package academy.learnprogramming.arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] nums = new int[7];

        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 4;
        nums[3] = 7;
        nums[4] = -1;
        nums[5] = 12;
        nums[6] = 10;

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == -1) {
                index = i;
                break;
            }
        }
        System.out.println("Index = " + index);


        int[] array = {1, 3, 4, 6, 7, 8, 3};
        int n = array.length;
        int[] newArray = new int[n + 1];
        newArray[n] = 10;

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
