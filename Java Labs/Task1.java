import java.util.Scanner;
public class Task1{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a[]=new int[3];
    int sum=0;
    for(int c=0;c<a.length;c++){
      System.out.print("Enter a number");
      a[c]=sc.nextInt();
    }
    for(int c=0;c<a.length;c++){
      sum=sum+a[c];
    }
    System.out.println(sum);
    for(int c=0;c<a.length;c++){
      System.out.println(a[c]);
    }
  }
}