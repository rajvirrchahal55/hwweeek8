package midweekhw;

import java.util.Arrays;
import java.util.Scanner;

/*Take input of age of 3 people by user and determine oldest and youngest among
them.*/
public class Question7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter age");
        int a = s.nextInt();
        System.out.println("Enter age");
        int b = s.nextInt();
        System.out.println("Enter age");
        int c = s.nextInt();
        int [] age={a,b,c};
       Arrays.stream(age).sorted();
        System.out.println("Youngest person"+age[0]);
        System.out.println("Oldest person"+age[2]);
    }
}