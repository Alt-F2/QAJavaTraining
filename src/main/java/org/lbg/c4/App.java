package org.lbg.c4;


public class App {
    public static void main(String[] args) {
        // System.out.println(sum(4.3,5));

        int y = 44;
        MyInteger a = new MyInteger();

        fuBar( a );

        System.out.println(a.data);
    }

    public static double sum(double x, int y){
        return x + y;
    }

    public static MyInteger fuBar( MyInteger x ){
        return x;
    }
}