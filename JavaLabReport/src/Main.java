import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 7, 3, 4, 7, 9, 8, 1, 4, 45, 11, 23, 1, 45, 32};
        int key = 9;
        int start = 0;
        int end = (arr.length - 1);
        int mid = (end - start) / 2;

        //BubbleSort
        BubbleSort BSort = new BubbleSort();
        BSort.Sort(arr);

        //InsertionSort
        InsertionSort ISort = new InsertionSort();
        ISort.Sort(arr);
        System.out.println("Sorted arr: " + Arrays.toString(arr));

        //BinarySearch
        BinarySearch BSearch = new BinarySearch();
        System.out.println("Using Binary search method, \nElement is on the position number:" + (BSearch.Search(arr, key) + 1));
        //LinearSearch
        LinearSearch LBSearch = new LinearSearch();
        System.out.printf("Using Linear search method, \nElement is on the position number %d\n", (LBSearch.Search(arr, key) + 1));
    }
}