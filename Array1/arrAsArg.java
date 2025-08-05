import java.util.*;

public class arrAsArg {

    public static int[] updateArr(int marks[],Scanner sc){

        System.out.println("enter the value that you want to add in each element of marks:");
        int n = sc.nextInt();
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i]+n;
        }
        return marks;
    }

    public static int []createArray(int marks[],Scanner sc){


        System.out.println("Enter the marks : ");

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        return marks;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of marks array : ");
        int length = sc.nextInt();

        int marks[] = new int[length];

       int array []= createArray(marks, sc);

       System.out.println("Array is : ");
       for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +" ");
        }
        System.out.println();

        int updatedArray[] = updateArr(marks,sc);

        System.out.println("Updated array is : ");
        for (int i = 0; i < updatedArray.length; i++) {
            System.out.print(updatedArray[i] +" ");
        }

        

        
        
    }
    
}
