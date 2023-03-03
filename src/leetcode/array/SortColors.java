package leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class SortColors {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 0, 2, 2, 0, 1, 2, 1, 0};

        int idx0 = 0;
        int idx2 = nums.length - 1;
        int i = 0;

        while (i <= idx2) {

            if (nums[i] == 0) {
                swap(nums, i, idx0);
                idx0++;
                i++;
            } else if (nums[i] == 2) {
                swap(nums, i, idx2);
                idx2--;
            } else {
                i++;
            }
        }

        List<Integer> arr = new ArrayList<>();

        arr.stream().mapToInt(Integer::intValue)
                .toArray();

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;

    }
}
