import java.util.*;

public class calculator {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first no. ");
        float a = sc.nextFloat();

        System.out.println("Enter the second  no. ");
        float b = sc.nextFloat();

        System.out.println("enter your arithmetic operator : ");
        char c = sc.next().charAt(0);

        switch(c){
            
            case '+' : System.out.println(a +" + "+ b +" is "+(a+b));
                      break;
            case '-' : System.out.println(a +" - "+ b +" is "+(a-b));
                      break;
            case '*' : System.out.println(a +" * "+ b +" is "+(a*b));
                      break;
            case '/' : System.out.println(a +" / "+ b +" is "+(a/b));
                      break;
            case '%' : System.out.println(a +" % "+ b +" is "+(a%b));
                      break;
            default : System.out.println("enter the valid operator");
            
        }

    }
    
}
