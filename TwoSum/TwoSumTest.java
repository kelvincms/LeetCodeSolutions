/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * Unit tests for the TwoSum class.
 */

package TwoSum;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void twoSum_targetValueAtBeginning_expectedAnswer() {
        //Test case with the targetValue at the beginning of the array
        int[] nums = { 1, 5, 2, 9 };
        int target = 6;
        int[] expected = { 0, 1 };
        int[] result = TwoSum.twoSum(nums, target);
        assertArrayEquals(expected, result);

    }

    @Test
    public void twoSum_nonExistantTargetValue_expectedAnswer() {
        //Test case with a non existant target value inside of the array
        int[] nums = { 1, 7, 2, 9 };
        int target = 6;
        int[] expected = {};
        int[] result = TwoSum.twoSum(nums, target);
        assertArrayEquals(expected, result);

    }

}