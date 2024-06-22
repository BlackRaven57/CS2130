package cs2130;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //TODO: Prompt user to input a set of positive integers (-1 to stop)
        //TODO: Prompt user to enter a target sum
        //TODO: Prompt user to enter the subset length
        //TODO: Use the combination class to find all subsets of length n that sum to x
        //TODO: Use the permutation class to print all permutations of the set.

        // Prompt user to enter a set of Positive Integers (-1 to stop)
        System.out.println("Enter a set of positive integers (-1 to stop).");
        ArrayList<Integer> userSet = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.print("First Number: ");
        int user = input.nextInt();
        while (user != -1) {
            userSet.add(user);
            System.out.print("Next Number: ");
            user = input.nextInt();
        }

        // Prompt User for a Target Sum
        System.out.print("\nNow Enter a Target Sum: ");
        int targetSum = input.nextInt();

        // Prompt User for subset length
        System.out.print("Finally enter the Subset Length: ");
        int subsetLength = input.nextInt();

        // Find all the subsets of subsetLength that sum to targetSum (using combination)
        // Finding amount of combinations again
        int nFactorial = 1;
        for (int i = 2; i <= userSet.size(); i++) {
            nFactorial *= i;
        }
        int kFactorial = 1;
        for (int j = 2; j <= subsetLength; j++) {
            kFactorial *= j;
        }
        int nMinusKFactorial = 1;
        for (int k = 2; k <= (userSet.size() - subsetLength); k++) {
            nMinusKFactorial *= k;
        }
        int numCombinations = nFactorial / (nMinusKFactorial * kFactorial);

        Combination c = new Combination(userSet, subsetLength);
        // For loop through combinations to see if they add up to the targetSum or not
        System.out.println("Subsets that add up to Target Sum Value: ");
        for (int x = 0; x < numCombinations; x++) {
            int summation = 0;
            ArrayList<Integer> subset = c.getCombination();
            for (int y = 0; y < subsetLength; y++) {
                summation += subset.get(y);
            }
            if (summation == targetSum) {
                System.out.println(subset);
            }
            c.nextCombination();
        }

        // Print all permutations of the set (using permutation class)
        System.out.println("\nAll Permutations of set of positive integers: ");
        Permutation p = new Permutation(userSet);
        p.printAllPermutations();
    }
}
