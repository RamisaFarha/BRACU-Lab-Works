import java.util.Scanner;
public class L7T25{
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
        while(numbercount<=linecount){
            System.out.print(numbercount);
            numbercount++;
        }
        int numbercount1 = linecount-1;
        while(numbercount1>=1){
            System.out.print(numbercount1);
            numbercount1--;
        }
            linecount++;
            System.out.println();
        }
        sc.close();
    }
}