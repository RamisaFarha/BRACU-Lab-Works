import java.util.Scanner;
public class L7T17{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter A Number:");
        int line = sc.nextInt();
        int linecount = 1;
        while(linecount<=line){
            int numbercount = 1;
            int number = linecount;
            while(numbercount<=number){
                if(linecount == 1 || linecount == line){
                    System.out.print(numbercount);
                }
                else{
                    if(numbercount == 1 || numbercount == linecount){
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