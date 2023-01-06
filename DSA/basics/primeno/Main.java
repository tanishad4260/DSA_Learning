import java.util.*;

public class Main{
    public static void main(String[] args){
        System.out.println("enter the amount of numbers to be checked:");
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for(int times=1 ; times<=t ; times++)
        {
            System.out.println("enter the number to be checked:");
            int n = scn.nextInt();
            int factcount=0;
            for(int i=2 ; i*i<=n ; i++)
            {
                
                if(n%i==0)
                { factcount++;
                  break;
                }
            }

            if(factcount==0)
            {   System.out.println("prime");}
            else
            {   System.out.println("not prime");}
        }
    }
}