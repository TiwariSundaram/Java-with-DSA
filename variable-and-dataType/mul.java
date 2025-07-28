import java.util.*;
public class mul{
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter your first no.");
     int a = sc.nextInt();

     System.out.println("Enter your second no.");
     int b = sc.nextInt();

     System.out.println("Enter your third no.");
     int c = sc.nextInt();

     int mul = a * b * c;

     System.out.print("mul of "+a+","+b +" and "+c+" is "+mul);
    }
}