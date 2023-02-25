
// https://leetcode.com/problems/maximum-score-from-removing-stones/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxScoreRemovingStones {
    private static int[] sortNums (int[] nums) {
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                int temp = 0;
                if (nums[i] < nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    public static int maximumScore(int a, int b, int c) {
        int[] nums = new int[]{a, b, c};
        int maxScore = 0;
        nums = sortNums(nums);

        while ((nums[0] > 0) && (nums[1] > 0) && (nums[2] > 0)) {
            nums[0]--;
            if (maxScore % 2 == 0) {
                nums[2]--;
            } else {
                nums[1]--;
            }
            maxScore += 1;
            nums = sortNums(nums);
        }

        return maxScore + Math.min(nums[0], nums[1]);
    }

    public static void main(String[] args) {
        System.out.println(maximumScore(24, 19, 24));
    }
}