import java.util.*;
public class Table {
    public int multi(int num){
        for(int i = 1; i <= 10; i++){
            System.out.println(num+" X "+i+" = "+(num * i));
        }
        return num;
    }
    public static void main(String[] args){
        System.out.println("Enter a number : ");
        Table b = new Table();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        b.multi(num);
    }
}
