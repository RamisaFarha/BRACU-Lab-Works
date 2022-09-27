import java.util.Scanner;
public class L7T14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The Number Of Raw:");
        int raw = sc.nextInt();
        System.out.println("Please Enter The Number Of column:");
        int column = sc.nextInt();
        int linecount = 1;
        while(linecount<=raw){
            int starcount = 1;
            while(starcount<=column){
                if(linecount == 1 || linecount == raw){
                    System.out.print("*");
                }
                else{
                    if(starcount == 1 || starcount == column){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                starcount++;
            }
            linecount++;
            System.out.println();
        }
        sc.close();
    }
}