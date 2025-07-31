import java.util.*;

public class whileLoop {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number from where you want to start printing : ");
        int a = sc.nextInt();

        System.out.println("enter the number as for as  you want to print : ");
        int b = sc.nextInt();

        while(a<=b){
            System.out.print(a +" ");
            a++;
        }

    }
    
}
