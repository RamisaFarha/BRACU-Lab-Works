import java.util.Scanner;
public class L7T16{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter A Number:");
        int line = sc.nextInt();
        int linecount = 1;
        while(linecount<=line){
            int starcount = 1;
            int star = linecount;
            while(starcount<=star){
                if(linecount == 1 || linecount == line){
                    System.out.print("*");
                }
                else{
                    if(starcount == 1 || starcount == linecount){
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