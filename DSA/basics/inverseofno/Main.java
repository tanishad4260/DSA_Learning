import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int digits=0;
        int temp=n;


        while(temp!=0)
        {
            digits++;
            temp= temp/10;
        }

        temp=n;
        int pow=1;
        int inv=0;
        for( int i=1; i<=digits; i++)
        {
            pow= pow*10;
            int d= temp%pow;
            temp=temp/pow;
            int mul= (int)Math.pow(10,d-1);
            inv= inv + i*mul ;
        }
        
        System.out.println(inv);
    }
}