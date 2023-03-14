package leetcode.array;

public class FindPeakElem {
    public static void main(String[] args) {

        int[] num = new int[]{1,2,3,1};

        // out 2
        int solution = solution(num);

        System.out.println(solution);
    }

    public static int solution(int[] nums) {

        int left = 0;
        int right = nums.length -1;

        if(nums.length <= 1) {
            return 0;
        }

        while(left < right) {
            int pivot = (left + right)/2;
            int num = nums[pivot];
            int nextNum = nums[pivot+1];

            if(num < nextNum) {
                left = pivot + 1;
            } else {
                right = pivot;
            }
        }

        return left;
    }
}
