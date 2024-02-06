public class LinearSearch extends Main{
    public static int Search(int arr[], int find){
        int length = arr.length;
        for(int i = 0; i < length; i++) {
            if (arr[i] == find)
                return i;
        }
        return -1;
    }

}