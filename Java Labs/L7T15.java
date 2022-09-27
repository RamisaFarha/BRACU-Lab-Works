import java.util.Scanner;
public class L7T15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The Number Of Raw:");
        int raw = sc.nextInt();
        System.out.println("Please Enter The Number Of column:");
        int column = sc.nextInt();
        int linecount = 1;
        while(linecount<=raw){
            int numbercount = 1;
            while(numbercount<=column){
                if(linecount == 1 || linecount == raw){
                    System.out.print(numbercount);
                }
                else{
                    if(numbercount == 1 || numbercount == column){
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