import java.util.*;
public class EvenOdd {
    public int Even(int num){
        if(num % 2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        return num;
    }
    public static void main(String[] args){
        System.out.println("Enter the number : ");
        EvenOdd a = new EvenOdd();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        a.Even(num);
    }
}
