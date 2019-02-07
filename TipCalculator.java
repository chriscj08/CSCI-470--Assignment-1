public class TipCalculator
{
  private double bill;
  private int tipPercentage;
  private int partySize;
  
  //Default constructor. 
  public TipCalculator()
  {
    this.bill = 0;
    this.tipPercentage = 20;
    this.partySize = 1;
  }
  
  //Get method for bill.
  public double getBill()
  {
    return bill;
  }
  
  //Set method for bill.
  public void setBill( double bill)
  {
    this.bill = bill;
  }
  
  //Get method for tipPercentage.
  public int getTipPercentage()
  {
    return tipPercentage;
  }
  
  //Set method for tipPercentage.
  public void setTipPercentage( int tipPercentage)
  {
    this.tipPercentage = tipPercentage;
  }
  
  //Get method for partySize.
  public int getPartySize()
  {
    return partySize;
  }
  
  //Set method for partySize.
  public void setPartySize( int partySize)
  {
    this.partySize = partySize;
  }
  
  //getTotalBill() returns the total including tip.
  public double getTotalBill()
  {
    return (getBill() + (getBill() * getTipPercentage()));  //Java automatically typecasts ints to doubles when multiplying them together.
  }
  
  //getIndividualShare() returns the amount each person should equally contribute.
  public double getIndividualShare()
  {
    return ((getTotalBill())/(getPartySize()));
  }
}
  