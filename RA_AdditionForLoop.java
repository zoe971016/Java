import java.util.Scanner;
import java.util.Random;

class RA_AdditionForLoop {
   public static void main(String[] args) { 
   
   Scanner input = new Scanner(System.in);
   Random rand = new Random(); 
     
     
     
  
     int count = 0; 
     int right = 0;
     int wrong = 0; 
     
     
     
     
     
      
        for (int i = 0; i < 10; i++) {

         int randomNum1 = rand.nextInt(10);
         int randomNum2 = rand.nextInt(10);

         String question = "What is " + randomNum1 + " + " + randomNum2 + "?";
         int answer = randomNum1 + randomNum2;
         int userInput;
         System.out.println(question);
         userInput = input.nextInt();
         

            
             if(userInput == answer) {
                 System.out.println("Correct");
                 right++;
                 count++;
                 
 
             
                 } else {
                 System.out.println("Incorrect");
                 wrong++;
                 count++;
                 
                 }


            

             
             
     }
     
     
     System.out.println("You have answered "+ count + " questions. You answered " + right + " correct, and " + wrong + " wrong." );
     


   }



}