//linear search
import java.util.*;
import java.io.*;

public class Main {

    public static int findelement( int [] a, int e)
    {
        int ind=-1;
        for (int i=0; i<a.length; i++)
        {   if (a[i]==e)
                { ind=i; 
                  break;
                } 
        }
        return ind;
    }

    public static void main(String args[]) throws Exception {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int [] arr= new int[n];
        
        for (int i=0; i<n; i++)
        {   arr[i]= scn.nextInt(); }

        int d= scn.nextInt();

        int index= findelement(arr, d);
        System.out.println(index);
        
    }
    
}
