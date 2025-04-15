public class Main {
    public static void main(String[] args) {

        // WHILE LOOP
        int count = 10; //INITIALIZE
        while (count >= 1) { //EVALUATING THE EXPRESSION
            System.out.println(count);
            count--; // decrement (decrease) count = count - 1
        }
        System.out.println("BLAST OFF!!! - while");

        // DO WHILE LOOP
        int count2 = 10; //INITIALIZE
        do { //EVALUATING THE EXPRESSION
            //BODY ALWAYS HAPPENS AT LEAST ONE IN A DO WHILE
            System.out.println(count2);
            count2--; // decrement (decrease) count = count - 1
        } while (count2 >= 1);
        System.out.println("BLAST OFF!!! - do/while");

        // CLASSIC FOR LOOP - Counting down
        for (int i = 10; i >= 1; i--) { //NOTE THE DECREMENT OPERATOR and initialization to 10
            System.out.println(i);
        }
        System.out.println("BLAST OFF!!! - classic for loop with decrement");

    }
}