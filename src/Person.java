//Created the abstract Person class to act as an archetype for the other classes.
public abstract class Person {
    public static int counter=1;
    public String name;
    public int age;
    public int id;

    /* Created a constructor to initialize the variables and increment the counter,
    counter will be the id for all the inheriting classes.*/
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = counter++;
    }
    //Created a method to print the details of the person.
    public void printPerson() {
        System.out.println("Person name is: " + this.name);
        System.out.println("Person age is: " + this.age);
        System.out.println("Person's Id is: " + this.id);
    }
}
