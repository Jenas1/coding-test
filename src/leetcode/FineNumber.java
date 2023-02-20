package leetcode;

import java.util.Arrays;

public class FineNumber {


    public static  void  main(String[] args) {
        int[] nums = new int[]{-4,-1,0,3,10};

        System.out.println(sortedSquares(nums));
    }


    public static int[] sortedSquares(int[] nums) {

        int[] result = new int[nums.length];


        for(int i=0; i <= nums.length; i++){

            result[i] = i*i;
        }

        Arrays.sort(result);


        return result;
    }
}


