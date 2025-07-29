import java.util.*;

public class relationalOperator {
    
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the first value :");
        float a = sc.nextFloat();

        System.out.print("enter the second value :");
        float b = sc.nextFloat();

        System.out.println(a +" == " + b +" => "+ (a==b));
        System.out.println(a +" < " + b +" => "+ (a<b));
        System.out.println(a +" > " + b +" => "+ (a>b));
        System.out.println(a +" != " + b +" => "+ (a!=b));
        System.out.println(a +" <= " + b +" => "+ (a<=b));
        System.out.println(a +" >= " + b +" => "+ (a>=b));

    }
}
