import java.util.*;
public class Factorial {
    public int Fact(int num){
        if(num<0) {
            System.out.println("Invalid input");

        }
        int fact = 1;
        for(int i=num;i>=1;i--) {
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args)
    {
        Factorial x = new Factorial();
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Factorial is "+ x.Fact(num));
    }
}
