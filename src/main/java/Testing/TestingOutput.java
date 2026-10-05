package Testing;

import java.util.*;

public class TestingOutput {


    public static void main(String[] args) {

        System.out.println(mostFrequentChar("   asf ASvzqs ASDsfaxrhpoppsdgsdppppaaa"));
    }

    static char mostFrequentChar(String s) {

        Objects.requireNonNull(s, "Null value cannot be tested");

        if (s.isEmpty()) {
            throw new IllegalStateException("Empty value cannot be tested");
        }

        char[] chars = s.toCharArray();

        Map<Character, Integer> counts = new HashMap<>();

        for (char character : chars) {

            char c = Character.toLowerCase(character);
            if (c == ' ') continue;
            counts.merge(c, 1, Integer::sum);
        }

        if (counts.isEmpty()) {
            throw new IllegalArgumentException("Input contains no non-space characters");
        }

        char bestChar = '\0';
        int bestCount = 0;

        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();

            if (count > bestCount ||
                    (count == bestCount && c < bestChar)) {

                bestChar = c;
                bestCount = count;
            }
        }

        return bestChar;
    }


//
//    static void reverseInPlace(int[] a) {
//
//        if (a == null) {
//            throw new IllegalArgumentException("not reversible array");
//        }
//
//
//        for (int i = 0; i < a.length / 2; i++) {
//
//            int placeHolder = a[i];
//            int rightPointer = a.length - 1 - i;
//
//            a[i] = a[rightPointer];
//            a[rightPointer] = placeHolder;
//
//        }
//    }


//
//    record Summary(int min, int max, double average, int aboveAverage) {
//    }
//
//    static Summary summarize(int[] readings) {
//
//        if (readings == null || readings.length == 0) {
//
//        }
//
//        int min = readings[0];
//        int max = readings[0];
//        long total = 0;
//
//        for (int num : readings) {
//
//            min = Math.min(min, num);
//            max = Math.max(max, num);
//            total += num;
//        }
//
//        double average = (double) total / readings.length;
//        int aboveAverage = 0;
//
//        for (int num : readings) {
//
//            if (num > average) aboveAverage++;
//        }
//
//        return new Summary(min, max, average, aboveAverage);
//    }
//
//    static String describe(Summary s) {
//
//
//        return String.format(Locale.ROOT, "min=%d max=%d avg=%.2f above=%d", s.min(), s.max(), s.average(), s.aboveAverage());
//    }


//
//    public static boolean hasDuplicateBrute(int[] a) {
//
//        Objects.requireNonNull(a);
//        if (a.length == 0) return false;
//
//
//        for (int i = 0; i < a.length; i++) {
//
//            for (int j = i + 1; j < a.length; j++) {
//
//                if (a[i] == a[j]) return true;
//            }
//        }
//
//        return false;
//    }
//
//    public static boolean hasDuplicateSorted(int[] a) {
//
//        int[] arr = a.clone();
//        Arrays.sort(arr);
//
//        for (int i = 1; i < arr.length; i++) {
//
//            if (arr[i] == arr[i - 1]) return true;
//        }
//
//        return false;
//    }
//

//
//
//    public static int[] minMax(int[] arr) {
//
//        Objects.requireNonNull(arr);
//
//        if (arr.length == 0) {
//            throw new IllegalArgumentException();
//        }
//
//        int min = arr[0];
//        int max = arr[0];
//
//        for (int val : arr) {
//
//            min = Math.min(min, val);
//            max = Math.max(max, val);
//        }
//
//        return new int[]{min, max};
//    }
//
//


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
