import java.util.*;
public class areaOfSquare {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side value of square : ");
        float side = sc.nextFloat();

        double areaOfSq = side*side;

        System.out.println(areaOfSq);
    }
    
}
