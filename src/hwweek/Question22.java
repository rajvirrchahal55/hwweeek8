package hwweek;
/*22. Write a Java program to calculate the average value of array elements.*/
public class Question22 {
public static void main(String[]args) {
    int[] num = {10, 20, 30, 40};
    int sum=0;
    for (int i = 0; i < num.length; i++) {
        sum = sum + num[i];
    }
    System.out.println(sum);
    System.out.println("Average"+sum/4);
}
}
