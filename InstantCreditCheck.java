package creditchecker;

import java.util.Scanner;

/*
An instant credit check program that approves anyone who makes more than $25,0000 and has a credit
score of 700 or better. Then reject all others.
 */
public class InstantCreditCheck{

    public static void main(String[] args) {

        // Get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double actualSalary = scanner.nextDouble();

        System.out.println("Enter your credit score: ");
        int actualCreditScore = scanner.nextInt();

        scanner.close();

        // Check if the user is qualified
        boolean qualified =  isUserQualified(actualCreditScore, actualSalary);
        notifyUser(qualified);

    }


    public static  boolean isUserQualified(int actualCreditScore, double actualSalary){
        double requiredSalary = 25000;
        int requiredCreditScore = 700;

        if(actualCreditScore >= requiredCreditScore && actualSalary >= requiredSalary){
            System.out.println("Congrats you've been approved");
            return true;
        } else {
            System.out.println("Sorry, your application was declined, keep growing your credit score");
            return  false;
        }
    }

    public  static  void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congrats you've been approved");
        } else {
            System.out.println("Sorry, your application is denied");
        }
    }
}
