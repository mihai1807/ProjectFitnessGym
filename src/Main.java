public class Main {
    public static void main(String[] args) {
    FitnessGym gym = new FitnessGym(new Person[3],false);
    gym.openGym();
    gym.addTrainer();
    gym.addSub();
    gym.addSub();
    gym.addTrainer();
    gym.addSub();
    gym.showPersons();
    gym.showCoaches();

    }
}
