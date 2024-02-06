public class BubbleSort extends Main {
    public int Sort(int array[]) {
        int n = array.length;

        for (var i = 0; i < n - 1; i++)
            for (var j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
        //for(int element : array){
            //System.out.println(element);}
    return -1;
    }
}