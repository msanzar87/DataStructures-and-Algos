package academy.learnprogramming.arrays;

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
            if (nums[i] == -1){
                index = i;
                break;
            }
        }
        System.out.println("Index = "+ index);


        int[] array = {1,3,4,6,7,8,3};
        for (int j = 0; j < array.length; j++) {
            System.out.println("Index " + array[j] * 2 );

        }

    }
}
