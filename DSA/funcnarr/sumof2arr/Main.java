import java.io.*;
import java.util.*;

public class Main{

    public static int [] sum( int [] a, int [] b, int n)
    {   int carry=0;
        for(int i=n; i<=0; i--)
        {   int [] narr= new int[n];
            narr[i]=a[i]+b[i]+carry;
            if(narr[i]>9)
            {   narr[i]=narr[i]%10;
                carry= narr[i]/10;
            }
        }
        return narr;
    }

public static void main(String[] args) throws Exception {
    Scanner scn= new Scanner(System.in);
    int n1= scn.nextInt();
    for (int i=0; i<n1; i++)
    {   int [] a= new int[n1];
        a[i]=scn.nextInt();
    }

    int n2= scn.nextInt();
    for (int i=0; i<n1; i++)
    {   int [] b= new int[n1];
        b[i]=scn.nextInt();
    }

    if(n1>n2)
    {int n=n1;}
    else
    { int n=n2;}
    int sum= sum(a,b,n);
    System.out.println(sum);
    }

}