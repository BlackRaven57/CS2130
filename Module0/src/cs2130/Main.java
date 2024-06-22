package cs2130;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Hello World");
        Scanner scnr = new Scanner(System.in);
        System.out.print("What is your name?: ");
        String name = scnr.next();
        Utilities.hello(name);

    }
}
