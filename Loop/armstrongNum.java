import java.util.*;

public class armstrongNum {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num : ");
        int num = sc.nextInt();
        int actualVal = num;
        int lastDig;
        int value =0 ;
        

        while(num!=0){
            lastDig = num%10;
            int cube = lastDig*lastDig*lastDig;
             value += cube; 
           
            num/=10;  
        }
        if (value==actualVal) {
            System.out.println(actualVal +" is a armstrong num");            
        }else{
            System.out.println("it is not armstrong num");
        }
    }
}
