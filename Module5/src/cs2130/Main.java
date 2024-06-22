package cs2130;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //// PART 1, Run Geometric
        System.out.println("\nGeometric Sequences:");
        // Sequence 1
        ArrayList<Double> g1 = Sequence.Geometric(18, 3, 2.3);
        System.out.println("Sequence 1: ");
        for (int i = 0; i < 17; i++) {
            System.out.format("%.3f", g1.get(i));
            System.out.print(", ");
        }
        System.out.format("%.3f", g1.get(17));

        // Sequence 2
        ArrayList<Double> g2 = Sequence.Geometric(6, 12, 3.7);
        System.out.println("\nSequence 2: ");
        for (int i = 0; i < 5; i++) {
            System.out.format("%.3f", g2.get(i));
            System.out.print(", ");
        }
        System.out.format("%.3f", g2.get(5));

        // Sequence 3
        ArrayList<Double> g3 = Sequence.Geometric(13, 8.2, 4.5);
        System.out.println("\nSequence 3: ");
        for (int i = 0; i < 12; i++) {
            System.out.format("%.3f", g3.get(i));
            System.out.print(", ");
        }
        System.out.format("%.3f", g3.get(12));


        //// PART 1, Run Arithmetic
        System.out.println("\n\nArithmetic Sequences:");
        // Sequence 1
        ArrayList<Double> a1 = Sequence.Geometric(18, 3, 2.3);
        System.out.println("Sequence 1: ");
        for (int i = 0; i < 17; i++) {
            System.out.format("%.3f", a1.get(i));
            System.out.print(", ");
        }
        System.out.format("%.3f", a1.get(17));

        // Sequence 2
        ArrayList<Double> a2 = Sequence.Geometric(6, 12, 3.7);
        System.out.println("\nSequence 2: ");
        for (int i = 0; i < 5; i++) {
            System.out.format("%.3f", a2.get(i));
            System.out.print(", ");
        }
        System.out.format("%.3f", a2.get(5));

        // Sequence 3
        ArrayList<Double> a3 = Sequence.Geometric(13, 8.2, 4.5);
        System.out.println("\nSequence 3: ");
        for (int i = 0; i < 12; i++) {
            System.out.format("%.3f", a3.get(i));
            System.out.print(", ");
        }
        System.out.format("%.3f", g3.get(12));


        //// PART 2, Run Div and Mod
        System.out.println("\n\nUsing Div and Mod:");
        // 38, 5
        System.out.println("38 div 5: " + Integers.Div(38, 5));
        System.out.println("38 mod 5: " + Integers.Mod(38, 5));
        // -38, 5
        System.out.println("-38 div 5: " + Integers.Div(-38, 5));
        System.out.println("-38 mod 5: " + Integers.Mod(-38, 5));
        // 489, 16
        System.out.println("489 div 16: " + Integers.Div(489, 16));
        System.out.println("489 mod 16: " + Integers.Mod(489, 16));
        // -489, 16
        System.out.println("-489 div 16: " + Integers.Div(-489, 16));
        System.out.println("-489 mod 16: " + Integers.Mod(-489, 16));


        //// PART 2, Run GCD and LCM
        System.out.println("\nUsing GCD and LCM:");
        // 48, 84
        System.out.println("48 & 84:");
        System.out.println("GCD: " + Integers.Gcd(48, 84));
        System.out.println("LCM: " + Integers.Lcm(48, 84));
        // 56, 68
        System.out.println("56 & 68:");
        System.out.println("GCD: " + Integers.Gcd(56, 68));
        System.out.println("LCM: " + Integers.Lcm(56, 68));
        // 20514, 24648
        System.out.println("20514 & 24648:");
        System.out.println("GCD: " + Integers.Gcd(20514, 24648));
        System.out.println("LCM: " + Integers.Lcm(20514, 24648));

    }
}
