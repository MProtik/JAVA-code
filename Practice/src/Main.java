public class Main{
    String name; //instance variable
    public Main(String name){   //instance method
        this.name = name;
    }
    public static void main(String args[]){
        Main main = new Main("Milo");
        System.out.println(main.name.toUpperCase());
    }
}