import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int k= scn.nextInt();
        int temp=n;

        int digits=0;
        while(temp!=0)
        {   digits++;
            temp=temp/10;
        }
        
        k=k%digits;

        if(k<0)
        {   k+= digits;}

        int t= digits-k;
        int mul= (int)Math.pow(10,t);
        int pow= (int)Math.pow(10,k);

        int left= n%pow;
        int right= n/pow;
        int rnum= (left * mul) + right;
        System.out.println(rnum);
        
    
    }
    
}