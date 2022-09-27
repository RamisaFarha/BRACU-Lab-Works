import java.util.Scanner;
public class L7T01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter A Number:");
        int number = sc.nextInt();
        int numbercount = 1;
        while(numbercount<=number){
            System.out.print(numbercount);
            numbercount++;
        }
        sc.close();
    }
}