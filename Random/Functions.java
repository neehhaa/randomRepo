import java.sql.SQLOutput;
import java.util.*;

public class Functions {

    public static void myName(String name,int age){
        System.out.println("Name : "+name + " and Age : " + age);
        return;
    }

    public static void main (String[] args){
        System.out.println("Enter Name and Age : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        myName(name,age);
    }
}
