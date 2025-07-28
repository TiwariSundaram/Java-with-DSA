import java.util.*;
public class typePromotion {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first no.");
        int a = (int)sc.nextInt();

        System.out.println("Enter your second no.");
        float b = sc.nextFloat();

        System.out.println("Enter your third no.");
        double c =sc.nextDouble();

        // when the expression occur byte ,short change into int ,
        // int ,float ,double change into greater type that present in expression respectively
        double sum = a+b+c;

        System.out.println(sum);


    }
}
