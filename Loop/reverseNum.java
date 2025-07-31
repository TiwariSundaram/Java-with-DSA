import java.util.*;
public class reverseNum {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num for reverse : ");
        int num = sc.nextInt();
        int revNum = 0;

        while(num!=0){
            int lastNum =num%10;

            revNum=(revNum*10)+lastNum;
            num /=10;
        }
        System.out.println(revNum);


    }
    
}
