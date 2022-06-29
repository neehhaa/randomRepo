import java.util.Scanner;
public class Greater {
    public int greaterNum(int num1, int num2){
        int great = 0;
        if(num1>num2){
            great = num1;
        }
        else{
            great = num2;
        }
        return great;
    }
    public static void main(String[] args){

        System.out.println("Enter two numbers : ");
        Greater g = new Greater();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Greatest number is : "+g.greaterNum(num1,num2));

    }
}
