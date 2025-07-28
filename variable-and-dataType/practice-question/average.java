import java.util.*;
public class average {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first no. ");
        float a = sc.nextFloat();

        System.out.print("Enter your second no. ");
        float b = sc.nextFloat();

        System.out.print("Enter your third no. ");
        float c = sc.nextFloat();

        double average =( a+b+c)/3;

        System.out.println("Average value is : "+ average);


    }
}
