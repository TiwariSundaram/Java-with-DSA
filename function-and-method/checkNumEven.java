import java.util.*;
public class checkNumEven {

    public static boolean  isEven(int num){

        boolean isEven = true;
        if(num%2==0){
            isEven = true;
        }else{
            isEven = false;
        }
        return isEven;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to check number is even or not : ");
        int num =sc.nextInt();

        if(isEven(num)){
            System.out.println(num+" is a even number");
        }
        else{
            System.out.println(num +" is odd num");
        }

    }
    
}
