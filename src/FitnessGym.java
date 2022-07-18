import javax.swing.text.DefaultEditorKit;
import java.util.ArrayList;

public class FitnessGym {
    public ArrayList<Person> personsIn;
    boolean open;

    public FitnessGym(ArrayList<Person> personsIn, boolean open) {
        this.personsIn = personsIn;
        this.open = open;
    }

    private void openGym() {
        this.open = true;
        System.out.println("The Gym is open!");
    }

    private void addTrainer() {
        Trainer coach = new Trainer(UtilClass.genereazaNume(), UtilClass.genereazaVarsta(), Person.counter, UtilClass.genereazaNrAbonati());
        if (personsIn.size() < 3) {
            personsIn.add(coach);
            System.out.println("Coach " + coach.name + " entered the Gym!");
        } else {
            System.out.println("I'm afraid the Gym is full and " + coach.name + " cannot come in!");
        }
    }

    private void addSub(){
        Subscriber sub = new Subscriber(UtilClass.genereazaNume(), UtilClass.genereazaVarsta(), Person.counter, UtilClass.genereazaProgres());
        if (personsIn.size() < 3) {
            personsIn.add(sub);
            System.out.println("Subscriber "+sub.name+" entered the Gym");
        } else {
            System.out.println("I'm afraid the Gym is full and " + sub.name + " cannot come in!");
        }
    }

    private void showPersons(){
        if (personsIn.size()>0)
        System.out.println("There are "+personsIn.size()+" in the Gym.");
        else System.out.println("The Gym is empty!");
    }

//    private void showTrainers() {
//        if (personsIn.contains(Trainer.class)) System.out.println(Trainer.trainer);
//    }
}
