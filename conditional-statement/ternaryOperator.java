import java.util.*;
public class ternaryOperator {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks : ");
        int marks = sc.nextInt();

        String result = (marks>=33)?"pass":"fail";

        System.out.println(result);
    }
}
