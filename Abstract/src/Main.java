abstract class parent2 {
    public parent2() {
        System.out.println("i am a constructor of parent2");
    }

    public void sayhello() {
        System.out.println("Hello");
    }

    abstract public void greet();
}

    class child2 extends parent2{
        public void greet(){
            System.out.println("Good Morning..!!");
        }

    }


abstract class child3 extends parent2{
    public void th(){
        System.out.println("i am good");
    }

}



public class Main {
    public static void main(String[] args) {
        child2 child2 = new child2();
        System.out.println();
    }
}