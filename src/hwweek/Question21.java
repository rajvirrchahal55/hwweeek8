package hwweek;
/*21. Write a Java program to sum values of an array.*/
public class Question21 {
    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5};
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        System.out.println("Sum of all the elements of an array: " + sum);
    }

}