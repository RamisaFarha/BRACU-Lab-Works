import java.util.Scanner;
public class L7T10{
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
            int numbercount = 1;
            int number = linecount*2-1;
            while(numbercount<=number){
                System.out.print(numbercount);
                numbercount++;
            }
            linecount++;
            System.out.println();
        }
        sc.close();
    }
}