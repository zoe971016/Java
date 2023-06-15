// Import scanner to Java
import java.util.Scanner; 


// Dictate class name MortgageDueDay 
// Source code file name MortgageDueDay 
class MortgageDueDate {
   
   public static void main(String[] args) {
   
   // Initialize Scanner 
   Scanner input = new Scanner(System.in);
   
   int sunday = 0;
   int monday = 1;
   int tuesday = 2;
   int wednesday = 3;
   int thursday = 4;
   int friday = 5;
   int saturday = 6;
   int currentDay; 
   int daysTillFirstPay; 
   int firstPayCalculation; 

   //Greet user
   System.out.println("Crongratulations on your approval for your mortgage!");
      
   // Prompt user for current day with Sun = 0 to Sat = 6 
   System.out.println("Please enter the day number in a week for today (Sunday = 0, Monday = 1, etc.): ");
   currentDay = input.nextInt(); 
   
   //Prompt user for days until first payment 
   System.out.println("Please enter days until your first payment is due: ");
   daysTillFirstPay = input.nextInt(); 
   
   // Initialize calculation - (number of days until first payment + current day) % 7
   firstPayCalculation = (currentDay + daysTillFirstPay) % 7;  
   
   int day = firstPayCalculation; 
   
   switch (day) {
      case 0:
         System.out.println("Your first payment is Sunday."); 
         break; 
      case 1: 
         System.out.println("Your first payment is Monday.");
         break; 
      case 2:
         System.out.println("Your first payment is Tuesday."); 
         break; 
      case 3: 
         System.out.println("Your first payment is Wednesdayy.");
         break; 
      case 4:
         System.out.println("Your first payment is Thursday."); 
         break; 
      case 5: 
         System.out.println("Your first payment is Friday.");
         break; 
      case 6: 
         System.out.println("Your first payment is Saturday");
         break; 
   
   
   
   }
   
	

   }

   
}

/*
Import scanner to Java

Dictate class name MortgageDueDay 
Source code file name MortgageDueDay 

Initialize dates 
	Sun = 0
	Mon = 1
	Tues = 2
	Weds = 3
	Thurs = 4 
	Fri = 5
	Sat = 6

Prompt user for current day with Sun = 0 to Sat = 6 

Prompt user for days until first payment 

Initialize calculation 
	(number of days until first payment + current day) % 7 

Switch day = 0 
	case 0: 
		Your payment starts on Sunday
	case 1: 
		Your payment starts on Monday
	case 2: 
		Your payment starts on Tuesday
	case 3: 
		Your payment starts on Wednesday
	case 4: 
		Your payment starts on Thursday
	case 5: 
		Your payment starts on Friday
	case 6: 
		Your payment starts on Saturday


*/