import java.util.Scanner;
//import java.lang.Math;




public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks( out of 80 ),");
        System.out.println("Bangla: ");
        var bangla = input.nextByte();
        System.out.println("English: ");
        var english = input.nextByte();
        System.out.println("Math: ");
        var math = input.nextByte();
        System.out.println("Science: ");
        var science = input.nextByte();
        System.out.println("ICT: ");
        var ict = input.nextByte();

        System.out.println("Your marks are " + convert(bangla) + ", " + convert(english) + ", "  + convert(math) + ", "  + convert(science) + ", "  + convert(ict));

    }

    private static double convert(int number) {
        double i = Math.ceil((double) (number * 100) / 80);
        return i;
    }
}