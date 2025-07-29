import java.util.*;

public class largeValue {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first no.");
        int a = sc.nextInt();

        System.out.print("Enter your  second no.");
        int b = sc.nextInt();

        System.out.print("Enter your third no.");
        int c = sc.nextInt();

        if ((a>b)&&(a>c)){
            System.out.println("largest value is "+ a);
        }else if(b>c){
            System.out.println("largest value is "+b);
        }else{
            System.out.println("largest value is "+ c);
        }

        sc.close();

    }
    
}
