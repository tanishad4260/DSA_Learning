import java.util.*;

public class Main {

  public static void main(String[] args) {
    // input - don't change this code
    Scanner scn = new Scanner(System.in);
    int marks = scn.nextInt();
    // input - don't change this code

    if (marks>90)
    System.out.println("excellent");
    if (80<marks && marks<=90)
    System.out.println("good");
    if(70<marks && marks<=80)
    System.out.println("fair");
    if(60<marks && marks<=70)
    System.out.println("meets expectations");
    if (marks<=60)
    System.out.println("below par");
    
      
  }
}
