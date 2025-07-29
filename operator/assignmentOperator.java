import java.util.*;

public class assignmentOperator {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first no.");
        int a = sc.nextInt();
        int b;

        System.out.println("b = a means the value of a is assign in b = "+(b=a));
        System.out.println(a +"+= 1 the value of a is increment by 1 = "+(a+=1));
        System.out.println(a +" -= 1 the value of a is decrement by 1 = "+(a-=1));
        System.out.println(a+" *= 1the value of a is decrement by 1 = "+(a*=1));
        System.out.println(a+" /= 1 the value of a is decrement by 1 = "+(a/=1));

        sc.close();

    }
    
}
