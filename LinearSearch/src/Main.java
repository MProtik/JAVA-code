import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();


        int arr[], find, length;

        Scanner input = new Scanner(System.in);

        System.out.print("How many elements you wanted to insert\n->");
        length = input.nextInt();
        arr = new int[length];
        System.out.println("Enter " + length + " elements Sequentially");

        for (int i = 0; i < length; i++) {
            System.out.print("->");
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the element you want yo search");
        find = input.nextInt();

        int method = linearSearch.Search(arr, length, find);

//        if(find == -1)
//            System.out.println("404: Element Mot Found");
//        else
//            System.out.println("Your searched element has been found on: " + (method + 1));
        String decision = (find == -1) ? "404: Element Mot Found" : "Your searched element has been found on: " + method;
        System.out.println(decision);

    }
}