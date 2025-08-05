import java.util.*;

public class arrayCreating {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // creating an array 
        //  dataType arrayName[] = new dataType[size] 


        int number[] = {1,2,3,4,5};

        System.out.println("your number array is : ");

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" ");
        }
        System.out.println();


        String fruits[] = {"apple", "mango", "orange"};

        System.out.println("your fruits array is : ");

        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i]+" ");
        } 
        System.out.println();


        System.out.print("enter the length of marks array : ");
        int length = sc.nextInt();

        int marks[] = new int[length];

        System.out.println("Enter the marks : ");

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("your marks array is : ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" ");
        }

    }
}
