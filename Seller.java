package com.company;
import java.io.*;
import java.util.*;

public class Seller {

    //I used Mathway as a tool to help figure out the correct proportions between the scaling
    //I used https://stackoverflow.com/questions/2626835/is-there-functionality-to-generate-a-random-character-in-java
    //to help me generate the random characters



    private static final int CHARACTERISTIC_LENGTH = 3;

    private static Random r = new Random();

    private static final String filler1 = "(@$*";
    private static final String filler2 = ")@$*";

    private static int value = 0;


    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("urn.txt", false);
        PrintWriter outputFile = new PrintWriter(fw);
        Writelid(outputFile);
        drawHead(outputFile);
        drawNeck(outputFile);
        drawBody1(outputFile);
        drawBody2(outputFile);
        drawHead(outputFile);
        drawBase(outputFile);
        outputFile.close();
        getValue();
    }

    private static void Writelid(PrintWriter outputFile) throws IOException {
        for (int i = 1; i <= ((CHARACTERISTIC_LENGTH * 4)+1); i++) {
            outputFile.print(" ");
        }
        for (int line = 1; line <= CHARACTERISTIC_LENGTH * (2); line++) {
            outputFile.print("=");
        }
        outputFile.println();
        for (int i = 1; i <= ((CHARACTERISTIC_LENGTH * 4)-3); i++) {
            outputFile.print(" ");
        }
        outputFile.print("___/");
        for (int lid = 1; lid <= CHARACTERISTIC_LENGTH * (2); lid++) {
            outputFile.print(":");
        }
        outputFile.println("\\___");

        if (CHARACTERISTIC_LENGTH != 1){
            for (int i = 1; i <= ((CHARACTERISTIC_LENGTH * 4) - 7); i++) {
                outputFile.print(" ");
            }
            outputFile.print("___/");
            for (int lid = 1; lid <= ((CHARACTERISTIC_LENGTH * 2) + 8); lid++) {
                outputFile.print(":");
            }
            outputFile.println("\\___");
        }
        if (CHARACTERISTIC_LENGTH == 3){
            for (int i = 1; i <= (CHARACTERISTIC_LENGTH - 2); i++) {
                outputFile.print(" ");
            }
            outputFile.print("___/");
            for (int lid = 1; lid <= ((CHARACTERISTIC_LENGTH * 7) + 1); lid++) {
                outputFile.print(":");
            }
            outputFile.println("\\___");
        }
        drawBaseEdge(outputFile);
    }

    private static void drawHead(PrintWriter outputFile) throws IOException {
        outputFile.print(" ");
        outputFile.print("\\");
        for (int i = 1; i <= (CHARACTERISTIC_LENGTH * 5) - 1; i++){
            outputFile.print("{");
        }
        for (int i = 1; i <= (CHARACTERISTIC_LENGTH * 5) - 1; i++){
            outputFile.print("}");
        }
        outputFile.println("/");

        if (CHARACTERISTIC_LENGTH != 1){
            for (int i = 1; i <= 2; i++) {
                outputFile.print(" ");
            }
            outputFile.print("\\");
            for (int lid = 1; lid <= ((CHARACTERISTIC_LENGTH * 5) - 2); lid++) {
                outputFile.print("{");
            }
            for (int lid = 1; lid <= ((CHARACTERISTIC_LENGTH * 5) - 2); lid++) {
                outputFile.print("}");
            }
            outputFile.println("/");
        }
        if (CHARACTERISTIC_LENGTH == 3){
            for (int i = 1; i <= 3; i++) {
                outputFile.print(" ");
            }
            outputFile.print("\\");
            for (int lid = 1; lid <= ((CHARACTERISTIC_LENGTH * 5) - 3); lid++) {
                outputFile.print("{");
            }
            for (int lid = 1; lid <= ((CHARACTERISTIC_LENGTH * 5) - 3); lid++) {
                outputFile.print("}");
            }
            outputFile.println("/");
        }
    }

    private static void drawNeck(PrintWriter outputFile) throws IOException {
        for (int i = 1; i <= CHARACTERISTIC_LENGTH - 1; i++) {
            for (int line = 1; line <= CHARACTERISTIC_LENGTH + 1; line++) {
                outputFile.print(" ");
            }
            outputFile.print("|");
            for (int lid = 1; lid <= ((CHARACTERISTIC_LENGTH * 4) - 1); lid++) {
                outputFile.print(filler1.charAt(r.nextInt(filler1.length())));
            }
            for (int lid = 1; lid <= ((CHARACTERISTIC_LENGTH * 4) - 1); lid++) {
                outputFile.print(filler2.charAt(r.nextInt(filler2.length())));
            }
            outputFile.println("|");
        }
    }

    private static void drawBody1(PrintWriter outputFile) throws IOException {
        for (int i = 1; i <= CHARACTERISTIC_LENGTH; i++) {
            outputFile.print(" ");
        }
        outputFile.print("/");
        for (int i = 1; i <= CHARACTERISTIC_LENGTH * 4; i++){
            outputFile.print(filler1.charAt(r.nextInt(filler1.length())));
    }
        for (int i = 1; i <= CHARACTERISTIC_LENGTH * 4; i++){
            outputFile.print(filler2.charAt(r.nextInt(filler2.length())));
        }
        outputFile.println("\\");
        if (CHARACTERISTIC_LENGTH != 1) {
            for (int i = 1; i <= CHARACTERISTIC_LENGTH - 1; i++) {
                outputFile.print(" ");
            }
            outputFile.print("/");
            for (int i = 1; i <= (CHARACTERISTIC_LENGTH * 4) + 1; i++){
                outputFile.print(filler1.charAt(r.nextInt(filler1.length())));
            }
            for (int i = 1; i <= (CHARACTERISTIC_LENGTH * 4) + 1; i++){
                outputFile.print(filler2.charAt(r.nextInt(filler2.length())));

            }
            outputFile.println("\\");
        }
        if (CHARACTERISTIC_LENGTH == 3) {
            for (int i = 1; i <= CHARACTERISTIC_LENGTH  - 2; i++) {
                outputFile.print(" ");
            }
            outputFile.print("/");
            for (int i = 1; i <= (CHARACTERISTIC_LENGTH * 4) + 2; i++){
                outputFile.print(filler1.charAt(r.nextInt(filler1.length())));
            }
            for (int i = 1; i <= (CHARACTERISTIC_LENGTH * 4) + 2; i++){
                outputFile.print(filler2.charAt(r.nextInt(filler2.length())));

            }
            outputFile.println("\\");
        }
    }

    private static void drawBody2(PrintWriter outputFile) throws IOException{
        for (int line = 1; line <= CHARACTERISTIC_LENGTH; line++){
            outputFile.print('|');
            for (int i = 1; i <= CHARACTERISTIC_LENGTH * 5; i++) {
                outputFile.print(filler1.charAt(r.nextInt(filler1.length())));
            }
            for (int i = 1; i <= CHARACTERISTIC_LENGTH * 5; i++) {
                outputFile.print(filler2.charAt(r.nextInt(filler2.length())));
            }
            outputFile.println('|');
        }
    }

    private static void drawBase(PrintWriter outputfile) throws IOException {
        drawBaseEdge(outputfile);
        for (int line = 1; line <= CHARACTERISTIC_LENGTH * 2 - 1; line++) {
            outputfile.print('|');
            for (int i = 1; i <= CHARACTERISTIC_LENGTH * 10; i++) {
                outputfile.print(':');
            }
            outputfile.println('|');
        }
        drawBaseEdge(outputfile);
    }

    private static void drawBaseEdge(PrintWriter outputfile) throws IOException {
        outputfile.print('+');
        for (int i = 1; i <= CHARACTERISTIC_LENGTH * 10; i++) {
            outputfile.print('=');
        }
        outputfile.println('+');
    }

    private static void getValue() throws IOException{
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