import java.util.*;

public class checkPrime{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the num : ");
        int num = sc.nextInt();
        

        if(num==2){
            System.out.println("It is prime number ");
        }

        for (int i =2; i<(num-1); i++) {

            if(num%i==0){
                System.out.println("it is not prime number");
                break;
            }else{
                System.out.println("it is prime number");
                break;
            }
            
        }

    }
}
