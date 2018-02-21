import java.util.Scanner;

public class Controller {

    private boolean exitGame;

    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        do {
            int newTry;
            newTry = getNewTry(sc);
            exitGame = model.compareInputIntAndRandInt(newTry, model.getNumber());
            if (!exitGame) {
                checkNewTryOnRepeats(newTry);
            }
        }
        while (!exitGame);

        view.printMessageAndInt(View.GREETING, model.getNumber());
    }


    // The Utility methods
    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_INT_DATA);
        while( ! sc.hasNextInt() ) {
            view.printMessage(view.WRONG_INPUT_INT_DATA + view.INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }

    private int getNewTry(Scanner sc) {
        int newTry;
        do {
            newTry = inputIntValueWithScanner(sc);
        }
        while (!checkBounds(newTry));
        return newTry;
    }

    public boolean checkBounds(int newInt){
        if(newInt > 100 || newInt < 0){
            view.printMessage(view.OUT_OF_BOUNDS);
            return false;
        }
        return true;
    }

    public void checkNewTryOnRepeats(int newTry){
        int repeatingCount = 0;
        for (int i = 0; i < model.getNumberOfTries(); i++) {
            if( model.getArrayOfTries()[i] == newTry ){
                repeatingCount++;
            }
        }

        if (repeatingCount == 0){
            model.pushNewTry(newTry);
            printAllTries();
        }
        else{
            view.printMessage(view.REPEAT_OF_INPUT);
        }
    }

    public void printAllTries(){
        view.printMessage(view.NUM_TRIES + model.getNumberOfTries());
        view.printMessageInOneLine(view.INPUT_TRIES);
        for (int i = 0; i < model.getNumberOfTries(); i++) {
            view.printMessageInOneLine(" " + model.getArrayOfTries()[i] + "  ");
        }
    }
}