import java.util.*;

public class elseIf {
    
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the your salary : ");
        int a = sc.nextInt();

        int tax;

        if ((a<500000)){
            System.out.println("your tax is zero");
        }else if((a>=500000)&&(a<1000000)){
            tax = (int) (a*0.2);
            System.out.println("your yax is "+ tax);
        }else{
            tax = (int) (a * 0.3);
            System.out.println("your tax is "+tax);
        }

        sc.close();

    }
    
}
