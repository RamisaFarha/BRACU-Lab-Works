import java.util.Scanner;
public class L7T24{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter A Number:");
        int number = sc.nextInt();
        int numbercount = 1;
        while(numbercount<=number){
            System.out.print(numbercount);
            numbercount++;
        }
        int numbercount1 = number-1;
        while(numbercount1>=1){
            System.out.print(numbercount1);
            numbercount1--;
        }
        sc.close();
    }
}