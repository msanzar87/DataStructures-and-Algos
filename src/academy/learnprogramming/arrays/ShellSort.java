package academy.learnprogramming.arrays;

public class ShellSort {


    public static void main(String[] args) {
        int[] nums = {20, 35, -15, 7, 55, 1, -22};
        for (int gap = nums.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < nums.length; i++) {
                int newElement = nums[i];
                int j = i;

                while (j >= gap && nums[j - gap] > newElement){
                    nums[j] = nums[j-gap];
                    j -= gap;
                }
                nums[j] = newElement;
            }
        }




        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

}
