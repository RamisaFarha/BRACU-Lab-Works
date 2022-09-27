import java.util.Scanner;
public class Task6{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10];
    for(int c=0;c<a.length;c++){
      System.out.print("Enter a number");
      a[c]=sc.nextInt();
    }
    for (int i=a.length-1;i>=0;i--){
      if(a[i]%2!=0){
        System.out.println(a[i]);
        break;
      }
    }
  }
}