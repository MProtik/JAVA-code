public class Testing {

    private static void swap(int a, int b) {
        var temp = a;
        a = b;
        b = temp;
    }

    public static void main(String args[]) {


        int x = 10, y = 20;

        swap(x, y);

        System.out.println(x + y);

    }
}
