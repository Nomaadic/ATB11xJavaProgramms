package Ooops_Constructor;



public class Lab015_Parameter
{
    public static void main(String[] args) {

        Parameterized PC = new Parameterized("ishan", 25, 25898.76);
        Parameterized PC1 = new Parameterized("Dhanush", 25, 55898.76);
        Parameterized PC2 = new Parameterized("Ando", 25, 45898.76);

        System.out.println(PC.salary);
        System.out.println(PC1.Name + PC.age);

        Parameterized PC3 = new Parameterized();
        System.out.println(PC3.Name);
        System.out.println(PC3.age);

    }
}

class Parameterized
{
    String Name;
    int age;
    double salary;

    Parameterized()
    {
        Name = "Default";
        age = 25;
        salary = 15000;


    }

    Parameterized(String Name_input, int age_input, double salary_input )
    {
        this.Name = Name_input;
        this.age  = age_input;
        this.salary = salary_input;

    }

}