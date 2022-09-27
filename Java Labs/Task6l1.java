import java.util.Scanner;
public class Task6l1{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int l=sc.nextInt();
    int a[]=new int[l];
    for (int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    boolean flag=false;
    for(int i=0;i<a.length;i++){
      if(a[i]==a[a.length-1-i]){
        flag=true;
      }
      else{
        flag=false;
        break;
      }
    }
    if(flag==true){
      System.out.println("The array is Palindrome");
    }
    else{
      System.out.println("The array is NOT Palindrome");
    }
  }
}

