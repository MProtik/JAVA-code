import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;

public class game {
    static int gen(){
        Random random = new Random();
        return random.nextInt(3);
    }


    public static void main(String args[]){
        HashMap<String, String> conv = new HashMap<String, String>();
        conv.put("0", "rock");
        conv.put("1", "paper");
        conv.put("2", "scissor");
        Scanner input = new Scanner(System.in);
        System.out.println("Lets play Rock paper Scissors\nYou know the rulez..Don't you..??");
        System.out.print("\nDo wanna hear the Rulez..??\nType y for yes and n for no\n->");
        String decision = input.nextLine().toLowerCase();

        if (decision.equals("yes")) {
            System.out.println("Rule no 1-> You can choose Rock, Paper or scissors by the their co-responding first letter. \n");
        }

        var i = 0;
        while(i<3) {
            System.out.print("NOW CHOOSE..!!\n->");
            String x = String.valueOf(gen());
            String hand= input.nextLine().toLowerCase();
            System.out.println(hand);
            String random = conv.get(x);
            System.out.println(random);

            if(hand.equals(random))
                System.out.println("It's a draw. Play again");
            else if(hand.equals("rock") && random.equals("scissor"))
                System.out.println("Congratulations..!! You win");
            else if(hand.equals("rock") && random.equals("paper"))
                System.out.println("Sorry..!! You lost");
            else if(hand.equals("paper") && random.equals("scissor"))
                System.out.println("Congratulations..!! You win");
            else if(hand.equals("paper") && random.equals("rock"))
                System.out.println("Sorry..!! You lost");
            else if(hand.equals("scissor") && random.equals("paper"))
                System.out.println("Congratulations..!! You win");
            else if(hand.equals("scissor") && random.equals("rock"))
                System.out.println("sorry..!! You lost");
            System.out.println("Wanna try again..?? come on..Try again");
            decision = input.nextLine().toLowerCase();
            if(decision.equals("yes"))
                i++;
            else
                break;

        }

    }
}
