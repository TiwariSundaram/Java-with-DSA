import java.util.*;

public class if_else {
    
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the your marks : ");
        int a = sc.nextInt();

        if (a>=33){
            System.out.println("your are pass ,your marks is "+ a);
        }else{
            System.out.println("Your are fail");
        }

        sc.close();

    }
    
}
