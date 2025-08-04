import java.util.*;
public class isPrimeFunction {
    
    public static boolean isPrime(int num){

        boolean isPrime = true ;

        if(num == 2){
            return isPrime ;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num%i==0){
                isPrime = false;
                return isPrime;
            }  
        }
        return isPrime;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.err.println("Enter the number to check ,it is prime or not :");

        int num = sc.nextInt();

       boolean isNumPrime= isPrime(num);

       if(isNumPrime){
        System.out.println(num+" is prime number");
       }else{
        System.out.println(num+" is not a prime number");
       }
    }
}
