import java.util.Scanner;
public class Task9l1{
  public static void displayArray(int a[],int l){
    for(int i=0;i<l;i++){
      System.out.print(a[i]+" ");
    }
    System.out.println();
  }
  public static void squareArray(int a[],int l){
    for(int i=0;i<l;i++){
      a[i]*=a[i];
      System.out.print(a[i]+" ");
    }
    System.out.println();
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10];
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    displayArray(a,a.length);
    squareArray(a,a.length);
  }
}