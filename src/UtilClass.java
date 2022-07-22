//This class is used to store the utility functions used in the program for random numbers, etc.
import java.util.Random;
public class UtilClass {
    private static final String[] arrayNames = {"Michael", "Jim", "Pam", "John","Andy", "Kelly", "Angela", "James", "Jan", "Kevin"};

    //This function is used to generate a random number between 0 and the max value for the age of a Person class object
    static int generateAge() {
        Random random = new Random();
        return random.nextInt(100);
    }
    //This function is used to generate a random number between 0 and the max value for subscriber progress of a Subscriber class object.
    static int generateProgress() {
        Random random = new Random();
        return random.nextInt(10);
    }
    //This function is used to generate a random number between 0 and the max value for the name of a Person class object.
    static String generateName() {
        Random random = new Random();
        return arrayNames[random.nextInt(9)];
    }
    //This function is used to generate a random number between 0 and the max value for the number of subs of a Trainer class object.
    static int generateNoOfSubs() {
        Random random = new Random();
        return random.nextInt(10);
    }
    //This function is used to generate a random number between 0 and the max value for the id to be removed of a Person class object.
    static int generateId() {
        Random random = new Random();
        return random.nextInt(5);
    }
}
