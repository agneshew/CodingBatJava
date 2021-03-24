package warmUp1;

public class WarmUp1Main {

    public static void main(String[] args) {
        WarmUp1Main warmUp1Main = new WarmUp1Main();

        System.out.println("Task 1 \nThe parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. \nWe sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.");
        System.out.println(warmUp1Main.sleepIn(true, false));

        System.out.println("Task 2 \nWe have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.");
        System.out.println(warmUp1Main.monkeyTrouble(true, true));

        System.out.println("Task 3 \nGiven two int values, return their sum. Unless the two values are the same, then return double their sum.");
        System.out.println(warmUp1Main.sumDouble(3, 8));

        System.out.println("Task 4 \nGiven an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.");
        System.out.println(warmUp1Main.diff21(11));

        System.out.println("Task 5 \nWe have a loud talking parrot. The \"hour\" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.");
        System.out.println(warmUp1Main.parrotTrouble(false, 4));

        System.out.println("Task 6 \nGiven 2 ints, a and b, return true if one if them is 10 or if their sum is 10.");
        System.out.println(warmUp1Main.makes10(7, 10));

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
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile || (!aSmile && !bSmile)) {
            return true;
        }
        else {
            return false;
        }
    }
    //Task3
    public int sumDouble(int a, int b) {
        if (a == b) {
            return 2*(a+b);
        }
        else {
            return a+b;
        }
    }
    //Task4
    public int diff21(int n) {
        if (n > 21) {
            return 2 * ( n - 21);
        }
        else {
            return 21 - n ;
        }
    }
    //Task5
    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && ( hour < 7 || hour > 20 )) {
            return true;
        }
        else {
            return false;
        }
    }
    //Task6
    public boolean makes10(int a, int b) {
        if ( a == 10 || b == 10 || ( a + b == 10)) {
            return true;
        }
        else {
            return false;
        }
    }
    //Task7





}

