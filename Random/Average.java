import java.util.*;
public class Average {
    public int avgNumber(int num1, int num2, int num3){
        int avg = (num1+num2+num3)/3;
        return avg;
    }
    public static void main(String[] args){
        System.out.println("Enter three number : ");
        Average a = new Average();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("Average is : "+ a.avgNumber(num1,num2,num3));

    }
}
