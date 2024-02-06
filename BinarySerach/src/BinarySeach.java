class BinarySearch {
    private static int Search(int arr[], int key){
        int start = 0;
        int end = arr.length - 1;
        int mid = (end - start) / 2;

        while(start <= end){
            if (key == arr[mid])
                return mid;
            else if (key >= arr[mid])
                start = mid+1;
            else if (key <= arr[mid])
                end = mid - 1;
            mid = (start + end) / 2;
        }

        return -1;
    }
    public static void main(String[] args){
        int arr[] = {4, 6, 7, 8, 9, 12,14,16,19,22};
        int key = 14;

        var data = Search(arr, key);
        System.out.printf("Element is on the position number %d\n", (data + 1));
        System.out.println("array length: " + arr.length);

    }
}