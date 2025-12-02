//You are given an integer N.

//You have to choose a set of integers S from the range [1, N-1] such that the product of integers in S is 1 modulo N. This means that if N=5, we can choose set S = [1,2,3] as the product is 6 and 6 modulo 5 is 1.

//Find the length of the biggest set S you can choose.

//Input Format

//
//The first line contains an integer N, denoting the given integer.
//Sample Input 1    =7

//Sample Output 1   =5




import java.util.Scanner;

public class Main

{

    public static int fact(int num)

    {

        if(num>0)

        return num * fact(num-1);

        else

        return 1;

    }

 

public static void main(String[] args)

{

Scanner sc = new Scanner(System.in);

int N,i;

N = sc.nextInt();

int a[] = new int[N];

for(i=0;i<N;i++)

   {

     a[i]=i+1;

   }

for(int x =N-1;x>=1;x--)

        {

            int y = fact(x);

            if (y%N == 1)

            {

                System.out.print(x);

                break;

            }

        }                            

   }

}
