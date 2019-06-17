import java.util.Scanner;
class Main{
  public static int sum_of_numbers(int num){
    int sod = (num)*(num+1)/2;
    return sod;
  }
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int sod1 = sum_of_numbers(n);
    System.out.print(sod1);
  }
}