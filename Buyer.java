package com.company;

import java.io.*;
import java.util.*;

public class Buyer {

    private static int value = 0;
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("urn.txt");
        Scanner file = new Scanner(fr);
        int d = 0;
        int r = 0;
        int c = 0;
        while (file.hasNext()){
            String line = file.nextLine();

            for (int i = 0; i < line.length() ; i++){
                if (line.charAt(i) == '@'){
                    d += 1;
                }
                else if (line.charAt(i) == '*'){
                    r += 1;
                }
                else if (line.charAt(i) == '$'){
                    c += 1;
                }
            }
        }

        for (int i = 0; i <= d; i++){
            value += 1000;
        }
        for (int i = 0; i <= r; i++){
            value += 300;
        }
        for (int i = 0; i <= c; i++){
            value += 500;
        }
        fr.close();
        System.out.println("The total number of diamonds is: " + d);
        System.out.println("The total number of rubies is: " + r);
        System.out.println("The total number of coins is: " + c);
        System.out.print("total value: " + value);
    }
}