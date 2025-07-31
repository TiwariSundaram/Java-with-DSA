import java.util.*;

public class breakKeyword {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter the num ");
            int a = sc.nextInt();
            if(a%2==0){
                break;
            } 
            System.out.println("num is "+ a);
        }while(true);
    }
    
}
