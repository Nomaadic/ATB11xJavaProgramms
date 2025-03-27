package ex_02_Operators;

public class Lab011_Decrement
{
    public static void main(String[] args) {

        // Pre-Decrement
        float h = 3.122f;
        System.out.println(h);

        float j = --h;
        System.out.println(j);

        //Post Decrement
        double d = 4.333;
        double k = d--;
        System.out.println(k);

        float s = (float) d ;
        System.out.println(s);
    }
}
