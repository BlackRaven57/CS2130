package cs2130;

public class Integers {

    public static int Div(int number, int divisor) {
        int q = 0;
        int r = number;
        // If number is positive
        if (number >= 0) {
            while (r >= divisor) {
                q += 1;
                r -= divisor;
            }
        }
        // If number is negative
        else {
            while (r < 0) {
                q -= 1;
                r += divisor;
            }
        }
        return q;
    }

    public static int Mod(int number, int divisor) {
        int q = 0;
        int r = number;
        // If number is positive
        if (number >= 0) {
            while (r >= divisor) {
                q += 1;
                r -= divisor;
            }
        }
        // If number is negative
        else {
            while (r < 0) {
                q -= 1;
                r += divisor;
            }
        }
        return r;
    }

    public static int Gcd(int i, int j) {
        int x = i;
        int y = j;
        if (y < x) {
            y = i;
            x = j;
        }
        int r = Integers.Mod(y, x);
        while (r != 0) {
            y = x;
            x = r;
            r = Integers.Mod(y, x);
        }
        return x;
    }

    public static int Lcm(int x, int y) {
        // Call Gcd Function
        int gcd = Integers.Gcd(x, y);
        int lcm = (x * y) / gcd;
        return lcm;
    }
}
