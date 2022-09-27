import java.util.Scanner;
public class Task3l1{
  private  static void sort(int a[]){
    for(int i=0;i<a.length-1;i++){
      int max=a[i];
      int l=i;
      for(int j=i+1;j<a.length;j++){
        if(a[j]>max){
          max=a[j];
          l=j;
          
          int temp=a[i];
          a[i]=max;
          a[l]=temp;
        }
      }
    }
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    for (int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    sort(a);
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
    for(int i=0;i<a.length;i++){
      if(a[i]%2==0){
        System.out.println(a[i]);
      }
    }
  }
}