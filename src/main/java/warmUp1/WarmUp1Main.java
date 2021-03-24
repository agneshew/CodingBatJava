package warmUp1;

public class WarmUp1Main {

    public static void main(String[] args) {
        WarmUp1Main warmUp1Main = new WarmUp1Main();

        System.out.println("Task 1 \nThe parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. \nWe sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.");
        System.out.println(warmUp1Main.sleepIn(true, false));

    }
    //Task1
    public boolean sleepIn ( boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }
    //Task2

}

