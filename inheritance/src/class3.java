public class class3 extends Main2 {
    int a;

    public int geta(){
        return a;
    }
    class3(int a){
        this.a = a;
    }
    public int returnone(){
        return 1;
    }
}
class class4 extends class3{
    class4(int y){
        super(y);
        class3 d = new class3(45);
        System.out.println("I think..I am a constructor form 4th class you have created");
    }
}