import java.util.*;
public class Vote {
    public int personAge(int age){
        if ( age >= 18) {
            System.out.println("Eligible to vote ");
        }
        else{
            System.out.println("Not Eligible ");
        }
        return age;
    }
    public static void main(String[] args){
        System.out.println("Enter the age : ");
        Scanner sc = new Scanner(System.in);
        Vote v = new Vote();
        int age = sc.nextInt();
        v.personAge(age);



    }
}
