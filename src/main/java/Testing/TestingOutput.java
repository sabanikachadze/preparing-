package Testing;

import java.util.*;

public class TestingOutput {


    public static void main(String[] args) {

        System.out.println(Arrays.toString(minMax(new int[]{4, 1, 3, 1})));
    }


    public static int[] minMax(int[] arr) {

        Objects.requireNonNull(arr);

        if (arr.length == 0) {
            throw new IllegalArgumentException();
        }

        int min = arr[0];
        int max = arr[0];

        for (int val : arr) {

            min = Math.min(min, val);
            max = Math.max(max, val);
        }

        return new int[]{min, max};
    }






//    static boolean hasPairWithSum(int[] nums, int target) {
//
//
//        for (int i = 0; i < nums.length; i++) {
//
//            for (int j = i + 1; j < nums.length; j++) {
//
//                if (nums[i] + nums[j] == target) return true;
//            }
//        }
//
//        return false;
//    }
//

// public static class DG4 {
//
//    static double averageOfPassed(List<Integer> scores, int passMark) {
//
//        double sum = 0, count = 0; // changed to double because decimal values are left out wit integer division
//        for (Integer score : scores) { // starting from 1 instead of 0, changed in to enhanced for loop because we don't need indexes here
//
//            if (score >= passMark) { // passMark wasn't included as ib comparison
//                sum += score;
//                count++;
//            }
//        }
//
//        if(sum == 0) return 0.0; // for zero division safety
//        return Math.round((sum / count) * 100.0) / 100.0; // diving integers cut decimal values from division + return type is double and division by zero isn't legal, also to round the value up top max two decimals
//    }
//}


//
//    public class DG1 {
//
//        static class Counter {
//            int value;
//
//            void add(int n) {
//                value += n;
//            }
//        }
//
//        static void reset(Counter c) {
//            c = new Counter();
//            c.add(100);
//        }
//
//        static class Parent {
//            String who() {
//                return "parent";
//            }
//
//            String hello() {
//                return "hello from " + who();
//            }
//        }
//
//        static class Child extends Parent {
//            @Override
//            String who() {
//                return "child";
//            }
//        }
//    }
}
