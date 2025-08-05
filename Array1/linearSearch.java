import java.util.*;

public class linearSearch {

     public static int []createArray(int array[],Scanner sc){


        System.out.println("Enter the numbers for array index : ");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }
    
    public static int searchKey(int arr[],int num){

        for (int idx = 0; idx < arr.length; idx++) {   
            if (num==arr[idx]){
                return idx;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array : ");
        int length = sc.nextInt();

        int array[] = new int[length];

        int arr[] = createArray(array, sc);

        System.out.println("Array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }

        System.out.println();

        System.out.println("Enter the number that you want to search in array : ");
        int num = sc.nextInt();

        int index = searchKey(arr, num);

        if(index==-1){
            System.out.println("Number not present in array ");
        }
        else{
            System.out.println("Number is present at index : "+index);
        }
    }
}
