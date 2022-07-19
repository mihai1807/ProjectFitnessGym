public class Trainer extends Person{
    public int subNumber;
    public Trainer(String name, int age, int id, int subNumber) {
        super(name, age, id);
        this.subNumber = subNumber;
    }

    public void printTrainer() {
        System.out.println("Trainer name is: " + super.name);
        System.out.println("Trainer age is: " + super.age);
        System.out.println("Trainer's Id is: " + super.id + " and his/her subscriber number is: " + this.subNumber);
    }
}
