package com.company;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input, sp[];
        boolean loop = true;
        while (loop) {
            System.out.print("Please type a sentence. ");
            input = sc.nextLine();
            if(input.equals("EXITZ")) {
                loop = false;
            }
            input = input + "Z";
            input = input.toUpperCase();

            sp = input.split("S\\s*A");

            System.out.println("There are " + (sp.length - 1) + " occurrences.");
            System.out.println("");

        }
    }
}