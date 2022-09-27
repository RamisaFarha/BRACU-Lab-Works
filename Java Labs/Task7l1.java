import java.util.Scanner;
public class Task7l1{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10];
    for (int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    int x=sc.nextInt();
    for(int i=0;i<1;i++){
      if(x<0||x>9){
        System.out.println("Enter the number again (b/w 0 and 9)");
        x=sc.nextInt();
        i--;
      }
    }
    for(int i=1; i<=a[x];i++){
      System.out.print("*");
    }
  }
}

