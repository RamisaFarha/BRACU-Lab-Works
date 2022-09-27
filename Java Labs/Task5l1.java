import java.util.Scanner;
public class Task5l1{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a[]=new int[15];
    for (int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
      if(a[i]<0||a[i]>9){
        System.out.print("Please, enter tne number b/w 0 and 9:");
        i--;
      }
    }
    for(int j=0;j<=9;j++){
      int c=0;
      for(int i=0;i<a.length;i++){
        if(a[i]==j){
          c++;
        }
      }
      System.out.println(j+" was found "+c+" times.");
    }
  }
}

