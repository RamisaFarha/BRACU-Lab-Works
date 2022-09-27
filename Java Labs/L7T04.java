import java.util.Scanner;
public class L7T04{
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
                System.out.print(numbercount);
                numbercount++;
            }
            System.out.println();
            linecount++;
        }
        sc.close();
    }
}
    