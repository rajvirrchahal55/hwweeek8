package hwweek;

import java.util.Scanner;

/*10. Write a java program input sales id, seller's name, sales amount, and salary basic and then
fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%*/
public class Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Sales id:");
        int id = input.nextInt();
        System.out.println("Enter Seller's Name:");
        String name = input.next();
        System.out.println("Enter sales amount:");
        double amount = input.nextDouble();
        System.out.println("Enter basic Salary:");
        double sal = input.nextDouble();
        double com;
        if(amount >= 50000){
            com = amount*0.35;
            System.out.println("35% sale commison: "+com);
        }else if(amount>= 30000){
            com = amount*0.20;
            System.out.println("20% sale commison: "+com);
        }
        else if(amount>= 20000){
            com = amount*0.20;
            System.out.println("20% sale commison: "+com);
        }

    }
}
