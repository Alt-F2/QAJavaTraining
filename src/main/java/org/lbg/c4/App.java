package org.lbg.c4;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        LineNumberReader lnr = new LineNumberReader(isr);

        try {
            while (lnr.readLine() != null);
            System.out.println("No of Lines: " + lnr.getLineNumber());
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}