
/**
 *
 * @author (22067566 Aadesh Shrestha)
 * @version (1.0.0)
 */
/**
 * Declaration of BankCard class
 * Stores value of cardID, clientName, issuerBank, bankAccount and balanceAmount 
 * Display all the values if clientName is not empty else display all values except clientName
 */
public class BankCard
{  
    //Attributes
    private int cardID;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private double balanceAmount;
   
    //Constructor
    public BankCard(int cardID, String issuerBank, String bankAccount, double balanceAmount)
    {
        this.cardID = cardID;
        this.issuerBank = issuerBank;
        this.bankAccount = bankAccount;
        this.balanceAmount = balanceAmount;
        clientName = "";
    }
       
    //Mutator Method(Setter)
    public void setClientName(String clientName)
    {
        this.clientName = clientName;
    }
   
    public void setBalanceAmount(double balanceAmount)
    {
        this.balanceAmount = balanceAmount;
    }
   
    //Accessor method for cardID
    public int getCardID()
    {
        return this.cardID;
    }
   
    public String getClientName()
    {
        return this.clientName;
    }
    
    public String getIssuerBank()
    {
        return this.issuerBank;
    }
   
    public String getBankAccount()
    {
        return this.bankAccount;
    }
   
    public double getBalanceAmount()
    {
        return this.balanceAmount;
    }
    
    /**
     * display() is used to display the content of the bank card. It also checks if the client name is assign a value or not.
     */
    public void display()
    {
        System.out.println("Card ID: " +getCardID());
        System.out.println("Issuer Bank: " +getIssuerBank());
        System.out.println("Bank Account: " +getBankAccount());
        System.out.println("Current Balance Amount: Rs." +getBalanceAmount());
    
        //Checking if clientName is empty or not
        if(clientName != ""){
            System.out.println("Client Name: " +getClientName());
        }
        else{
            System.out.println("Client Name has not been registered."); 
        }
    }
}
