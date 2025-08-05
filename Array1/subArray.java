import java.util.*;
public class subArray {

    public static void subArr(int arr[]){

        int totalSubArray = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]+" ");
                }
                totalSubArray++;
                System.out.println();
            }
        }
        System.out.println("Total sub array is "+ totalSubArray);
    }
    
    public static int []createArray(int arr[],Scanner sc){

        System.out.println("Enter the array idx values : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array : ");
        int length = sc.nextInt();

        int arr[] = new int[length];

         int array[] = createArray(arr, sc);

        System.out.println("Array is : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(arr[i] +" ");
     
        }
        System.out.println();

        subArr(arr);
    }
}
