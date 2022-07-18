public class Person {
    public static int counter; static {counter++;}
    public String name;
    public int age;
    public int id;

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = counter;
    }
}
