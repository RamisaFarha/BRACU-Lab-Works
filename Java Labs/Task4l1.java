import java.util.Scanner;
public class Task4l1{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10];
    a[0]=sc.nextInt();
    for (int i=1;i<a.length;i++){
      a[i]=sc.nextInt();
      for(int j=i-1;j>=0;j--){
        if(a[i]==a[j]){
          System.out.println("Number is already entered. Enter new number:");
          a[i]=sc.nextInt();
          j++;
        }
      }
    }
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
  }
}

