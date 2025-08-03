import java.util.*;
public class x_pattern {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row/column value: ");
        int value = sc.nextInt();

        for(int i=1 ; i<=value ; i++){
            for(int j=1; j<=value ;j++){
                if(((i+j)==(value+1))||(i-j)== 0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
