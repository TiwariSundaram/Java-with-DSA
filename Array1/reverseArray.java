import java.util.*;
public class reverseArray {
    
    public static int[] reverseArr(int arr[]){

        int n = arr.length;
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        return arr;
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

        int revArr[] = reverseArr(arr);

        System.out.println("Reverse array is : ");
        for (int i = 0; i < revArr.length; i++) {
            System.out.print(revArr[i] +" ");
        }



    }
}
