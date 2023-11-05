package midweekhw;

import java.util.Scanner;

/*Take two int values from user and print greatest among them.*/
public class Question5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first value");
        int a = s.nextInt();
        System.out.println("Enter second value");
        int b = s.nextInt();
        if (a > b) {
            System.out.println(a + " is bigger then " + b);}
            else if(b>a){
                System.out.println(b+" is bigger then "+a);
        } else {
            System.out.println(a + " is equal to " + b);
        }
    }
}