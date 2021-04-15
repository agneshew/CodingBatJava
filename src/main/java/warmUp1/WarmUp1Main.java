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

        System.out.println("Task 7\nGiven an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.");
        System.out.println(warmUp1Main.nearHundred(78));

        System.out.println("Task 8\nGiven 2 int values, return true if one is negative and one is positive. Except if the parameter \"negative\" is true, then return true only if both are negative.");
        System.out.println(warmUp1Main.posNeg(3, -5, true));

        System.out.println("Task 9\nGiven a string, return a new string where \"not \" has been added to the front. However, if the string already begins with \"not\", return the string unchanged. Note: use .equals() to compare 2 strings.");
        System.out.println(warmUp1Main.notString("not enough"));

        System.out.println("Task 10\nGiven a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).");
        System.out.println(warmUp1Main.missingChar("developer", 7));

        System.out.println("Task 11\nGiven a string, return a new string where the first and last chars have been exchanged.");
        System.out.println(warmUp1Main.frontBack("java"));

        System.out.println("Task 12\nGiven a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.");
        System.out.println(warmUp1Main.front3("Junior"));

        System.out.println("Task 13\nGiven a string, take the last char and return a new string with the last char added at the front and back, so \"cat\" yields \"tcatt\". The original string will be length 1 or more.");
        System.out.println(warmUp1Main.backAround("candy"));

        System.out.println("Task 14 \nReturn true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % \"mod\" operator");
        System.out.println(warmUp1Main.or35(10));

        System.out.println("Task 15 \nGiven a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so \"kitten\" yields\"kikittenki\". If the string length is less than 2, use whatever chars are there.");
        System.out.println(warmUp1Main.front22("java"));

        System.out.println("Task 16 \nGiven a string, return true if the string starts with \"hi\" and false otherwise.");
        System.out.println(warmUp1Main.startHi("hi java"));

        System.out.println("Task 17 \nGiven two temperatures, return true if one is less than 0 and the other is greater than 100.");
        System.out.println(warmUp1Main.icyHot(23,105));

        System.out.println("Task 18 \nGiven 2 int values, return true if either of them is in the range 10..20 inclusive.");
        System.out.println(warmUp1Main.in1020(25,26));

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
    public boolean nearHundred(int n) {
        if ( (Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10 )) {
            return true;
        }
        else {
            return false;
        }
    }
    //Task8
    public boolean posNeg(int a, int b, boolean negative) {
        if (( !negative && ( ( a > 0 && b < 0) || ( a < 0 && b > 0)))
                || ( negative && a < 0 && b < 0)) {
            return true;
        }
        else {
            return false;
        }
    }
    //Task9
    public String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        }
        else {
            return "not "+str;
        }
    }
    //Task10
    public String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n+1,  str.length());
        return front + back;
    }
    //Task11
    public String frontBack(String str) {
        if (str.length() <=1) {
            return str;
        }
        else {
            int n = str.length() -1;
            String middle = str.substring(1,n);
            return str.charAt(n) + middle + str.charAt(0);
        }
    }
    //Task12
    public String front3(String str) {
        String front;
        if (str.length() < 3) {
            front = str;
        }
        else {
            front = str.substring(0, 3);
        }
        return front + front + front;
    }
    //Task13
    public String backAround(String str) {
        if (str.length() > 0) {
            return str.charAt(str.length()-1) + str + str.charAt(str.length()-1);
        }
        else {
            return str;
        }
    }
    //Task14
    public boolean or35(int n) {
        if (n % 3 == 0 || n % 5 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    //Task15
    public String front22(String str) {
        String front = str.substring(0,2);
        return front + str + front;
    }
    //Task16
    public boolean startHi(String str) {
        if (str.length() >= 2 && str.substring(0, 2).equals("hi")) {
            return true;
        }
        else {
            return false;
        }
    }
    //Task17
    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        }
        else {
            return false;
        }
    }
    //Task18
    public boolean in1020(int a, int b) {
        if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20)) {
            return true;
        }
        else {
            return false;
        }
    }



}

