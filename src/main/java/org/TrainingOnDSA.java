package org;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TrainingOnDSA {

    public static void main(String[] ags){
        System.out.println(Arrays.toString(minMax(new int[]{4, -2, 9, 0})));
    }

    static int[] minMax(int[] nums) {

        int min = nums[0];
        int max = nums [0];

        int currentVal;

        for(int i = 1; i < nums.length; i++){

            currentVal = nums[i];

            if(currentVal < min) min = currentVal;
            if(currentVal > max) max = currentVal;
        }


        return new int[] {min, max};
    }
}
