
/**
 *
 * @author (22067566 Aadesh Shrestha)
 * @version (1.0.0)
 */
/**
 * Declaration of CreditCard class
 * Stores value of cvcNumber, creditLimit, interestRate, expirationDate, gracePeriod and isGranted
 * Sets creditLimit and gracePeriod with values creditLimit and gracePeriod if the condtions
 * of creditLimit is fulfilled
 * cancelCreditCard method cancels the credit card when called
 * Display all the values if isGranted is true else display all values except cvcNumber, creditLimit, garcePeriod
 */
public class CreditCard extends BankCard
{
    //Attributes
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    
    //Constructor
    public CreditCard(int cardID, String issuerBank, String bankAccount, double balanceAmount, String clientName, int cvcNumber,
    double interestRate, String expirationDate)
    {
        super(cardID, issuerBank, bankAccount, balanceAmount);
        super.setClientName(clientName);
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.isGranted = false;
    }
    
    //Mutator Method
    /**
     * This setter is used to set the value of creditLimit and gracePeriod if the given condtion is satisfied.
     */
    public void setCreditLimit(int creditLimit, int gracePeriod)
    {
        if (creditLimit <= super.getBalanceAmount() * 2.5 && creditLimit >= super.getBalanceAmount() * 2){
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod;
            this.isGranted = true;
        }
        else{
            System.out.println("Your requested Amount exceeds the Credit Limit.");
        }
    }
    
    //Accessor Method
    public int getCvcNumber()
    {
        return this.cvcNumber;
    }
    
    public double getCreditLimit()
    {
        return this.creditLimit;
    }
    
    public double getInterestRate()
    {
        return this.interestRate;
    }
    
    public String getExpirationDate()
    {
        return this.expirationDate;
    }
    
    public int getGracePeriod()
    {
        return this.gracePeriod;
    }
    
    public boolean getIsGranted()
    {
        return this.isGranted;
    }
    
    /**
     * cancelCreditCard() is used to remove the client's credit card.
     */
    public void cancelCreditCard()
    {
        this.cvcNumber = 0;
        this.creditLimit = 0;
        this.gracePeriod = 0;
        this.isGranted = false;
    }
    
    /**
     * creditDisplay() is used to display the content of the credit card if the condition of isGranted is true.
     */
    public void creditDisplay()
    {
        if (isGranted == true){
            super.display();
            System.out.println("CVC Number: " +getCvcNumber()); 
            System.out.println("Credit Limit: Rs." +getCreditLimit());
            System.out.println("Interest Rate: " +getInterestRate());
            System.out.println("Expiration Date: " +getExpirationDate());
            System.out.println("Grace Period: " +getGracePeriod());
            System.out.println("\n");
        }
        else{
            super.display();
            System.out.println("CVC Number: " +getCvcNumber());
            System.out.println("Interest Rate: " +getInterestRate());
            System.out.println("Expiration Date: " +getExpirationDate());
            System.out.println("\n");
        }
    }
}
