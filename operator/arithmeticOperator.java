import java.util.*;
public class arithmeticOperator{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first no.");
        int a = sc.nextInt();

        System.out.println("Enter your second no.");
        int b = sc.nextInt();

       

        System.out.println("sum of first no. and second no. is "+ (a+b));
        System.out.println("sub of first no. and second no. is " +(a-b));
        System.out.println("multiplication of first no. and second no. is "+(a*b));
        System.out.println("division of first no. and second no. is "+(a/b));
        System.out.println("modulo of first no. and second no. is "+ (a%b));
    }
}