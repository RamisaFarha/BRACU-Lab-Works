import java.util.Scanner;
public class L7T13{
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
        int line1 = line-1;
        int linecount1 = line1;
        while(linecount1>=1){
            int spacecount1 = line1-linecount1+1; 
            while(spacecount1>=1){
                System.out.print(" ");
                spacecount1--;
            }
            int numbercount1 = linecount1*2-1;
            while(numbercount1>=1){
                System.out.print(numbercount1);
                numbercount1--;
            }
            linecount1--;
            System.out.println();
        }
        sc.close();
    }
}