package leetcode.array;

public class MoveZeros {

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,1};


        for (int i : moveZeros(nums)) {
            System.out.println(i);
        }
    }

    public static int[] moveZeros(int[] nums) {
        int x = 0;
        for (int i=0; i< nums.length; i++) {
            if(nums[i] !=0) {
                swap(nums, x, i);
                x++;
            }
        }

        return nums;
    }
    public static void swap(int[] nums, int x, int i) {
        int temp = nums[x];
        nums[x] = nums[i];
        nums[i] = temp;
    }
}
