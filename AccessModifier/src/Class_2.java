import java.util.Scanner;
public class Class_2 extends Main {
    private int x = 20;
    private String name;

    void identity() {
        System.out.println("I am from Class_2");
    }

    public void setx(int i) {
        if (i>10) {
            this.x = i;
        }
        else {
            System.out.println("Not valid");
        }
    }
    public int getx() {
        return x;
    }

    public String getname() {
        return name;
    }

    public void setname(String x) {
        this.name = x;

    }
}