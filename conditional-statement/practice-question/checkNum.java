import java.util.*;

public class checkNum {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to check  :");
        int a = sc.nextInt();

        if(a>0){
            System.out.println("number is positive");
        }else if(a==0){
            System.out.println("it is neutral no.");
        }
        else{
            System.out.println("number is negative");
        }
    }
    
}
