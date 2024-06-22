package cs2130;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class Combination {

    private ArrayList<Integer> combinationSet;
    private int subsetLength;
    private ArrayList<Integer> currentCombination;

    public Combination(Collection<Integer> values, int subsetLen) {
        TreeSet<Integer> set = new TreeSet<>(values); //sort and remove duplicates
        combinationSet = new ArrayList<>(set);
        subsetLength = subsetLen;
        currentCombination = new ArrayList<>(subsetLength);
        resetCombination();
    }

    public void resetCombination() {
        currentCombination.clear();
        currentCombination.addAll(combinationSet.subList(0, subsetLength));
    }

    public ArrayList<Integer> getCombination() {
        return new ArrayList<>(currentCombination);
    }

    public void setCombination(Collection<Integer> combo){
        TreeSet<Integer> set = new TreeSet<>(combo); //sort and remove duplicates
        if (set.size() != subsetLength){
            return;
        }
        for(Integer value:set){
            if (!combinationSet.contains(value)) {
                return;
            }
        }
        currentCombination.clear();
        currentCombination.addAll(set);
    }

    public void printAllCombinations() {
        //TODO: Make sure you start at the beginning (see the
        // resetCombination method)
        //TODO: Print combination
        //TODO: Generate a next Combination
        //TODO: Repeat

        // Find number of combinations
        int nFactorial = 1;
        for (int i = 2; i <= combinationSet.size(); i++) {
            nFactorial *= i;
        }
        int kFactorial = 1;
        for (int j = 2; j <= currentCombination.size(); j++) {
            kFactorial *= j;
        }
        int nMinusKFactorial = 1;
        for (int k = 2; k <= (combinationSet.size() - currentCombination.size()); k++) {
            nMinusKFactorial *= k;
        }
        int numCombinations = nFactorial / (nMinusKFactorial * kFactorial);


        // Reset permutation and print beginning
        resetCombination();
        System.out.println(currentCombination);
        // Print rest of permutations
        for (int x = 0; x < (numCombinations - 1); x++) {
            nextCombination();
            System.out.println(currentCombination);
        }
    }

    public ArrayList<Integer> nextCombination() {
        //TODO: Move from right to left in both the
        // currentCombination and the combinationSet
        // until the numbers do not match.
        //TODO: Find startPos as 1 plus the position of the
        // number from the current combination that did
        // not match in the combinationSet.  Fill in
        // from left to right in the currentCombination
        // starting at the position of the mismatch the
        // numbers from the combinationSet starting at
        // the startPos you just found
        //TODO: If there was no mismatch start combination over at the
        // first subset. (see the resetCombination method)

        int sIndex = combinationSet.size() - 1;
        int mIndex = subsetLength - 1;
        // Loop Combination (Right to Left) to find mismatch
        while ((currentCombination.get(mIndex) == combinationSet.get(sIndex)) && (mIndex > 0)) {
            mIndex--;
            sIndex--;
        }

        // If it is the highest subset
        if (currentCombination.get(mIndex) == combinationSet.get(sIndex)) {
            resetCombination();
        } else {
            // Find index from combination set that has same value as mismatched index from combination set (mIndex)
            sIndex = mIndex;
            while (currentCombination.get(mIndex) != combinationSet.get(sIndex)) {
                sIndex++;
            }
            sIndex++;

            // Set Values
            for (int wIndex = 0; wIndex < subsetLength - mIndex; wIndex++) {
                currentCombination.set(mIndex + wIndex, combinationSet.get(sIndex + wIndex));
            }
        }
        return currentCombination;
    }

}
