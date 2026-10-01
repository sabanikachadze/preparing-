package org;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TrainingOnDSA {

    public static void main(String[] ags) {
        System.out.println((containsDuplicate(new int[]{1, 2, 3, 4})));
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
}
