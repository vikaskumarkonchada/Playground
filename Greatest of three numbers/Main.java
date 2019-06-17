import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int n1 = in.nextInt();
    int n2 = in.nextInt();
    if(n>n1){
      if(n>n2){
        System.out.print(n);
      }
      else{
        System.out.print(n2);
      }
    }
    else{
      if(n1>n2){
        System.out.print(n1);
      }
      else{
        System.out.print(n2);
      }
    }
  }
}