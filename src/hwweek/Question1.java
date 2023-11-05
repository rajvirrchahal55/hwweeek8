package hwweek;



/*1. Write a java program that tells us that Input number is odd or even? HINT: use ternary
operator (? :)*/
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter Number:");
        int a= input.nextInt();
        if (a % 2 == 0) {
            System.out.println("Number is even");
        } else
            System.out.println("Number is odd");
    }
}