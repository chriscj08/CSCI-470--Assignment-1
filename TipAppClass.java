import java.util.Scanner;

public class TipAppClass
{
  TipCalculator calculator = new TipCalculator(); //Object used for calculating bill
  
  public static void main(String[] args)
  {
    calculateTips();
  }
  
  public static void calculateTips()
  {
    Scanner input = new Scanner(System.in);
    double billAmt = 0;
    boolean check = false;
    
    do //This do while loop makes sure the user enters a valid number. 
    {
      try
      {
        //Get user input.
        System.out.print("Enter the bill amount: ");
        billAmt = input.nextDouble();
        
        if (billAmt < 0)
          System.out.print("You cannot have a negative bill amount. \n");
        else
        {
          System.out.print("There you go! Your number is: ");
          System.out.print(billAmt);
          check = true;
        }
      }
      catch(Exception e)
      {
        //If user enters something non-numeric, it will catch it.
        System.out.print("Please enter a valid number. \n");
        input.next();
      }
    }while(check == false); //Loop ends when user enters a number greater than zero.
    
    
  }
}
    
  
    
  