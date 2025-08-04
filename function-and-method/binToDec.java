import java.util.*;
public class binToDec {

    public static int binToDecimal(int num){

        int pow = 0;
        int decNum = 0;
        while(num>0){
            int lastDig = num%10;
            decNum += lastDig*(int)Math.pow(2, pow);
            pow ++;
            num/=10;
        }
        return decNum;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the binary number to convert it into decimal number :");
        int binNumber = sc.nextInt();

        System.out.println("decimal value of "+binNumber+" is "+binToDecimal(binNumber));


    }
}
