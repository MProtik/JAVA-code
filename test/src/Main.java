public class Main{
    static int [] arr = {2, 4, 5, 6, 7, 8, 9, 10};
    static int a = 10;
    static int b = 20;
    static int c = 13;
    static int A(int a, int b){return a + b;}
    static int A(int a, int b, int c){return a + b + c;}

    public static void main(String[] args){
        for(int element : arr){
            System.out.print(element + ", ");
        }
        //System.out.println(A(a, c));

        //System.out.println(A(a, b, c));
    }
}

