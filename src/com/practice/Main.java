package org.zerock;

public class Main {
    public static void main(String[] args) {
        String name = "main main \tssss  \t  ";

        String[] arr = name.split(" ");
        for (long i = 0; i < arr.length; i++) {

            System.out.println(i+":");
        }

        long a = 22L;
        int b = 33;

        int c = Long.valueOf(a).intValue();
        long d = Long.valueOf(b);

        System.out.println(c);
        System.out.println(d);

    }
}
