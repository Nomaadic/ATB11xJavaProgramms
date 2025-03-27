package Tasks;

import java.util.Scanner;

public class Grade_Cal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float score = sc.nextFloat();
        System.out.println("Score of the Student = "+ score );

        if (score >= 90 & score<=100)
        {
            System.out.println("Grade of the Student = A");
        }
        else if (score >= 80 & score<=89)
        {
            System.out.println("Grade of the Student = B");
        }
        else if (score >= 70 & score<=79)
        {
            System.out.println("Grade of the Student = C");
        }
        else if (score >= 60 & score <= 69)
        {
            System.out.println("Grade of the Student = D");
        }
        else if (score >= 0 & score <= 59)
        {
            System.out.println("Grade of the Student = F");
        }
    }
}

//Write a program that calculates and displays the letter grade for a
//given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
