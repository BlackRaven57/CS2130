package cs2130;

import java.util.*;

public class Permutation {

    private ArrayList<Integer> currentPermutation;

    public Permutation(Collection<Integer> values) {
        TreeSet<Integer> set = new TreeSet<>(values); //sort and remove duplicates
        currentPermutation = new ArrayList<>(set);
        resetPermutation();
    }

    public void resetPermutation() {
        Collections.sort(currentPermutation);
    }

    public ArrayList<Integer> getPermutation() {
        return new ArrayList<>(currentPermutation);
    }

    public void setPermutation(Collection<Integer> perm) {
        TreeSet<Integer> set = new TreeSet<>(perm); //sort and remove duplicates
        if (set.size() != currentPermutation.size() && set.size() != perm.size()) {
            return;
        }
        for (Integer value : set) {
            if (!currentPermutation.contains(value)) {
                return;
            }
        }
        currentPermutation.clear();
        currentPermutation.addAll(perm);
    }

    public void printAllPermutations() {
        //TODO: Make sure you start at the beginning (see the
        // resetPermutation method)
        //TODO: Print permutation
        //TODO: Generate a next permutation
        //TODO: Repeat

        // Find number of permutations
        int factorial = 1;
        for (int i = 2; i <= currentPermutation.size(); i++) {
            factorial *= i;
        }
        // Reset permutation and print beginning
        resetPermutation();
        System.out.println(currentPermutation);
        // Print rest of permutations
        for (int x = 0; x < (factorial - 1); x++) {
            nextPermutation();
            System.out.println(currentPermutation);
        }
    }

    public ArrayList<Integer> nextPermutation() {
        //TODO: Move from right to left until the
        // current number is less than the previous one
        //TODO: Start at the right and find the first
        // number greater than current.
        //TODO: Swap the numbers
        //TODO: Reverse the order of the numbers to the right of the swapped
        // value so that they are in increasing order.
        //TODO: When you go through the entire set and the current
        // number is never less than the previous one, reset
        // the permutation to the beginning (see resetPermutation)
        int size = currentPermutation.size();
        boolean changed = false;
        int k = 0;
        int pk = 0;
        for (int x = (size - 2); x >= 0; x--) {
            int pkm1 = currentPermutation.get(x + 1);
            pk = currentPermutation.get(x);
            if (pkm1 > pk) {
                changed = true;
                k = x;
                break;
            }
        }
        if (changed == false) {
            resetPermutation();
        }
        else {
            boolean found = false;
            while (!found) {
                for (int y = size - 1; y > k - 1; y--) {
                    // Looking for a number larger than pk
                    int pj = currentPermutation.get(y);
                    if (pj > pk) {
                        // Swap Them
                        currentPermutation.set(k, pj);
                        currentPermutation.set(y, pk);
                        found = true;
                        break;
                    }
                }

                if ((k < size - 2) && (found)) {
                    // Reverse Order of Values to the Right (Increasing Order)
                    ArrayList<Integer> sub = new ArrayList<Integer>(currentPermutation.subList(k + 1, size));
                    for (int x = 0; x < sub.size(); x++) {
                        currentPermutation.set(size - (x + 1), sub.get(x));
                    }
                }
            }
        }
        return currentPermutation;
    }

}
