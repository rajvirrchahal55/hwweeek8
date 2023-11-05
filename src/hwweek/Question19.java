package hwweek;

import java.util.Scanner;

/*19. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”*/
public class Question19 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number");
        int num=input.nextInt();
        if(num>=1){
            System.out.println("Number is postive");
        }
        else if(num<0){
            System.out.println("Number is negative");
        }
        else if(num==0){
            System.out.println("Number is Zero");
        }
    }
}
