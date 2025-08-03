import java.util.*;

public class helloFunction {

    public static void hello(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many time you want to print : ");
        int n = sc.nextInt();

        for (int i = 0; i <n; i++) {
            System.out.println("Hello world !");   
        }
    }
    public static void main(String args[]){

        hello();
    }
    
}
