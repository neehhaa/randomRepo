import java.util.*;
public class Odd {
    public int sumOfOdd(int n){
        int sum=0;
        for(int i=0; i<=n;i++){
            if (i % 2 == 1){
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Odd a = new Odd();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println(a.sumOfOdd(n));
    }
}
