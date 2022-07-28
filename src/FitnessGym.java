//Created the Gym class to hold the Gym details and methods to perform the actions on the Gym.
public class FitnessGym {
    public Person[] personsIn;
    public boolean open;
    public int occupation = 0;
    //Created the constructor to initialize the variables, the array of persons to be 3 for the purpose of this exercise.
    public FitnessGym(boolean open) {
        this.personsIn = new Person[3];
        this.open = open;
    }

    //Created a method to set the open status of the gym, no other methods can be used until the gym is open.
    public void openGym() {
        this.open = true;
        System.out.println("The Gym is open!");
    }

    //Created a method to set add a trainer to the gym, the trainer will be added to the array of persons in the gym, if the gym is open
    //and if the gym is not full.
    public void addTrainer() {
        Trainer coach = new Trainer(UtilClass.generateName(), UtilClass.generateAge(), UtilClass.generateNoOfSubs());
        if (personsIn[0] == null) {
            personsIn[0] = coach;
            occupation++;
            System.out.println("Coach " + coach.name + " entered the Gym!");
        } else if (personsIn[1] == null) {
            personsIn[1] = coach;
            System.out.println("Coach " + coach.name + " entered the Gym!");
            occupation++;
        } else if (personsIn[2] == null) {
            personsIn[2] = coach;
            System.out.println("Coach " + coach.name + " entered the Gym!");
            occupation++;
        } else {
            System.out.println("I'm afraid the Gym is full and coach " + coach.name + " cannot come in!");
        }
    }

    //Created a method to set add a subscriber to the gym, the trainer will be added to the array of persons in the gym, if the gym is open
    //and if the gym is not full.
    public void addSub() {
        Subscriber sub = new Subscriber(UtilClass.generateName(), UtilClass.generateAge(), UtilClass.generateProgress());
        if (personsIn[0] == null) {
            personsIn[0] = sub;
            System.out.println("Subscriber " + sub.name + " entered the Gym!");
            occupation++;
        } else if (personsIn[1] == null) {
            personsIn[1] = sub;
            System.out.println("Subscriber " + sub.name + " entered the Gym!");
            occupation++;
        } else if (personsIn[2] == null) {
            personsIn[2] = sub;
            System.out.println("Subscriber " + sub.name + " entered the Gym!");
            occupation++;
        } else {
            System.out.println("I'm afraid the Gym is full and subscriber " + sub.name + " cannot come in!");
        }
    }

    //Created a method to show the number of persons in the gym and to print the details of each person.
    public void showPersons() {
        for (int i = 0; i <= 2; i++) {
            if (personsIn[i] != null) {
                personsIn[i].printPerson();
            }
        }
        System.out.println("There are " + occupation + " people in the Gym.");
    }

    //Created a method to show the details of only the coaches in the gym,if any.
    public void showCoaches(){
        boolean isTrainer = false;
        for (Person elem:personsIn) {
            if (elem instanceof Trainer) {
                elem.printPerson();
                isTrainer=true;
            }
        }
        if (!isTrainer) System.out.println("There are no coaches in the gym.");
    }

    //Created a method to show the details of only the subscribers in the gym,if any.
    public void showSubscribers(){
        boolean isSub = false;
        for (Person elem:personsIn) {
            if (elem instanceof Subscriber) {
                elem.printPerson();
                isSub=true;
            }
        }
        if (!isSub) System.out.println("There are no subscribers in the gym.");
    }

    //Created a method to show the max training progress from the subscribers in the gym.
    public void showMaxLevel(){
        int maxLevel = 0;
        for (Person elem:personsIn) {
            if (elem instanceof Subscriber) {
                if (((Subscriber) elem).progress > maxLevel) {
                    maxLevel = ((Subscriber) elem).progress;
                }
            }
        }
        System.out.println("The highest level of subscribers is: " + maxLevel);
    }

    //Created a method to remove a person from the gym based on the ID and throws an exception if the ID is not found.
    public void removePerson(int id) throws ExceptionPersonDoesNotExist {
        boolean isFound = false;
        for (int i = 0; i <= 2; i++) {
            if (personsIn[i] != null && personsIn[i].id == id) {
                System.out.println("Person with id " + id + " has been removed from the Gym.");
                personsIn[i] = null;
                occupation--;
                isFound = true;
            }
            if (!isFound) {
                throw new ExceptionPersonDoesNotExist();
            }
        }
    }

    //Created a method to close the Gym, no other methods can be used after this.
    public void closeGym(){
        this.open = false;
        System.out.println("The Gym is closed!");
    }

    //Created a method to go through all the actions that can be performed on the gym.
    public void performAction(Actions action) throws ExceptionPersonDoesNotExist {
        switch (action) {
            case OPEN_GYM:
                openGym();
                break;
            case ADD_TRAINER:
                    addTrainer();
                break;
            case ADD_SUBSCRIBER:
                addSub();
                break;
            case SHOW_PERSONS:
                showPersons();
                break;
            case REMOVE_PERSON:
                removePerson(UtilClass.generateId());
                break;
            case SHOW_MAX_LEVEL:
                showMaxLevel();
                break;
            case CLOSE_GYM:
                closeGym();
                break;
        }
    }
}
