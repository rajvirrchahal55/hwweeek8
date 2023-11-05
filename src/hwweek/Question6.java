package hwweek;

import java.util.Scanner;

/*6. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Grosssalary
        HRA = basic salary 10%
        DA = Basic salary 8%
        TA = Basic salary 9%
        PF= Basic salary 20%
        Gross salary = basic salary + HRA + TA + DA –PFPrint in following format*/
public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Employee id:");
        String id = input.nextLine();
        System.out.println("Enter Name:");
        String name = input.nextLine();
        System.out.println("Enter basic Salary:");
        double sal = input.nextDouble();
        double hra = sal*0.10;
        double da = sal*0.08;
        double ta = sal*0.09;
        double pf = sal*0.20;
        double gross = sal + hra + ta + da - pf;

        System.out.println(gross + " = " + sal + " + " + hra + " + " + da + " + " + ta + " - " + pf);


    }
}
