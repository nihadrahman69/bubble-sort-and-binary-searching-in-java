public class binary {public static int binarysearch(int[] array, int low, int high, int a) {
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

}
