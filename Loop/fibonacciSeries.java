import java.util.*;

public class fibonacciSeries {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int firstNum = 0;
        int secondNum = 1;

        System.out.println("Enter the number as for as you want to print fibannaci series : ");
        int n = sc.nextInt();

        System.out.print(firstNum +" "+secondNum +" ");
        for(int i = 2; i<=n ; i++){
            int thirdNum = firstNum+secondNum ;
            System.out.print(thirdNum +" ");
            firstNum = secondNum;
            secondNum = thirdNum;
        }

    }
    
}
