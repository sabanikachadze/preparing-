package Testing;

import java.util.Arrays;
import java.util.List;

public class TestingOutput {


    public static void main(String[] args) {

        // (a)
        String s = null;
        System.out.println(s.length());//NullPointerException at runtime
        // (b)
        //int x = "5"; // Compile exception, it won't compile
        //System.out.println(x);
        // (c)
        Object o = List.of(1);
        List<String> l = (List<String>) o;
        System.out.println(l.size());// UnsupportedOperationException or something will be thrown
        // (d)
        final int[] arr = {1};
        arr[0] = 2;
        System.out.println(arr[0]); // 2 will be printed
    }


    public class DG1 {

        static class Counter {
            int value;

            void add(int n) {
                value += n;
            }
        }

        static void reset(Counter c) {
            c = new Counter();
            c.add(100);
        }

        static class Parent {
            String who() {
                return "parent";
            }

            String hello() {
                return "hello from " + who();
            }
        }

        static class Child extends Parent {
            @Override
            String who() {
                return "child";
            }
        }
    }
}
