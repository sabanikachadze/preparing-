package org.example;

public class Test {

    static class A {
        A() {
            this(5, 5);
            System.out.println("A()");
        }

        A(int x, int b) {
            System.out.println(x + b);
        }

        A(int x) {
            this();
            System.out.println("A(int)");
        }
    }

    static class B extends A {
        B() {
            super(5);
            System.out.println("B()");
        }

        B(int x) {
            System.out.println("5");
        }
    }

    public static void main(String[] args) {
        new B();
    }


    interface Chargeable {
        default double fee() {
            return 5.0;
        }
    }

    interface Taxable {
        default double fee() {
            return 8.0;
        }
    }

    class Invoice implements Chargeable, Taxable {
        @Override
        public double fee() {
            return Chargeable.super.fee() + Taxable.super.fee();
        }
    }
}
