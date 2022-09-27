import java.util.Scanner;
public class Task2l1{
  private static void maxMinSwap(int a[]){
    int max=0,min=0;
    int maxIn=0,minIn=0;
    for(int i=0;i<a.length;i++){
      if(a[i]>max){
        max=a[i];
        maxIn=i;
      }
      if(a[i]<min){
        min=a[i];
        minIn=i;
      }
    }
    int temp=max;
    a[maxIn]=min;
    a[minIn]=temp;
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10];
    for (int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    maxMinSwap(a);
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
  }
}
