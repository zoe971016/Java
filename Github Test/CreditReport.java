import java.util.Scanner;
class CreditReport {
   
 
   
   public static void main(String[] args) {
      
      // Scanner initilization
      Scanner input = new Scanner(System.in);
      
      // Initiliaze int variables for three credit scores, sum, average 
      int creditScoreOne;
      int creditScoreTwo; 
      int creditScoreThree; 
      double interestRate;
      
      
      /*
      Ask User for Input for first credit score
      Ask user for input for second credit score
      Ask user for input for third credit score
      Print error if credit score < 0 && credit score > 850
      */
      
      
      System.out.println("Please input your Experian Credit Score: ");
      creditScoreOne = input.nextInt();
      if (creditScoreOne < 0 || creditScoreOne > 850){
         System.out.println("Error, please enter a number between 0 and 850.");
         System.out.println("Please input your Experian Credit Score: ");
         creditScoreOne = input.nextInt();

      }
      
      System.out.println("Please input your TransUnion Credit Score: ");
      creditScoreTwo = input.nextInt();
      if (creditScoreTwo < 0 || creditScoreTwo > 850){
         System.out.println("Error, please enter a number between 0 and 850.");
         System.out.println("Please input your TransUnion Credit Score: ");
         creditScoreTwo = input.nextInt();

      }
      
      
      System.out.println("Please input your Equifax Credit Score: ");
      creditScoreThree = input.nextInt();
      if (creditScoreThree < 0 || creditScoreThree > 850){
         System.out.println("Error, please enter a number between 0 and 850.");
         System.out.println("Please input your Equifax Credit Score: ");
         creditScoreThree = input.nextInt();
      }
      
      // Calculate credit average 
      
      int creditSum = creditScoreOne + creditScoreTwo + creditScoreThree;
      int average = creditSum / 3; 
      
      
      // Printing interest
      
      if (average >= 740 && average <= 850){ 
         interestRate = .0275;
         double lastInterestRate = interestRate * 100;  
         System.out.println("Congratulations! You are eligible for the 30-year-mortgage at the interest rate of " + lastInterestRate); 
      
      }
      
      else if (average >= 670 && average <= 739){ 
         interestRate = .0315;
         double lastInterestRate = interestRate * 100;  

         System.out.println("Congratulations! You are eligible for the 30-year-mortgage at the interest rate of " + lastInterestRate); 
      
      }
      
      
      else if (average >= 670 && average <= 739) { 
         interestRate = .0350;
         double lastInterestRate = interestRate * 100;  

         System.out.println("Congratulations! You are eligible for the 30-year-mortgage at the interest rate of " + lastInterestRate); 
      
      }
      
      
      else {
         System.out.println("");
      }
      
      
      /*
      Initiliaze int variables for three credit scores 
      Ask User for Input for first credit score
      Ask user for input for second credit score
      Ask user for input for third credit score
      
      
      Print error if credit score < 0 && credit score > 850
      
      Initialize int average calculation for three credit scores from user input 
      
      Initiliaze double interest rate 
      if average >= 740 && average =< 850 
         interest rate = .0275
         print line congratulations you are eligible for 2.75% 
       
      if average >= 670 && average =< 739
         interest rate = .0315
         print line congratulations you are eligible for 3.15% 

      if average >= 580 && average =< 669
         interest rate = .0350
         print line congratulations you are eligible for 3.50% 

      
      else 
         no output
            
      
      
        
   
      */
      
      
   
   }


}