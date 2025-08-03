import java.util.*;

public class calculatorSum {

    // method overloading => same name but different parameter
    public static int sum(int a,int b){

        int sumVlue = a+b;
        return sumVlue;
    }
    public static int sum(int a,int b,int c){

        int sumVlue = a+b+c;
        return sumVlue;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number :");
        int a = sc.nextInt();

        System.out.println("Enter the second number :");
        int b = sc.nextInt();

        System.out.println("Enter the third number :");
        int c = sc.nextInt();

        
        System.out.println("sum of "+a+" and "+b+" is "+sum(a, b));
        System.out.println("sum of "+a+","+b+" and "+c+" is "+sum(a,b,c));


    }
    
}
