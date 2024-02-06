public class BubbleSort {
    public static void main(String[] args) {
        int array[] = {5, 7, 4, 2, 7, 9, 4, 2, 7, 8, 3, 9};
        int n = array.length;

        for (var i = 0; i < n-1; i++)
            for (var j = 0; j < n - i -1; j++)
                if (array[j] > array[j + 1]) {
                    var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
        System.out.print("Given numbers:");
//        for (var c = 0; c < n; c++) {
//            System.out.println(array[c]);
//        }
        for(int element : array){
            System.out.println(element);
        }
    }
}
