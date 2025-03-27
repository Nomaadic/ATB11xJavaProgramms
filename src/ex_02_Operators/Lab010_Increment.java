package ex_02_Operators;

public class Lab010_Increment
{

    public static class Lab10_Increment
    {
        public static void main(String[] args) {
            int a = 24;
            System.out.println(a);
            int b = ++a;
            // Value will be increased first and then updated value will be printed
            System.out.println(b);
            System.out.println(a);

            int c = 67;
            int d = c++;
            // Value will be printed first and then value will be updated
            System.out.println(d);
            System.out.println(c);

            int f = c;
            System.out.println(f);

        }
    }
}
