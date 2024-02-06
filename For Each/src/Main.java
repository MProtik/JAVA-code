
public class Main {
    public static void main(String[] args) {
        int [] marks = {};
        for (int i = 70; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                marks[i] = j;
            }


        }

        for(int element: marks){
            System.out.println(element);
        }

    }
}