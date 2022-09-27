import java.util.Scanner;
public class L7T05{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter A Number:");
        int line = sc.nextInt();
        int linecount = 1;
        while(linecount<=line){
            int starcount = 1;
            int star = linecount;
            while(starcount<=star){
                System.out.print("*");
                starcount++;
            }
            linecount++;
            System.out.println();
        }
        sc.close();
    }
}