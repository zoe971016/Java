import java.util.Scanner;
import java.util.Random;



class RA_AdditionWhileLoop {
   
   public static void main(String[] args) {
   
   // declare Scanner variable
   Scanner input = new Scanner(System.in);
   
   // declare Random variable
   Random rand = new Random(); 
   
   // initialize count, right, and wrong
   int count = 0;
   int right = 0; 
   int wrong = 0; 
   
   
   // Initilialize int for while loop and run while loop
   
   int i = 0; 
   
   while(i < 10){
   
      int randomOne;
      int randomTwo; 
      
      int answer;
   
   
   // Declare random numbers and intialize question to string variable question and declare user answer

   
      randomOne = rand.nextInt(10);
      randomTwo = rand.nextInt(10);
      
      String question = "What is " + randomOne + " + " + randomTwo + "?";

      System.out.println(question);
      answer = input.nextInt();
      count++;
      
      int correctAnswer = randomOne + randomTwo;
      
      if( answer == correctAnswer ){
         System.out.println("Correct!");
         right++;
      
      
      } else {
         System.err.println("Incorrect!");
         wrong++;
       
      } i++; 
   
   
   
   }
   
 System.out.println("You answered " + count + " questions. You got " + right + "  correct and " + wrong + " incorrect.");
   
   
   }






}
/*

Call Random class 
Call Scanner class

declare Scanner variable 
declare Random variable 

create int variable for random1
create int variable for random 2 
create boolean answer for user input 
intilize count variable to hold number of questions 
initialize right variable to hold number of correct answers 
initiliaze wrong variable to hold number of incorrect answers


initialiint ze string variable for question 
use scanner variable answer to take user input

DO WHILE LOOP 
int i = 0; 
do 
	print variable to run question
while i < 10; 
 
post incremental count++ 

if answer is True 
	post incremental increase right++
else 
	post incremental increase wrong++ 
   

*/