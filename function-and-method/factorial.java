import java.util.*;

public class factorial{

    public static int factValue(int num){

        int factVal = 1;
        for (int i = 1; i <= num; i++) {
             factVal *= i ;
        }
        return factVal;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number for factorial :");
        int num = sc.nextInt();

        System.out.println("factorial value of "+num+" is "+factValue(num));         

    }
}
