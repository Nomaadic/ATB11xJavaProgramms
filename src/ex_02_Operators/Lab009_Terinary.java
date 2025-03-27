package ex_02_Operators;

public class Lab009_Terinary
{
    public static void main(String[] args)
    {
        int a= 10, b= 20;
        String result = a>b ? "a peddadi" : "b Peddadi";
        System.out.println(result);

        int n1=244, n2=9, n3=119;
        int  biggest = ((n1>n2? n1 : n2) > n3 ? (n1>n2? n1 : n2) : n3);
        System.out.println(biggest);


    }
}
