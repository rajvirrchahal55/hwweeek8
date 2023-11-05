package midweekhw;

import java.util.Scanner;

/*Take values of length and breadth of a rectangle from user and check if it is square or not.*/
public class Question4 {
    public static void main(String[]args){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter first value");
        int b=a.nextInt();
        System.out.println("Enter second value");
        int c=a.nextInt();
        if(b == c){
            System.out.println("it is Square");}
            else{
                System.out.println("it is rectangle");
        }

    }
}
