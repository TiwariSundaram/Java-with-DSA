import java.util.*;
public class palindrome {
    
    public static int isPalindrome(int num){

        int revNum = 0;

        while (num>0){
            int lastDig = num%10;
            revNum =lastDig+revNum*10;
            num/=10;  
        }
        return revNum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to check ,it is palindrome or not : ");
        int num = sc.nextInt();

        if(num==isPalindrome(num)){
            System.out.println(num +" is a palindrome number");
        }else{
            System.out.println(num +" is not a palindrome number");
        }

    }
}
