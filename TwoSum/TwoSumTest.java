package LeetCode.TwoSum;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TwoSumTest{

    @Test
    public void testTwoSumResult() {
        
        int[] nums = { 1, 5, 2, 9 };
        int target = 6;
        int[] expected = {0,1};
        int[] result = TwoSum.twoSum(nums, target);
        assertArrayEquals(expected, result);

    }

    @Test
    public void testTwoSumNoResult() {
        
        int[] nums = { 1, 7, 2, 9 };
        int target = 6;
        int[] expected = {};
        int[] result = TwoSum.twoSum(nums, target);
        assertArrayEquals(expected, result);

    }

}