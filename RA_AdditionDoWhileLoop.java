// import Scanner and Random

import java.util.Scanner; 
import java.util.Random; 



class RA_AdditionDoWhileLoop {

     public static void main(String[] args){
      // Initialize Scanner and Random 
         Scanner input = new Scanner(System.in);
         Random rand = new Random(); 
      
      // Initialize count, right, and wrong
      
         int count = 0;
         int right = 0;
         int wrong = 0; 
         
      // Initilizae DO While statement with random numbers, user input, testing if true or false and iterating 10 times
      
      int i = 0; 
      
      do{
      
         // initialize random variable 
         
         int randomOne = rand.nextInt(10);
         int randomTwo = rand.nextInt(10); 
          
         // initialize string question to ask user
         
         String question = "What is " + randomOne + " + " + randomTwo + "?";
         
         // initialize correct answer 
         
         int correctAnswer = randomOne + randomTwo; 
         
         System.out.println(question);
         int userInput = input.nextInt();
         
         count++;
         
         
         
         if(userInput == correctAnswer){
            System.out.println("Correct Answer!");
            right++;
         
         
         
         }else {
            System.err.println("Incorrect Answer");
            wrong++;
         
         
         }
         
         
      
         
      
      
      i++; 
      
      } while ( i < 10 ) ;
     
            
     
     System.out.println("You answered " + count + " questions. You answered " + right + " correct, and " + wrong + " incorrect.");
     
     if(wrong>right) System.out.println("Do better!"); 
     
     
     
     
     }










}