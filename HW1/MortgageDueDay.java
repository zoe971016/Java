/*MIS 350 HW 2 Q4
  Gulziba Ekber
  This program is to calculate the first due date for Mortgage payment.
*/
import java.util.Scanner;
public class MortgageDueDay {
    public static void main(String[] args) {
        //Create a Scanner object to get user inputs
        Scanner input = new Scanner(System.in);

        //Get today as day number in a week.
        System.out.println("Congratulation on the approval of your mortgage!");
        System.out.println("Please enter the day number in a week for today.");
        System.out.print("(Make sure you enter 0 for Sunday, 1 for Monday, 2 for Tuesday,... and 6 for Saturday.): ");
        int today = input.nextInt();

        //Get the duration from today until the first payment due date
        System.out.print("In how many days is the first payment due? (Make sure you enter an integer number like 10, 20, etc.): ");
        int daysUntilFirstPayment = input.nextInt();

        //Calcualte the day number of the week for the payment due date. 
        //Use SWTICH structure to display the corresponding message.
        switch ((today + daysUntilFirstPayment) % 7) {
            case 0: System.out.println("Your first payment is due on a Sunday."); break;
            case 1: System.out.println("Your first payment is due on a Monday."); break;
            case 2: System.out.println("Your first payment is due on a Tuesday."); break;
            case 3: System.out.println("Your first payment is due on a Wednsday."); break;
            case 4: System.out.println("Your first payment is due on a Thursday."); break;
            case 5: System.out.println("Your first payment is due on a Friday."); break;
            case 6: System.out.println("Your first payment is due on a Saturday."); break;
        }
    }
}