package LeetCode.TwoSum;



import java.util.ArrayList;
import java.util.Arrays;


public class TwoSum {

    public static void main(String[] args) {
        int answer[] = {};
        int nums[] = { 2, 7, 11, 15 };
        answer = TwoSum.twoSum(nums, 9);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] twoSum(int[] nums, int target) {

        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int i = 0; i < nums.length - 1; i++) {
            for(int j = i+1 ; j < nums.length;j++)
            if (nums[i] + nums[j] == target) {
                answer.addAll(Arrays.asList(i,j));
                return  answer.stream().mapToInt(Integer::intValue).toArray();
            }
        }

    return new int[0];

    }

   

}