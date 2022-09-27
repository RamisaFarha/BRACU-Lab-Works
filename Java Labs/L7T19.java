import java.util.Scanner;
public class L7T19{
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
            int numbercount = line-linecount+1;
            int number = line;
            while(numbercount<=number){
                if(linecount == 1 || linecount == line){
                    System.out.print(numbercount);
                }
                else{
                    if(numbercount == line-linecount+1 || numbercount == line){
                        System.out.print(numbercount);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                numbercount++;
            }
            linecount++;
            System.out.println();
        }
        sc.close();
    }
}