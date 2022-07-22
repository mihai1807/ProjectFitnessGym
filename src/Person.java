//Created the Person class to act as an archetype for the other classes.
public class Person {
    public static int counter=0;
    public String name;
    public int age;
    public int id;
/* Created a constructor to initialize the variables and increment the counter,
 counter will be the id for all the inheriting classes.*/
    public Person(String name, int age,int id) {
        this.name = name;
        this.age = age;
        counter++;
        this.id = counter;
    }
}
