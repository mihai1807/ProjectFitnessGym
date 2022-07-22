//Created the Subscriber class to inherit the Person class.
public class Subscriber extends Person {
    int progress;
    //Created the constructor to initialize the variables from the Person class and the progress of the subscriber.
    public Subscriber(String name, int age, int id, int progress) {
        super(name, age, counter);
        this.progress = progress;
    }
    //Created a method to print the details of the subscriber.
    public void printSub() {
        System.out.println("Subscriber name is: " + super.name);
        System.out.println("Subscriber age is: " + super.age);
        System.out.println("Subscriber's Id is: " + super.id + " and his/her progress is: " + this.progress);
    }
}
