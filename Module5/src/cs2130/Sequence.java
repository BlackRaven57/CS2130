package cs2130;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Sequence {

    public static ArrayList<Double> Geometric(int howMany, double initialTerm, double commonRatio) {
        ArrayList<Double> terms = new ArrayList<Double>();
        double temp = initialTerm;
        // Initial Term
        terms.add(initialTerm);
        // Other Terms
        for (int i = 1; i < howMany; i++) {
            temp *= commonRatio;
            terms.add(temp);
        }
        return terms;
    }

    public static ArrayList<Double> Arithmetic(int howMany, double initialTerm, double commonDifference) {
        ArrayList<Double> terms = new ArrayList<Double>();
        double temp = initialTerm;
        // Initial Term
        terms.add(initialTerm);
        // Other Terms
        for (int i = 1; i < howMany; i++) {
            temp += commonDifference;
            terms.add(temp);
        }
        return terms;
    }
}
