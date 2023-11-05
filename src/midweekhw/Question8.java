package midweekhw;

import java.util.Scanner;

/*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.*/
public class Question8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Number of classes held");
        int a = s.nextInt();
        System.out.println("Number of classes attended");
        int b = s.nextInt();
        double percentage = (b * 100 / a);
        if (percentage >= 75) {
            System.out.println("student is allowed to sit in exam");
        } else {
            System.out.println("student is not allowed to sit in exam");
        }
    }
}