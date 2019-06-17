import java.io.*;
import java.util.*;
class Main{
  public static double exponent(int a,int b){
    double x = Math.pow(a,b);
    return x;
  }
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int n2 = in.nextInt();
    double x1 = exponent(n1,n2);
    System.out.println(x1);
  }
}