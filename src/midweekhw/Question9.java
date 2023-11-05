package midweekhw;

import java.util.Scanner;

/*Modify the above question to allow student to sit if he/she has medical cause. Ask
user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.*/
public class Question9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter medical cause or not Y or yes and N or No )");
        String e = s.nextLine().toLowerCase();
        System.out.println("Number of classes held");
        int a = s.nextInt();
        System.out.println("Number of classes attended");
        int b = s.nextInt();
        double percentage = (b * 100 / a);
        if (percentage >= 75 || e.equalsIgnoreCase("y")) {
            System.out.println("student is allowed to sit in exam");
        } else {
            System.out.println("student is not allowed to sit in exam");
        }


    }
}
