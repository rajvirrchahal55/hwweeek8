package hwweek;
/*7. Write a java program to input any number and find out if it’s odd or even.*/


import java.util.Scanner;
public class Question7 {
    public static void main(String[]args){
     Scanner input=new Scanner(System.in);
      System.out.println("Enter number");
      int n= input.nextInt();
        if(n % 2 == 0)
            System.out.println(n + " is even");
        else
            System.out.println(n + " is odd");





    }








}
