package array;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an unsorted integer array, find a pair with the given sum in it.
 *
 * Input:   nums = [8, 7, 2, 5, 3, 1]
 *          target = 10
 *
 * Output:  Pair found (8, 2)       or      Pair found (7, 3)
 *
 * Input:   nums = [5, 2, 6, 8, 1, 9]
 *          target = 12
 *
 * Output: Pair not found
 */
public class FindPair {
    public static void main(String[] args) {
        int[] nums = new int[] {5, 2, 6, 8, 1, 9};
        int target =4;

        findPair(nums, target);
    }

    private static void findPair(int[] nums, int target) {
        // map of value vs index
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                System.out.printf("Pair Found : { %s, %s }", target - nums[i], nums[i]);
                return;
            }
                map.put(nums[i], i);
        }

        System.out.println("Pair Not Found.");

    }
}
