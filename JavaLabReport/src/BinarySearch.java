class BinarySearch extends Main{
    public static int Search(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (end - start) / 2;

        while (start <= end) {
            if (key == arr[mid])
                return mid;
            else if (key > arr[mid])
                start = mid + 1;
            else if (key < arr[mid])
                end = mid - 1;
            mid = (end + start) / 2;
        }

        return -1;
    }
}