import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        for (var i = 0; i < 3; i++) {
            System.out.print("Pass the value of \na->");
            byte a = x.nextByte();
            System.out.print("Now, b->");
            byte b = x.nextByte();
            if(a>b)
                System.out.println("a is greater");
            else if(b > a)
                System.out.println("b is greater");
            System.out.print("Wanna try again..??\n->");
            String decision;
            decision = x.nextLine();
            System.out.println(decision);

            if(decision.equals("no"))
                break;
            else if(decision.equals("yes"))
                System.out.println("Go Ahead.... Try again..!!");



        }

    }
}
