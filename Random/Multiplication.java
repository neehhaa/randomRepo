import java.util.*;
public class Multiplication {

    public int multiply(int num1, int num2)
    {
//        int product = num1 * num2;
//        return product;
        return num1 * num2;
    }

    public static void main(String[] args)
    {
        Multiplication x = new Multiplication();
        System.out.println("Enter two numbers : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        //int product = x.multiply(num1,num2);
         System.out.println("product is : " + x.multiply(num1,num2));
        //System.out.println("product is : " + product);

    }
}
