/*There are N buckets numbered 11 through N. The buckets contain balls; each ball has a color between 11 and K. Let's denote the number of balls with color j that are initially in bucket i by ,ai,j?.

For each i from 1 to N−1 (in this order), someone draws a ball uniformly at random from bucket i and puts it into bucket i+1, then continues to draw the next ball. After putting a ball in bucket N, this person draws a ball, again uniformly at random, from bucket N.

For each color from 1 to K, find the probability that the ball drawn from bucket N has this color.

Input

The first line of the input contains two space-separated integers N and K.
N lines follow. For each i (1≤ i ≤N), the i-th of these lines contains K space-separated integers ai,1?,ai,2?,…,ai,K?.
Output

Print a single line containing K space-separated real numbers. For each valid i, the i-th of these numbers should denote the probability that the last drawn ball has color i. your answer will be considered correct if absolute or relative error does not exceed 10^6

Sample Input 1

2 2

0 1

1 1

Sample Output 1

0.333333 0.666667

 */



import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read number of buckets and colors
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[n][c];

        // Read balls in each bucket
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        double[] p = new double[c]; // probability vector, initially 0

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++) {
                sum += a[i][j]; // total balls in bucket i
            }

            double[] newP = new double[c];
            for (int j = 0; j < c; j++) {
                newP[j] = (a[i][j] + p[j]) / (sum + 1.0); // add prev probability
            }

            p = newP; // update for next bucket
        }

        // Print final probability with 6 decimal places
        for (int j = 0; j < c; j++) {
            System.out.printf("%.6f ", p[j]);
        }
    }
}
