import java.util.*;

public class continueKeyword {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        do { 
            System.out.println("Enter the even value");
            int a = sc.nextInt();

            if (a%2!=0){
                continue;
            }
            System.out.println("num is "+ a);
        } while (true);
    }
}
