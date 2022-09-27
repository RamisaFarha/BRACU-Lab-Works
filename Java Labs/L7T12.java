import java.util.Scanner;
public class L7T12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter A Number:");
        int line = sc.nextInt();
        int linecount = 1;
        while(linecount<=line){
            int spacecount = 1;
            int space = line - linecount;
            while(spacecount<=space){
                System.out.print(" ");
                spacecount++;
            }
            int starcount = 1;
            int star = linecount*2-1;
            while(starcount<=star){
                System.out.print("*");
                starcount++;
            }
            
            linecount++;
            System.out.println();
        }
        int linecount1 = line-1;
        while(linecount1>=1){
            int spacecount1 = line-linecount1; 
            while(spacecount1>=1){
                System.out.print(" ");
                spacecount1--;
            }
            int starcount1 = linecount1*2-1;
            while(starcount1>=1){
                System.out.print("*");
                starcount1--;
            }
            linecount1--;
            System.out.println();
        }
        sc.close();
    }
}