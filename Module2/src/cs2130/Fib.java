package cs2130;

import java.math.BigInteger;

public class Fib {

    static BigInteger recurseFib(int n){
        //TODO:
        /*Return the nth fibonacci number.  Use recursion to calculate */
        BigInteger z = null;
        if (n == 0) {
            z = BigInteger.valueOf(0);
        }
        else if (n == 1) {
            z = BigInteger.valueOf(1);
        }
        else {
            z = recurseFib(n-1).add(recurseFib(n-2));
        }
        return z;
    }

    static BigInteger fastFib(int n){
        //TODO:
        /*Return the nth fibonacci number.  Use an loop to calculate
        Start with the first two numbers and then repeatedly calculate the next number
         */
        long[] arr = new long[n+1];
        BigInteger num;
        arr[0] = 0;
        num = BigInteger.valueOf(arr[0]);
        if (n > 0) {
            arr[1] = 1;
            num = BigInteger.valueOf(arr[1]);
        }
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i-2] + arr[i-1];
            num = BigInteger.valueOf(arr[n]);
        }
        return num;
    }

    static BigInteger matrixFib(int n){
        BigInteger mat[][] = new BigInteger[][]{{BigInteger.valueOf(1),BigInteger.valueOf(1)},
                                                {BigInteger.valueOf(1),BigInteger.valueOf(0)}};
        if (n < 2)
            return BigInteger.valueOf(n);
        matrixPow(mat, n-1);

        return mat[0][0];
    }

    static void matrixPow(BigInteger[][] A, int n){
        if(n==1){
            return;
        }
        BigInteger copy[][] = {{A[0][0], A[0][1]}, {A[1][0], A[1][1]}};

        matrixPow(A, n/2);
        matrixMultiply(A, A);
        if(n%2 != 0){
            matrixMultiply(A, copy);
        }
    }

    static void matrixMultiply(BigInteger[][] A, BigInteger[][] B){
        BigInteger w = A[0][0].multiply(B[0][0]).add(A[0][1].multiply(B[1][0]));
        BigInteger x = A[1][0].multiply(B[0][0]).add(A[1][1].multiply(B[1][0]));
        BigInteger y = A[0][0].multiply(B[0][1]).add(A[0][1].multiply(B[1][1]));
        BigInteger z = A[1][0].multiply(B[0][1]).add(A[1][1].multiply(B[1][1]));

        A[0][0] = w;
        A[1][0] = x;
        A[0][1] = y;
        A[1][1] = z;
    }


}
