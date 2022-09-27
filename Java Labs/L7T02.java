import java.util.Scanner;
public class L7T02{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter A Number:");
        int star = sc.nextInt();
        int starcount = 1;
        while(starcount<=star){
            System.out.print("*");
            starcount++;
        }
        sc.close();
    }
}