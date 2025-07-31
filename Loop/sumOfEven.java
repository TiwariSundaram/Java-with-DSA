import java.util.*;

public class sumOfEven {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num from where you want to start sum : ");
        int a = sc.nextInt();

        System.out.println("Enter the num as for as you want to start sum : ");
        int b = sc.nextInt();
        int sum= 0;

        while(a<=b){
            if(a%2==0){
                sum += a;
            }
            a++;
        }
        System.out.println("total mul of even numbers :"+sum);
    }
    
}
