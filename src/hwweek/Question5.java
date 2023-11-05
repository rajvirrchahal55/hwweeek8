package hwweek;
/*5. Write a java program to input student Name, roll No, and three subjects Math, Science and English
marks (marks is between 0 to 100 and if it is out of range print error message “InvalidInput, Marks
should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format*/

import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student name:");
        String n = input.nextLine();
        System.out.println("Enter roll number:");
        int r = input.nextInt();
        System.out.println("Enter marks in Math subject:");
        int m = input.nextInt();
        if (m>100){
            System.out.println("InvalidInput, Marks\n" +
                    "should between 0 to 100");
            System.out.println("Enter marks in Math subject again:");
            m = input.nextInt();
        }
        System.out.println("Enter marks in Science subject:");
        int s = input.nextInt();
        if(s>100){
            System.out.println("InvalidInput,Marks\n"+
                    "Marks should be between 0 to 100");
            System.out.println("Enter marks in Science subject again:");
            s = input.nextInt();
        }
        System.out.println("Enter marks in English subject:");
        int e = input.nextInt();
        if(e>100){
            System.out.println("InvalidInput,Marks\n"+
                    "Marks should be between 0 to 100");
            System.out.println("Enter marks in english subject again:");
            e = input.nextInt();
        }
        int t = m + s + e;
        double p = t*100/300;
        String g = null;
        if (p <= 35){
            g = "F";
        } else if (p >=35 ){
            g = "C";
        } else if(p >=50 ){
            g = "B";
        }
        else if(p >=60 ){
            g = "A";
        }
        else if(p >=80){
            g = "A+";
        }

        System.out.println("Total Marks=" + t);
        System.out.println("Percentage =" + p);
        System.out.println("Grade =" + g);
        System.out.println("__________________________________________________");
        System.out.println("|                     Marksheet                  |\n|________________________________________________|");
        System.out.println("|     Name: "+ n +"                               |\n|     Roll: " + r + "                                   |");
        System.out.println("|                                                |\n|                                                |");
        System.out.println("|________________________________________________|\n|     Subjects        :            MARKS         |");
        System.out.println("|________________________________________________|\n|     Math            :           " + m +"             |");
        System.out.println("|     Science         :           " + s + "             |\n|     English         :           " + e + "              |");
        System.out.println("|________________________________________________|\n|     Total           :            " + t + "            |");
        System.out.println("|________________________________________________|\n|     Percentage      :           " + p + "           |");
        System.out.println("|________________________________________________|\n|     Result          :           " + r + "             |");
        System.out.println("|     Grade           :           " +g+ "              |\n|________________________________________________|");








    }
}