import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {

    /* Task: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order. */

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] imp = solution02(nums, target);

        System.out.println("[" + imp[0] + ", " + imp[1] + "]");

    }

    // Solution 01
    public static int[] solution01(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int resultadoSoma = nums[i] + nums[j];
                if (resultadoSoma == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    // Solution 02
    public static int[] solution02(int[] nums, int target){

        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)){
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return null;
    }
}
