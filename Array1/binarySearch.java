import java.util.*;

public class binarySearch {

    public static int []createArray(int array[],Scanner sc){

        System.out.println("Enter the numbers for array index : ");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int searchKey(int arr[],int num){

        int start = 0;
        int last = arr.length-1;

        while(start<=last){
            int mid = (start+last)/2;

            if(arr[mid]==num){
                return mid;
            }else if(arr[mid]>num){
                last = mid-1;
            }else if(arr[mid]<num){
                start = mid+1;
            }
        }
        return  -1;
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the length of array : ");
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
