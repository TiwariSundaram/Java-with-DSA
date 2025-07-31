import java.util.*;

public class forLoop {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the count value to print jay shree Ram :");
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            System.out.println("Jay Shree RAM");
        }
        System.out.println("completed "+ a +" time ");
    }
    
}
