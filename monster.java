//qquestion:we will be given monsters powers and monster killing bonus and our power. you can kill only when our power is grater than or equal to monster .everytime monster is killed its bonus is added to our power.find max monsters to be killed.

import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int poweri[]= new int[n];
        int bonusi[]= new int[n];
         System.out.println("experience");
        int experience = sc.nextInt();
       
        
        for(int i=0;i<n;i++)
        {
             System.out.println("enter poweri at"+(i+1));
            poweri[i]= sc.nextInt();
            
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("enter bonusi at"+(i+1));
            bonusi[i]= sc.nextInt();
        }
        int maxpoweri = Integer.MIN_VALUE;
        int mon=0;
        int m=0;
        int k=0;
        while(  m<n)
        {
            k=0;
            
            maxpoweri = Integer.MIN_VALUE;
            
        for(int i=0;i<n;i++)
        {
            if(poweri[i]<=experience && bonusi[i]>=maxpoweri)
            {
                maxpoweri = bonusi[i];
                mon =i;
                 
                 k++;
            }
        
            
        }
      
        if(k==0)
        {
            break;
        }
        
       
        experience += bonusi[mon];
        
        poweri[mon]=Integer.MAX_VALUE;
        bonusi[mon]=Integer.MIN_VALUE;
        m++;
       
        
        }
        System.out.println("maximum monisters can be killed are"+m);
        
    }
}
