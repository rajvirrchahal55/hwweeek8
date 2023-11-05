package midweekhw;

import java.util.Scanner;

/*1. Take 10 integers from keyboard using loop and print their average value on the
screen.*/
public class Question1 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int sum=0;
        for(int i=1;i<=10;i++){
         System.out.println(i+ " enter number");
         sum+=a.nextInt();}
         double average=(double)sum/10;
        System.out.println("Average of number"+average);
    }
}