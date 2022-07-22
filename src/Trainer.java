// Created the Trainer class to inherit the Person class.
public class Trainer extends Person{
    public int subNumber;

    //Created the constructor to initialize the variables from the Person class and the Subscriber number of each trainer.
    public Trainer(String name, int age, int id, int subNumber) {
        super(name, age, counter);
        this.subNumber = subNumber;
    }
    //Created a method to print the details of the trainer.
    public void printTrainer() {
        System.out.println("Trainer name is: " + super.name);
        System.out.println("Trainer age is: " + super.age);
        System.out.println("Trainer's Id is: " + super.id + " and his/her subscriber number is: " + this.subNumber);
    }
}
