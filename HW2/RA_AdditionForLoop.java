import java.util.Scanner;
import java.util.Random;

class RA_AdditionForLoop {
   public static void main(String[] args) { 
   
   Scanner input = new Scanner(System.in);
   Random rand = new Random(); 
     
     
     
  
     int count = 0; 
     int right = 0;
     int wrong = 0; 
     
     
     
     
     
      

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
/*
Pseudocode 

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
post incremental count++ 
if answer is True 
	post incremental increase right++
else 
	post incremental increase wrong++ 

FOR LOOP 

for (int i = 0; i < 11, i++ ){
	Print variable to run question
	
	}

WHILE LOOP 
int i = 0; 

while (i < 11) 
	Print variable to run question 

DO WHILE LOOP 
int i = 0; 
do 
	print variable to run question
while i < 11; 
*/