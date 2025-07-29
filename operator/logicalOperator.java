import java.util.*;
public class logicalOperator {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter your first no.");
        int a = sc.nextInt();

        
        System.out.println("Enter your second no.");
        int b = sc.nextInt();

        // logical and => denoted by (&&) , it return true value when the both condition will be true other wise return false

        System.out.println((a > b)&&(a>=b));
        System.out.println((a != b)&&(a==b));

        // logical or => denoted by (||) , it return false value when the both condition will be false other wise return false

        System.out.println((a > b)||(a>=b));
        System.out.println((a != b)||(a==b));




    }
    
}
