import java.util.*;

public class Main{
    public static void main(String args[]) {
        System.out.println("Enter a number:");
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        System.out.println("Prime factorisation for the no. is:");
        for (int i=2; i*i<=n; i++)
        {
            while (n%i==0)
            {   n=n/i;
                System.out.println(i + "checkpoint");
            }   
        }
        if (n!=1)
            {   System.out.println(n);}
        }
}