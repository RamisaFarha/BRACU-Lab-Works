import java.util.Scanner;
public class Task8l1{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the matrix");
    int n=sc.nextInt();
    int a[]=new int[n];
    int b[]=new int[n];
    for(int i=0;i<a.length;i++){
      System.out.println("Enter value for first matrix, column "+(i+1));
      a[i]=sc.nextInt();
    }
    for(int i=0;i<b.length;i++){
      System.out.println("Enter value for second matrix column "+(i+1));
      b[i]=sc.nextInt();
    }
    int c[]=new int[n];
    for(int i=0;i<c.length;i++){
      c[i]=5*a[i]-b[i];
    }
    for(int i=0;i<c.length;i++){
      System.out.print(c[i]+" ");
    }
  }
}