import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int n4 = ((n%100)%10)*100+((n%100)/10)*10+(n/100);
    System.out.print(n4);
  }
}