import java.util.Scanner;
public class L7T22{
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
                if(linecount == 1){
                    System.out.print("*");
                }
                else{
                    if(starcount == 1 || starcount == star){
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
        int line1 = line-1;
        int linecount1 = line1;
        while(linecount1>=1){
            int spacecount1 = line1-linecount1+1; 
            while(spacecount1>=1){
                System.out.print(" ");
                spacecount1--;
            }
            int starcount1 = linecount1*2-1;
            while(starcount1>=1){
                if(linecount1 == 1){
                    System.out.print("*");
                }
                else{
                    if(starcount1 == 1 || starcount1 == linecount1*2-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                starcount1--;
            }
            linecount1--;
            System.out.println();
        }
        sc.close();
    }
}