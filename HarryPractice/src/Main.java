import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        var i = 0;
//        while(i<10){
//
//
//            System.out.print("Enter you age: ");
//            short age = input.nextShort();
//            switch(age){
//                case 13 -> System.out.println("You are a teenager now");
//
//                case 20 -> System.out.println("You are not a teenager now. GET SERIOUS");
//                case 26 -> System.out.println("time to find a job");
//                case 30 -> System.out.println("Think about you future. You wanna get rich..\nREMEMBER..!!");



            //}

//            System.out.print("Wanna go again..??(y/n)->");
//            String decision = input.next();
//            if (decision.equals("y"))
//                i++;
//            else
//                break;


        //}
        for(var i = 0; i <= 10; i++){
            if(i == 2){ i++; continue;}

            System.out.print("\n" + i);

        }

    }
}