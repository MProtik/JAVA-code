abstract class A{
    abstract void a();
    abstract void b();
        }
abstract class B extends A{
    abstract void c();
}

class M extends B{
    public void a(){
        System.out.println("I am from a");
    };
    public void b(){
        System.out.println("I am from b");
    };
    public void c(){
        System.out.println("I am from c");
    };

}

public class Main extends M{
    public static void main(String[] args) {
        A M = new M();
        M.a();
        M.b();
        B B = new M();
        B.c();
    }
}