import java.util.Scanner;
public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x;
        int[] arr = {5,8,2,7,4,9,1,3,6};
        int n = arr.length;

        System.out.println("Array elements: \n");
        print.printarray(arr,n);

        System.out.println("\nSorted array: ");
        bubble.bubblesort(arr,n);
        print.printarray(arr,n);

        System.out.print("\nEnter the element you want to search: ");
        x = sc.nextInt();

        int result = binary.binarysearch(arr,0,n-1,x);
        if (result == 1)
            System.out.println("\nValue not found");
        else
            System.out.println("\nValue found at index " + result + "!");
    }
}