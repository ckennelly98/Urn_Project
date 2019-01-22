package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class UrnFile {

    //I used Mathway as a tool to help figure out the correct proportions between the scaling

    private static final int CHARACTERISTIC_LENGTH = 3;

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
        //lid levels
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
                outputFile.print("(");
            }
            for (int lid = 1; lid <= ((CHARACTERISTIC_LENGTH * 4) - 1); lid++) {
                outputFile.print(")");
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
            outputFile.print("(");
        }
        for (int i = 1; i <= CHARACTERISTIC_LENGTH * 4; i++){
            outputFile.print(")");
        }
        outputFile.println("\\");
        if (CHARACTERISTIC_LENGTH != 1) {
            for (int i = 1; i <= CHARACTERISTIC_LENGTH - 1; i++) {
                outputFile.print(" ");
            }
            outputFile.print("/");
            for (int i = 1; i <= (CHARACTERISTIC_LENGTH * 4) + 1; i++){
                outputFile.print("(");
            }
            for (int i = 1; i <= (CHARACTERISTIC_LENGTH * 4) + 1; i++){
                outputFile.print(")");

            }
            outputFile.println("\\");
        }
        if (CHARACTERISTIC_LENGTH == 3) {
            for (int i = 1; i <= CHARACTERISTIC_LENGTH  - 2; i++) {
                outputFile.print(" ");
            }
            outputFile.print("/");
            for (int i = 1; i <= (CHARACTERISTIC_LENGTH * 4) + 2; i++){
                outputFile.print("(");
            }
            for (int i = 1; i <= (CHARACTERISTIC_LENGTH * 4) + 2; i++){
                outputFile.print(")");

            }
            outputFile.println("\\");
        }
    }

    private static void drawBody2(PrintWriter outputFile) throws IOException{
        for (int line = 1; line <= CHARACTERISTIC_LENGTH; line++){
            outputFile.print('|');
            for (int i = 1; i <= CHARACTERISTIC_LENGTH * 5; i++) {
                outputFile.print('(');
            }
            for (int i = 1; i <= CHARACTERISTIC_LENGTH * 5; i++) {
                outputFile.print(')');
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
}
