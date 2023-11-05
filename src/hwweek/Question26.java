package hwweek;

import java.util.Scanner;

/*26. Write a Java program to reverse a word.
Sample Output:
Input a word: dsaf
Reverse word: fasd*/
public class Question26 {
    public static void main(String[]args) {
        Scanner input=new Scanner(System.in);
        System.out.println("input a word:");
       String input2=input.nextLine();
        char[] arr = input2.toCharArray();
        System.out.println("Reverse word :");

        String rev = "";

        for(int i = input2.length()-1 ; i >= 0; i--)
        {
            rev += input2.charAt(i);
        }

        System.out.println(rev);

    }
}





