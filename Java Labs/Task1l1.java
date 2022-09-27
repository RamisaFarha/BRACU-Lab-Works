import java.util.Scanner;
public class Task1l1{
  public static boolean firstLast6(int a[]){
    if(a[0]==6||a[a.length-1]==6){
      return true;
    }
    else{
      return false;
    }
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int l=0;
    for(int i=0;i<1;i++){
      l=sc.nextInt();
      if(l<=0){
        i--;
      }
    }
    int a[]=new int[l];
    for (int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    System.out.print(firstLast6(a));
  }
}
