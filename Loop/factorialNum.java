import java.util.*;

public class factorialNum{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the any whole number for factorial value : ");
        int  num = sc.nextInt();
        int factValue = 1;

        if(num == 0){
            factValue = 0;
        }else{
            for (int i = 1; i<=num ; i++){
            factValue *= i ;
        }
        }
        
        System.out.println(num +"! = "+factValue);
    }
}
