package Tasks;

public class Terinary_Input_CLI
{
    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        System.out.println("Maximum Number is : " + (num1 > num2?num1:num2));
    }


}
