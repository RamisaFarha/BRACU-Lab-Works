import java.util.Scanner;
public class Task2{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10];
    int r=1;
    for(int c=0;c<a.length;c++){
      System.out.print("Enter a number");
      a[c]=sc.nextInt();
    }
    System.out.print("Enter a number between 0 and 9");
    int n=sc.nextInt();
    for (int i=0;i<r;i++){
      if(n>=0&&n<=9){
        System.out.println(a[n]);
      }
      else{
        System.out.print("Enter a number between 0 and 9");
        n=sc.nextInt();
        i--;
      }
    }
  }
}