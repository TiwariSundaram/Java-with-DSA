import java.util.*;

public class bottomLeftTriangle {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row value : ");
        int row = sc.nextInt();

        System.out.println("Enter the column value : ");
        int column= sc.nextInt();

        for(int i =1 ; i<=row ;i++){
            for (int j = 1; j <= column; j++) {
                if((i-j)>=0){
                    System.out.print("*");
                }             
            }
            System.out.println();
        }
    }
    
}
