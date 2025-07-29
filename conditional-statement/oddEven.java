import java.util.*;

public class oddEven {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. for check , it is even or odd ");
        int a = sc.nextInt();

        if (a%2==0){
            System.out.println(a +" is even number");
        }else{
            System.out.println(a +" is odd number");
        }

        sc.close();
    }
}
