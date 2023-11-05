package hwweek;
/*Write a java program to get numbers from users and print whether it is positive or negative.*/
import java.util.Scanner;
public class Question8 {
    public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    System.out.println("enter any number");
    int n = input.nextInt();
    if(n>0){
        System.out.println(n+"Number is positive");}
    else if (n<0){
    System.out.println(n+"Number is negative");}
    }
}
