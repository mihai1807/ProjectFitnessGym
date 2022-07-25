// Created the Trainer class to inherit the Person class.
public class Trainer extends Person{
    public int subNumber;

    //Created the constructor to initialize the variables from the Person class and the Subscriber number of each trainer.
    public Trainer(String name, int age, int subNumber) {
        super(name, age);
        this.subNumber = subNumber;
    }
    //Implemented and overrode the method to print the details of the trainer from the abstract Person class.
    @Override
    public void printPerson() {
        System.out.println("Trainer name is: " + name);
        System.out.println("Trainer age is: " + age);
        System.out.println("Trainer's Id is: " + id + " and his/her number of subscribers is: " + subNumber);
    }
}
