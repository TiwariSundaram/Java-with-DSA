import java.util.*;

public class switchCase {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your dish name : ");
        String a = sc.nextLine();

        switch(a.toLowerCase().trim()){
            case "samosa": System.out.println("your dish is Samosa");
                                   break;
            case "chat" : System.out.println("your dish is chat");
                                   break;
            case "golgappa" : System.out.println("your dish is golgappa");
                                          break;
            default: System.out.println("Dish is not available");
            
        }
        sc.close();
    }
    
}
