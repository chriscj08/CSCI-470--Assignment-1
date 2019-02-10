import java.util.Scanner;

public class TipAppClass
{
  public static TipCalculator calculator = new TipCalculator(); //Object used for calculating bill
  
  public static void main(String[] args)
  {
    calculateTips();
  }
  
  public static void calculateTips()
  {
    System.out.print("***** Tip Calculator ***** \n\n\n"); 
    Scanner input = new Scanner(System.in);
    double billAmt = 0;
    int tipPercent = 0;
    int partySize = 0;
    boolean check = false;
    
    do //This do while loop makes sure the user enters a valid number. 
    {
      try
      {
        //Get user input.
        System.out.print("Enter the bill amount: ");
        billAmt = input.nextDouble();
        
        if (billAmt < 0)
          System.out.print("You cannot have a negative bill amount. \n\n");
        else
        {
          calculator.setBill(billAmt);
          check = true;
        }
      }
      catch(Exception e)
      {
        //If user enters something non-numeric, it will catch it.
        System.out.print("Please enter a valid bill amount. \n\n");
        input.next();
      }
    }while(check == false); //Loop ends when user enters a number greater than zero.
    
    check = false; //Reset our test variable.
    
    do //This do while loop makes sure the user enters a valid tip percentage. 
    {
      try
      {
        //Get user input.
        System.out.print("Enter the tip percentage (20 is 20%): ");
        tipPercent = input.nextInt();
        
        if (tipPercent < 0)
          System.out.print("You cannot have a negative tip percentage. \n\n");
        else
        {
          calculator.setTipPercentage(tipPercent);
          check = true;
        }
      }
      catch(Exception e)
      {
        //If user enters something non-numeric, it will catch it.
        System.out.print("Please enter a valid tip percentage. \n\n");
        input.next();
      }
    }while(check == false); //Loop ends when user enters a number greater than zero.
    
    check = false; //Reset our test variable
    
    do //This do while loop makes sure the user enters a valid tip percentage. 
    {
      try
      {
        //Get user input.
        System.out.print("Enter the party size: ");
        partySize = input.nextInt();
        
        if (partySize < 1)
          System.out.print("You must have at least one person in your party. \n\n");
        else
        {
          calculator.setPartySize(partySize);
          check = true;
        }
      }
      catch(Exception e)
      {
        //If user enters something non-numeric, it will catch it.
        System.out.print("Please enter a valid party size. \n\n");
        input.next();
      }
    }while(check == false); //Loop ends when user enters a number greater than zero.
                     
    //With everything we need, we can now calculate the bill and everyone's equal payment.
                     
    System.out.print("***** The Bill *****\n\n");
                     
    System.out.print("Bill amount: $" + calculator.getBill() + "\n");
    System.out.print("Tip percent: " + calculator.getTipPercentage() + "%\n");
    System.out.print("Party size: " + calculator.getPartySize() + "\n");                 
  }
}
    
  
    
  