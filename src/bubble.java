public class bubble {
    public static void bubblesort(int[] array, int x) {
        for (int i = 0; i<x; i++) {
            int swap = 0;
            for (int j = 0; j<x-i-1; j++){
                if (array[j]>array[j+1]) {
                    swap = 1;
                    swp.swapped(j,j+1,array);
                }
            }
            if (swap == 0)
                break;
        }
    }
}
