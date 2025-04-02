package Tasks;

public class Constructor
{
    public static void main(String[] args)
    {
        Person P1 = new Person("Abhi",24, 9898764566L, "Hyderabad", true);
        System.out.println("New Entry " + P1.name);
        System.out.println("Age is " + P1.age);
        P1.eat();
        P1.sleep();
        P1.walk();

        Person P = new Person();
        System.out.println(P.name + " age is " + P.age );



    }
}

class Person
{
    String name;
    int age;
    long phno;
    String add;
    boolean isMale;

    Person()
    {
        name = "Default";
        age = 25;
        phno = 9876543210L;
        add = "Hyderabad";
        isMale = true;
    }

    Person(String name_in, int age_in, long phno_in, String add_in, boolean isMale_in)
    {
        this.name = name_in;
        this.age = age_in;
        this.phno = phno_in;
        this.add = add_in;
        this.isMale = isMale_in;

    }

    void eat()
    {
        System.out.println(this.name + " is eating");
    }
    void sleep()
    {
        System.out.println(this.name + " is sleeping");
    }
    void walk()
    {
        System.out.println(this.name + " is walking");
    }

}
