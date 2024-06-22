package cs2130;

import jdk.jfr.SettingControl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    // Part 1 Sets
    // Defining The Sets
    System.out.println("Part 1");
    ArrayList<Integer> setA = new ArrayList<Integer>(Arrays.asList(2, 3, 6, 4, 9));
    System.out.println("A: " + setA);
    ArrayList<Integer> setB = new ArrayList<Integer>(Arrays.asList(1, 7, 4, 9, 8));
    System.out.println("B: " + setB);
    ArrayList<Integer> setC = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
    System.out.println("C: " + setC + "\n");

    // Expressions (The Union & Intersection symbols show up as ? so I'm using U & n)
    ArrayList<Integer> ex1 = new ArrayList<Integer>();
    ex1 = Sets.unionOfSets(setA, setB);
    System.out.println("A U B: " + ex1);

    ArrayList<Integer> ex2 = new ArrayList<Integer>();
    ex2 = Sets.intersectionOfSets(setA, setB);
    System.out.println("A n B: " + ex2);

    ArrayList<Integer> temp1 = new ArrayList<Integer>();
    ArrayList<Integer> ex3 = new ArrayList<Integer>();
    temp1 = Sets.unionOfSets(setA, setB);
    ex3 = Sets.unionOfSets(temp1, setC);
    System.out.println("A U B U C: " + ex3);

    ArrayList<Integer> temp2 = new ArrayList<Integer>();
    ArrayList<Integer> ex4 = new ArrayList<Integer>();
    temp2 = Sets.intersectionOfSets(setA, setB);
    ex4 = Sets.intersectionOfSets(temp2, setC);
    System.out.println("A n B n C: " + ex4);

    ArrayList<Integer> temp3 = new ArrayList<Integer>();
    ArrayList<Integer> ex5 = new ArrayList<Integer>();
    temp3 = Sets.unionOfSets(setA, setB);
    ex5 = Sets.intersectionOfSets(temp3, setC);
    System.out.println("(A U B) n C: " + ex5);

    ArrayList<Integer> temp4 = new ArrayList<Integer>();
    ArrayList<Integer> ex6 = new ArrayList<Integer>();
    temp4 = Sets.intersectionOfSets(setB, setC);
    ex6 = Sets.unionOfSets(setA, temp4);
    System.out.println("A U (B n C): " + ex6);

    ArrayList<Integer> temp5 = new ArrayList<Integer>();
    ArrayList<Integer> ex7 = new ArrayList<Integer>();
    temp5 = Sets.intersectionOfSets(setA, setC);
    ex7 = Sets.unionOfSets(temp5, setB);
    System.out.println("(A n C) U B: " + ex7);

    ArrayList<Integer> temp6 = new ArrayList<Integer>();
    ArrayList<Integer> ex8 = new ArrayList<Integer>();
    temp6 = Sets.unionOfSets(setC, setB);
    ex8 = Sets.intersectionOfSets(setA, temp6);
    System.out.println("A n (C U B): " + ex8);


    // Part 2 Functions
    // Defining the Sets
    System.out.println("\nPart 2");
    ArrayList<Integer> setX = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println("X: " + setX);
    ArrayList<Integer> setY = new ArrayList<Integer>(Arrays.asList(3, 6, 9, 12, 15));
    System.out.println("Y: " + setY);
    ArrayList<Integer> setW = new ArrayList<Integer>(Arrays.asList(7, 3, 5, 9, 12, 15));
    System.out.println("W: " + setW);
    ArrayList<Integer> setZ = new ArrayList<Integer>(Arrays.asList(4, 9, 7, 2));
    System.out.println("Z: " + setZ + "\n");

    // Functions
    ArrayList<Integer> rangeF = new ArrayList<Integer>(Arrays.asList(3, 5, 7, 9, 15));
    boolean oToF = Functions.isOneToOne(setX, setW, rangeF);
    boolean ontoF = Functions.isOnto(setX, setW, rangeF);
    boolean bijF = Functions.isBijection(setX, setW, rangeF);
    System.out.println("f: X -> W\nf: {(1, 3), (2, 5), (3, 7), (4, 9), (5, 15)}");
    System.out.println("One-to-One: " + oToF);
    System.out.println("Onto: " + ontoF);
    System.out.println("Bijection: " + bijF + "\n");

    ArrayList<Integer> rangeG = new ArrayList<Integer>(Arrays.asList(4, 9, 7, 4, 2));
    boolean oToG = Functions.isOneToOne(setX, setZ, rangeG);
    boolean ontoG = Functions.isOnto(setX, setZ, rangeG);
    boolean bijG = Functions.isBijection(setX, setZ, rangeG);
    System.out.println("g: X -> Z\ng: {(1, 4), (2, 9), (3, 7), (4, 4), (5, 2)}");
    System.out.println("One-to-One: " + oToG);
    System.out.println("Onto: " + ontoG);
    System.out.println("Bijection: " + bijG + "\n");

    ArrayList<Integer> rangeH = new ArrayList<Integer>(Arrays.asList(3, 6, 9, 12, 15));
    boolean oToH = Functions.isOneToOne(setX, setY, rangeH);
    boolean ontoH = Functions.isOnto(setX, setY, rangeH);
    boolean bijH = Functions.isBijection(setX, setY, rangeH);
    System.out.println("h: X -> Y\nh: {(1, 3), (2, 6), (3, 9), (4, 12), (5, 15)}");
    System.out.println("One-to-One: " + oToH);
    System.out.println("Onto: " + ontoH);
    System.out.println("Bijection: " + bijH + "\n");
  }
}
