package ex_01_JavaPrograms;

public class Lab_008_TypeCasting
{
    public static void main(String[] args)
    {
        // Narrowing - Implicit( Automatically done), Explicit(user need to be done)
        byte b = 10;
        // Implicit widening
        int a = b;
        System.out.println(a);

        // Explicit Widening
        byte f = 23;
        int c = (int) f; // we need tell the compiler in which data type we need by specifying in brackets
        System.out.println(c);


        // Narrowing - Implicit isn't possible as data loss will e occurred
        // Explicit Narrowing
        int m = 400;
        byte n = (byte) m;
        // the value converts into binary and the depending upon given data type the value will be reduced
        System.out.println(n);






    }
}
