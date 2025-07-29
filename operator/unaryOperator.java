import java.util.*;
public class unaryOperator{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first no.");
        int a = sc.nextInt();
        System.out.println("Enter your second no.");
        int b = sc.nextInt();

        // pre-increment/pre-decrement operator => ++ or -- use befor the operands thats result is, it will first change and then use according to sign 


       int c = ++a;
       int d = --b;

       System.out.println("value of a = "+ a);
       System.out.println("value of c = "+ c);
       System.out.println("value of b = "+ b);
       System.out.println("value of d = "+ d);

       System.out.println("Enter your third no.");
       int f = sc.nextInt();
       System.out.println("Enter your forth no.");
       int g = sc.nextInt();

       // post-increment/post-decrement operator => ++ or -- use after the operands that's result is, it will first use and then change according to sign 

       int h = f++;
       int i = g--;

       System.out.println("value of f = "+ f);
       System.out.println("value of h = "+ h);
       System.out.println("value of g = "+ g);
       System.out.println("value of i = "+ i);

        
    }
}