import java.util.*;

public class topRightTriangle{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row value");
        int row = sc.nextInt();

        System.out.println("Enter the column value : ");
        int column= sc.nextInt();

        for(int i =1 ; i<=row ;i++){
            for (int j = i; j <= column; j++) {
                if((row-column)<=0){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }                
            }
            System.out.println();
        }
    }
    
}
