package Tasks;

public class Reading_Input_CLI
{
    public static void main(String[] args) {

        /* 1. Taking userinput for Name, age, salary
           2. Taking inputs from aruguments and finding max using terinary
         */

        String name = args[0];
        int age = Integer.parseInt(args[1]);
        int salary = Integer.parseInt(args[2]);
        System.out.println("Name of the employee: " + name);
        System.out.println("Age: " + age);
        System.out.println("Monthly Salary: " + salary);
    }
}
