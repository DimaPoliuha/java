import java.util.Random;

public class Model {
    private int number;
    private int arrayOfTries[];
    private int numberOfTries;

    Model(){
        // Инициализируем генератор
        Random rand = new Random(System.currentTimeMillis());
        // Получаем случайное число в диапазоне от min до max
        this.number = 0 + rand.nextInt(100 + 1);

        this.numberOfTries = 0;
        this.arrayOfTries = new int[101];
    }

// The Program logic

    public int getNumber() {
        return number;
    }

    public boolean compareInputIntAndRandInt(int inputInt, int randInt){
        if(inputInt == randInt){
            return true;
        }
        else {
            return false;
        }
    }

    public int[] getArrayOfTries() {
        return arrayOfTries;
    }

    public int getNumberOfTries(){
        return numberOfTries;
    }

    public int incrementNumberOfTries(){
        return numberOfTries++;
    }

    public void pushNewTry(int newTry){
        this.arrayOfTries[ getNumberOfTries() ] = newTry;
        incrementNumberOfTries();
    }
}