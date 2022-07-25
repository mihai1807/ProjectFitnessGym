//Created the Subscriber class to inherit the Person class.
public class Subscriber extends Person {
    int progress;
    //Created the constructor to initialize the variables from the Person class and the progress of the subscriber.
    public Subscriber(String name, int age, int progress) {
        super(name, age);
        this.progress = progress;
    }
    //Implemented and overrode the method to print the details of the subscriber from the abstract Person class.
    @Override
    public void printPerson() {
        System.out.println("Subscriber name is: " + name);
        System.out.println("Subscriber age is: " + age);
        System.out.println("Subscriber's Id is: " + id + " and his/her progress is: " + progress);
    }
}
