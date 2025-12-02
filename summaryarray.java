//summary array - You are given an array of size N.

//An array A is considered a summer array if all the even values in A are on one side and odd values are on the other side.

//You are allowed to swap two adjacent elements in A in one operation. Find the minimum swap operations required to change A into a summer array.

//Input Format

//The first line contains an integer N, denoting the number of elements in A. Each line i of the N subsequent lines (where 0 <= i <= N) contains an integer describing A[i].
///Sample Input 3

///6

//1

//2

//3

//4

//5





// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("enter n");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int pos=0;
        int swapleftodd=0;
        int swaplefteven=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                swaplefteven+= i-pos;
                pos++;
            }
        }
        pos=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==1)
            {
                swapleftodd+= i-pos;
                pos++;
            }
        }
        
        System.out.println(Math.min(swapleftodd,swaplefteven));
    }
}

//6

//Sample Output 3

//3 
