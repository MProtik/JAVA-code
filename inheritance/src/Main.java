import java.util.Scanner;
class Base{
    int x;
    void me(){
        System.out.println("I am a constructor");
    }
}


public class Main {
    static int d = 10;
    public static void main(String[] args) {
        class3 class3 = new class3(4);

//        int d = 20;
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        Base Base = new Base();
//        Class_2 Class_2 = new Class_2();
//        Base.me();
//        Class_2.identity();
//        Class_2.setx(4);
//        System.out.println("The value of the second class int is->\n" + Class_2.getx());
//        Class_2.setname("Protik");
//        System.out.println(Class_2.getname());
        System.out.println(class3.geta());
    }
}