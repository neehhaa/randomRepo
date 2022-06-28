import java.util.*;

public class Addition {

    public static int Add(int num1,int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static void main (String[] args){
        System.out.println("Enter 2 Numbers : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = Add(num1,num2);
        System.out.println(sum);
    }
}
