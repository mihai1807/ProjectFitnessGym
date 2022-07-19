public class FitnessGym {
    public final Person[] personsIn = new Person[3];
    public boolean open;
    public int occupation = 0;

    public FitnessGym(Person[] personsIn, boolean open) {
        this.open = open;
    }

    public void openGym() {
        this.open = true;
        System.out.println("The Gym is open!");
    }

    public void addTrainer() {
        Trainer coach = new Trainer(UtilClass.genereazaNume(), UtilClass.genereazaVarsta(), Person.counter, UtilClass.genereazaNrAbonati());
        if (personsIn[0] == null) {
            personsIn[0] = coach;
            System.out.println("Coach " + coach.name + " entered the Gym!");
        } else if (personsIn[1] == null) {
            personsIn[1] = coach;
            System.out.println("Coach " + coach.name + " entered the Gym!");
        } else if (personsIn[2] == null) {
            personsIn[2] = coach;
            System.out.println("Coach " + coach.name + " entered the Gym!");
        } else {
            System.out.println("I'm afraid the Gym is full and coach " + coach.name + " cannot come in!");
        }
    }


    public void addSub() {
        Subscriber sub = new Subscriber(UtilClass.genereazaNume(), UtilClass.genereazaVarsta(), Person.counter, UtilClass.genereazaProgres());
        if (personsIn[0] == null) {
            personsIn[0] = sub;
            System.out.println("Subscriber " + sub.name + " entered the Gym!");
        } else if (personsIn[1] == null) {
            personsIn[1] = sub;
            System.out.println("Subscriber " + sub.name + " entered the Gym!");
        } else if (personsIn[2] == null) {
            personsIn[2] = sub;
            System.out.println("Subscriber " + sub.name + " entered the Gym!");
        } else {
            System.out.println("I'm afraid the Gym is full and subscriber " + sub.name + " cannot come in!");
        }
    }

    public void showPersons() {
        for (int i = 0; i <= 2; i++) {
            if (personsIn[i] != null) {
                occupation++;
            }
        }
        System.out.println("There are " + occupation + " people in the Gym.");
    }

    public void showCoaches(){
        boolean isTrainer = false;
        for (Person elem:personsIn) {
            if (elem instanceof Trainer) {
                ((Trainer) elem).printTrainer();
                isTrainer=true;
            }
        }
        if (!isTrainer) System.out.println("there are no coaches in the gym.");
    }

//    public void showMaxSub(){
//
//    }

}
