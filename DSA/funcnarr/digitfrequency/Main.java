import java.util.*;

public class Main {

    public static int digitfreq(int num, int digit) {
        int temp= num;
        int x= digit;
        int count=0;
        while(temp!=0)
        {  int r=temp%10;
            temp=temp/10;
            if (r==x)
            {count++;}
         }
         return count;
        
    }

    public static void main(String args[]) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int d= scn.nextInt();
        int freq= digitfreq(n,d);
        System.out.println(freq);
        
    }
    
}
