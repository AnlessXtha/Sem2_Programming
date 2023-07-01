
/**
 *
 * @author (22067566 Aadesh Shrestha)
 * @version (1.0.0)
 */
/**
 * Declaration of DebitCard class
 * Stores value of pinNumber, withdrawalAmount, dateOfWithdraw and hasWithdrawn 
 * Takes out a withdrawal amount with values pinNumber, withdrawalAmount, dateOfWithdraw if the condtions
 * of pinNumber and withdrawalAmount are fulfilled.
 * Display all the values if hasWithdrawn is true else only display balanceAmount
 */
public class DebitCard extends BankCard
{
    //Attributes
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdraw;
    private boolean hasWithdrawn;

    //Constructor
    public DebitCard(int cardID, String issuerBank, String bankAccount, double balanceAmount, String clientName, int pinNumber)
    {
       super(cardID, issuerBank, bankAccount, balanceAmount);
       super.setClientName(clientName); 
       this.pinNumber = pinNumber; 
       this.hasWithdrawn = false;
    }
    
    //Mutator Method(Setter)
    public void setWithdrawalAmount(int withdrawalAmount)
    {
       this.withdrawalAmount = withdrawalAmount;
    }
    
    //Accessor Method(Getter)
    public int getPinNumber()
    {
        return this.pinNumber;
    }
    
    public int getWithdrawalAmount()
    {
        return this.withdrawalAmount;
    }
    
    public String getDateOfWithdraw()
    {
        return this.dateOfWithdraw;
    }
    
    public boolean getHasWithdrawn()
    {
        return this.hasWithdrawn;
    }
    
    /**
     * withdraw() is used to withdraw money from the balanceAmount
     * withdraw is done if the pinNumber is valid and withdrawalAmount is less than balanceAmount
     * else suitable message is displayed
     */
    public void withdraw(int pinNumber, int withdrawalAmount, String dateOfWithdraw)
    {      
        if (pinNumber == this.pinNumber){
            if(withdrawalAmount < super.getBalanceAmount() && withdrawalAmount > 0){
                super.setBalanceAmount(super.getBalanceAmount() - withdrawalAmount);
                this.pinNumber = pinNumber;
                this.withdrawalAmount = withdrawalAmount;
                this.dateOfWithdraw = dateOfWithdraw;
                hasWithdrawn = true;
                System.out.println("Your Transaction was Successful.");
            }
            else{
                System.out.println("You have Insufficent Balance.");
            }
        }
        else{
            System.out.println("The entered PIN number is incorrect.");
        }
    }
    
    /**
     * debitDisplay() is used to display the content of the debit card if the condition of hasWithdrawn is true.
     */
    public void debitDisplay()
    {
        if(hasWithdrawn == true){
            super.display();
            System.out.println("PIN Number: "+getPinNumber());
            System.out.println("Withdrawn Amount: Rs." +getWithdrawalAmount());
            System.out.println("Date of Withdraw: " +getDateOfWithdraw());
            System.out.println("\n");
        }
        else{
            super.display();
            //System.out.println("Current Balance Amount: Rs." +super.getBalanceAmount());
            System.out.println("\n");
        }
    }
}
