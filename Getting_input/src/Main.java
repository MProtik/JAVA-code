import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give me an input ->");
        //byte n = input.nextByte();
        boolean check = input.hasNextByte();

        //System.out.println("n->" + n);
        System.out.println("check->" + check);
    }
}