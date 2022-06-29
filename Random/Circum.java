import java.util.*;
public class Circum {
    public double Circle(double radius){
        double circum = 2*(22f/7)*radius;
        return circum;
    }
    public static void main(String[] args){
        Circum c = new Circum();
        System.out.println("Enter radius : ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        System.out.println("Circumference is : "+c.Circle(radius));


    }
}
