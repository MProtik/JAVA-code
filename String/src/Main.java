import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 10;
        String name = "Protik";
        String string = "Dear Protik. You are ganna be rich";
//        System.out.println("name-> " + name);
//        System.out.println("string-> " + string);

//        String given = input.nextLine();


        //System.out.printf("%d\n", x);
        //System.out.format("%s\n", name.toLowerCase().replaceAll("protik", "Mac"));
        //System.out.println('"' + "<|name|>, Thanks a lot".replace("name", given) + '"');
        //boolean check = given.contains("  ");
        System.out.format("%s", string);
        System.out.println("\n" + string.contains("are") + "\n");
    }
}