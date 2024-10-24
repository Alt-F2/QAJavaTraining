package org.lbg.c4;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        int counter = 0;
        int b;

        try {
            while ((b = System.in.read()) != -1) {
                System.out.println(Integer.toHexString(b));
                counter++;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("No. of chars in ASCII: " + counter);
        try {
            while ((b = System.in.read()) != -1) {
                System.out.println(Integer.toHexString(b));
                counter++;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("No. of chars in alpha: " + counter);

    }
}