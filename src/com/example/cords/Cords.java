package com.example.cords;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Cords {

    static String FILEPATH = "src/resources/data/coords.txt";

    /**
     *  Program to print the correct ascii character(s) at the specified x,y coordinates from the arrays.
     * @param args
     */
    public static void main(String[] args) {

        List<String> list;
        list = convertTextToArray(FILEPATH);

        // Use a multi-dimensional array 100x100.
        String [][] board;
        board = buildMultiDimensionalArray(list);

        Random rand = new Random();
        int randomNum = rand.nextInt((board.length-1 - 1) + 1) + 1;

        // print the correct ascii character(s) at the specified x,y coordinates from the arrays.

        // first coordinate should print out "@"
        printAsciiCharacter(board, "28", "14");

        // random coordinate should print TBD
        printAsciiCharacter(board, board[randomNum][0], board[randomNum][1]);

        // last coordinate should print out ","
        printAsciiCharacter(board, "34", "17");

    }

    /**
     * Returns a list array from a file
     * @param filepath  an absolute path giving the location of the file
     * @return          list array of text ines
     */
    public static List<String> convertTextToArray(String filepath){
        Scanner scan = null;

        {
            try {
                scan = new Scanner(new File(filepath));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        List<String> list = new ArrayList<String>();

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            list.add(line);
        }
        scan.close();
        return list;
    }

    /**
     * Returns a multi-dimensional array with 3 columns
     * @param list  list array of x,y coordinates with ascii character value
     * @return      multi-dimensional array with x,y coordinates with ascii character value
     */
    public static String[][] buildMultiDimensionalArray(List<String> list){

        String [][] multiD = new String[list.size()][3];
        int lineNumber = 0;

        for (String temp : list){
            String line = temp;
            String trim = line.replaceAll("\\]$|^\\[", "");
            String[] split = trim.split(",");
            multiD[lineNumber][0] = split[0];
            multiD[lineNumber][1] = split[1];
            multiD[lineNumber][2] = split[2];
            lineNumber++;
        }
        return multiD;
    }

    /**
     * Prints ascii character from X & Y coordinates
     * @param multiD    multi-dimensional array with x,y coordinates with ascii character value
     * @param x         x coordinates
     * @param y         y coordinates
     */
    public static void printAsciiCharacter(String[][] multiD, String x, String y){
        for (int row = 0; row < multiD.length; row++){
            if (multiD[row][0].contains(x) && multiD[row][1].contains(y)){
                int num = Integer.parseInt(multiD[row][2]);
                char character = (char) num;
                System.out.print("Ascii character '" + character + "' was found at coordinates X:" + x + ", Y:" + y + "\n");
            }
            else {
                System.out.println("X:" + x + ", Y:" + y + " coordinates not found");
            }
        }
    }
}



