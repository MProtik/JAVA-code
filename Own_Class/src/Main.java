import java.util.Scanner;
 class employee{
    int age;
    int id;
    int salary;
    String name;
     Scanner input = new Scanner(System.in);
    public void details(){
        System.out.printf("My name is %s\nand my age is %d\nand my salary is %d\n\n", name, id, salary);
    }
    public int getsalary(){
     return salary;
    }
    public String getName(){
        return name;
    }
    public String setName(){
        String name = input.nextLine();
        return name;
     }
}
public class Main {
    public static void main(String[] args) {
        employee harry = new employee();
        employee shubham = new employee();
//        System.out.printf("%s\n", harry.name);
//        harry.harold();
//        Josh josh = new Josh();
//        josh.harold();
//        System.out.print(josh.id);
//        emp.age = 17;
//        emp.name = "Mac";
//        emp.details();
//
//        emp.age = 22;
//        emp.name = "Protik";
//        emp.details();

//        behave behave = new behave();
//        behave.behave = "A+";
//        behave.attitude();


        harry.id = 17;
        harry.salary = 433;
        harry.name = "Harry";
        shubham.id = 12;
        shubham.salary = 54;
        shubham.name = "Shubham agarwal";

        int salary = harry.getsalary();
        System.out.println(salary);
        //harry.details();
        //shubham.details();
        String name = shubham.getName();
        System.out.println(name);
        name = harry.setName();
        System.out.println(name);

    }
}