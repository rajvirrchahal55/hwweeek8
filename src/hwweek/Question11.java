package hwweek;
/*11. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) ifany
other alphabet should be invalid entry.*/
import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
       // String A = "A";
       // String B = "B";
        //String C = "C";
       // String D = "D";
        //String E = "E";
        //String F = "F";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter character between A to F : ");
        String city = input.next();
        if(city.equals("A"))
                System.out.println("Austin");
            else if(city.equals("B"))
                System.out.println("Boston");
            else if(city.equals("C"))
                System.out.println("Chicago");
            else if(city.equals("D"))
                System.out.println("Dallas");
               else if(city.equals("E"))
                System.out.println("Elk Grove");
            else if (city.equals("F"))
            System.out.println("Fresno");
           else{
                System.out.println("Invalid Input");
        }

    }
}
