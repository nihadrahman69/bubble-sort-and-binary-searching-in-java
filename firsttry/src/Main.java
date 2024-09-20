import java.util.Scanner;
public class Main{

    public static void printarray(int[] array, int x) {
        for (int i = 0; i<x; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public static void swapped(int x, int y, int[] array) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    public static void bubblesort(int[] array, int x) {
        for (int i = 0; i<x; i++) {
            int swap = 0;
            for (int j = 0; j<x-i-1; j++){
                if (array[j]>array[j+1]) {
                    swap = 1;
                    swapped(j,j+1,array);
                }
            }
            if (swap == 0)
                break;
        }
    }

    public static int binarysearch(int[] array, int low, int high, int a) {
        while (low <= high) {
            int mid = low + (high - low)/2;
            if (array[mid] == a)
                return mid;
            if (array[mid] > a)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x;
        int[] arr = {5,8,2,7,4,9,1,3,6};
        int n = arr.length;

        System.out.println("Array elements: \n");
        printarray(arr,n);

        System.out.println("\nSorted array: ");
        bubblesort(arr,n);
        printarray(arr,n);

        System.out.print("\nEnter the element you want to search: ");
        x = sc.nextInt();

        int result = binarysearch(arr,0,n-1,x);
        if (result == -1)
            System.out.println("\nValue not found");
        else
            System.out.println("\nValue found at index " + result + "!");
    }
}
