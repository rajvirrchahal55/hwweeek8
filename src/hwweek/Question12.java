package hwweek;
/*12. Same as above program-8 using switch statement.*/
import java.util.Scanner;

/*12. Same as above program-8 using switch statement.*/
public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet between A to F");
        String city = sc.next();
        switch (city) {
            case "A":
                System.out.println("Austin");
                break;
            case "B":
                System.out.println("Boston");
                break;
            case "C":
                System.out.println("Chicago");
                break;
            case "D":
                System.out.println("Dallas");
                break;
            case "E":
                System.out.println("Elk Grove");
                break;
            case "F":
                System.out.println("fresno");
                break;
            default:
                System.out.println("error invalid input");
        }
    }
}