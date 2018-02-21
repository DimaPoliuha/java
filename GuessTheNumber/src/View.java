public class View {
    // Text's constants
    public static final String INPUT_INT_DATA = "\nInput INT value (from 0 to 100) = ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please!";
    public static final String GREETING = "Success!!! Right number = ";
    public static final String INPUT_TRIES = "Your tries = ";
    public static final String NUM_TRIES = "Number of tries = ";
    public static final String OUT_OF_BOUNDS = "Out of Bounds (from 0 to 100)! Repeat please!";
    public static final String REPEAT_OF_INPUT = "You already entered this value! Repeat please!";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageInOneLine(String message){
        System.out.print(message);
    }

    public void printMessageAndInt(String message, int value){
        System.out.println(message + value);
    }

}