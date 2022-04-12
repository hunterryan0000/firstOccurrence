import java.util.Arrays;

public class Exercise {
    public int firstOccurrence (int[] nums) {
        Arrays.sort(nums);

        return (nums[0]);
    }

    public int testingWrongAnswer (int[] nums) {
        Arrays.sort(nums);

        return (nums[1]);
    }
}


