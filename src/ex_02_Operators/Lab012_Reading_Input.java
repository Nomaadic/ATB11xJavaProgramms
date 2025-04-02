package ex_02_Operators;

import java.util.Scanner;

public class Lab012_Reading_Input
{
    public static void main(String[] args) {

        // Reading Input through CLI
        /* Run the program once and select "Edit Configurations on the top, beside run.
           Pass the arguments in the "Post Arguments"  */

        int age = Integer.parseInt(args[0]);
        int age1 = Integer.parseInt(args[1]);
        System.out.println(age + age1);

//        char firstChar = args[1].charAt(1);
//        System.out.println(firstChar);

        // Using Scanner
        Scanner ando = new Scanner(System.in);

        // Reads input and stores in int datatype
        int y = ando.nextInt();
        System.out.println(y);

        // Reads entire line even spaces btw words and stores in String datatype
        String sch = ando.nextLine();
        System.out.println(sch);

        // Reads text till the space and stores in String datatype

//        String s1 = ando.next();
//        System.out.println(s1);



    }
}
