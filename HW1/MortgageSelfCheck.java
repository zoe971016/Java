/*MIS 350 HW 2 Q2-3
  Gulziba Ekber
  This program determine loan applicant's eligibility and interest rate if eligible
*/
import java.util.Scanner;
public class MortgageSelfCheck {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int scoreOne;
      int scoreTwo;
      int scoreThree;
      int avrgCreditScore;
      boolean eligibility;
      double interestRate = 0;
      //Applicant enters three credit scores using Scanner.    
      System.out.print("Enter your credit score from TransUnion (300 - 850): ");
      scoreOne = input.nextInt(); 
      System.out.print("Enter your credit score from EquiFax (300 - 850): ");
      scoreTwo = input.nextInt(); 
      System.out.print("Enter your credit score from Experian (300 - 850): ");
      scoreThree = input.nextInt(); 
      
      //Program caluculate the average score based on the three credit scores entered above.
      avrgCreditScore = (scoreOne + scoreTwo + scoreThree) / 3;

      //Using IF-ELSE structure, calculate the applicant's eligibility for loan, and interest rate if qualifed.
      // If average credit score is between 740 and 850 (inclusive), eligiblity = Yes & interest rate = 2.75%
      if (avrgCreditScore >= 740 && avrgCreditScore <= 850) {
         eligibility = true;
         interestRate = 2.75;
      }
      
      // If average credit score is between 675 and 739 (inclusive), eligibility = Yes & interest rate  = 3.15%
      else if (avrgCreditScore >= 675 && avrgCreditScore <= 739) {
         eligibility = true;
         interestRate = 3.15;
      }
      
      // If average credit score is between 580 and 669 (inclusive), eligibility = Yes & interest rate  = 3.50%
      else if (avrgCreditScore >= 580 && avrgCreditScore <= 669) {
         eligibility = true;
         interestRate = 3.50;
      }
      // If average credit score is below 580, eligibility = No & no interest rate is calculated.
      else {
         eligibility = false;
      }
      
      //Display final message based on the above calculations
      if (eligibility == true) {
         System.out.println("Congratulation! You are eligibile for the 30-year mortgage at the interest rate of " + interestRate + "%");
      }
      else {
         System.out.println("Unfortunately, you are not eligibile for the 30-year mortgage");
      }
   }
}