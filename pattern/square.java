import java.util.*;

public class square {

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the row value : ");
        int row = sc.nextInt();

        System.out.println("Enter the column value : ");
        int column= sc.nextInt();

        for(int i =1 ; i<=row ;i++){
            for (int j = 0; j <=column; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
}
