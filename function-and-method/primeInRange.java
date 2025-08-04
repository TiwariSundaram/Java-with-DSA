import java.util.*;
public class primeInRange {
    
    public static boolean isPrime(int num){

        boolean isPrime = true ;

        if(num == 2){
            return isPrime ;
        }
        if(num%2==0){
            isPrime = false;
            return isPrime;
        }
        for (int i = 3; i <= Math.sqrt(num); i++) {
            if(num%i==0){
                isPrime = false;
                return isPrime;
            }  
        }
        return isPrime;
    }

    public static int primeInRange(int num){

        int count = 0;
        for (int i = 2; i < num; i++) {
            if(isPrime(i)){
                System.out.print(i+" ");
                count += 1;
            }
        }
        System.out.println();
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.err.println("Enter the range to print all prime number within given range :");

        int num = sc.nextInt();

       int numberOfPrime = primeInRange(num);


       System.out.println("Total number of prime within given range : "+numberOfPrime);

    //    boolean isNumPrime= isPrime(num);

    //    if(isNumPrime){
    //     System.out.println(num+" is prime number");
    //    }else{
    //     System.out.println(num+" is not a prime number");
    //    }
    }
}
