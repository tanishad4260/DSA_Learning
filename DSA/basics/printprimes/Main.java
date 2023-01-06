import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        System.out.println("low number:");
        int low= scn.nextInt();
        System.out.println("high number:");
        int high= scn.nextInt();
        System.out.println("prime numbers between them are:");

        for(int n=low; n<=high; n++)
        { 
            int factcount=0;
            for(int i=2 ; i*i<=n ; i++)
            {
            
                if(n%i==0)
                { factcount++;
                break;
                }
            }

            if(factcount==0)
            {   System.out.println(n);}
            
        }
    }
}
