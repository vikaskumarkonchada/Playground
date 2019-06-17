import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int y = 0;
      while(n>0)
      {
        int x = n % 10;
         y = x + y;
         n = n/10;
      }
      System.out.println(y);
	}
}