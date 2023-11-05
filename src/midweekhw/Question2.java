package midweekhw;

/*2. Print multiplication table of 24, 50 and 29 using loop.*/
public class Question2 {
    public static void main(String[] args) {
       int a=24;
       int b=50;
       int c=29;
       table(a);
       table(b);
       table(c);
    }
   public static void table(int n) {
       System.out.println("table" + n);
       for (int i = 1; i <= 10; i++) {

           System.out.println(i + "*" + n+ "=" +(i*n));
       }


   }
}