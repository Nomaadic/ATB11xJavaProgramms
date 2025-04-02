package Ooops_Constructor;

public class Lab013_Constructor
{
    public static void main(String[] args)
    {
        Baby b1 = new Baby();
        b1.cry();
    }
}

 class Baby
{
    void cry()
    {
        System.out.println("Baby was Crying");
    }
    void sleep()
    {
        System.out.println("Baby was Sleeping");
    }
    void eat()
    {
        System.out.println("Baby was Eating");
    }

    Baby()
    {
        System.out.println("Calling Default Constructor");
    }

}


