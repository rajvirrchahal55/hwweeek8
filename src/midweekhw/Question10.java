package midweekhw;

import java.util.Scanner;

/*Write a program to print the sum of two numbers entered by user by defining your
own method.*/
public class Question10 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number");
        int num=input.nextInt();
        System.out.println("Enter second number");
        int num2=input.nextInt();
        System.out.println("Sum of two numbers:"+(num+num2));
    }
}
