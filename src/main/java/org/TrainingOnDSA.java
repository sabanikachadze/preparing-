package org;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TrainingOnDSA {

    public static void main(String[] ags) {
        System.out.println((longestStreakCalculator(new int[]{2, 2, 2, 1, 3})));
    }

    static int[] minMax(int[] nums) {

        int min = nums[0];
        int max = nums[0];

        int currentVal;

        for (int i = 1; i < nums.length; i++) {

            currentVal = nums[i];

            if (currentVal < min) min = currentVal;
            if (currentVal > max) max = currentVal;
        }


        return new int[]{min, max};
    }


    static boolean containsDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean containsDuplicateVersion2(int[] nums) {

        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);

        for (int i = 1; i < sortedNums.length; i++) {

            if (sortedNums[i - 1] == sortedNums[i]) {
                return true;
            }
        }

        return false;
    }

    static int longestStreakCalculator(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int longestStreak = 1;
        int currentStreak = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                currentStreak++;
            } else {
                currentStreak = 1;
            }

            longestStreak = Math.max(longestStreak, currentStreak);
        }

        return longestStreak;
    }
}
