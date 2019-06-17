import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int f=n;
      int sum = 0;
      while(n>10)
      {
        n=n/10;
      }
      sum = sum+n;
      n=f%10;
      sum=sum+n;
      System.out.println(sum);
    }
}
        
	