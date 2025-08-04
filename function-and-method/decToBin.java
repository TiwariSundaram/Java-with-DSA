import java.util.*;
public class decToBin {
    
    public static int decToBinary(int num){
        int binNumber = 0;
        int pow =0;

        while(num>0){
            int remValue = num%2;
            int divValue = num/2;
            binNumber += remValue*(int)Math.pow(10, pow);
            pow++;
            num = divValue;
        }
        return binNumber;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the decimal number : ");
        int decNum = sc.nextInt();

        System.out.println("Binary number of "+ decNum +" is "+ decToBinary(decNum));

    }
}
