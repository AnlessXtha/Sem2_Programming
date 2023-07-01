
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class BankGUI implements ActionListener
{
    //Declaration of frame and panelDC
    private JFrame frame;
    private JPanel panelDC;

    /**Attributes for Credit card */
    
    //Headings
    private JLabel mainTitleDC;
    private JLabel debitCardTitle;
    private JLabel addDebitCardTitle;
    private JLabel withdraw;

    //For Add Debit Card

    private JLabel debitCardIDL;
    private JTextField debitCardIDTF;

    private JLabel debitClientNameL;
    private JTextField debitClientNameTF;

    private JLabel debitIssuerBankL;
    private JTextField debitIssuerBankTF;

    private JLabel debitBankAccountL;
    private JTextField debitBankAccountTF;

    private JLabel debitBalanceAmountL;
    private JTextField debitBalanceAmountTF;

    private JLabel debitPinNumberL;
    private JTextField debitPinNumberTF;

    //For Withdraw

    private JLabel cardIDWithdrawL;
    private JTextField cardIDWithdrawTF;

    private JLabel pinNumberWithdrawL;
    private JTextField pinNumberWithdrawTF;

    private JLabel withdrawalAmountL;
    private JTextField withdrawalAmountTF;

    private JLabel dateOfWithdrawL;
    private JComboBox dayDateOfWithdrawCB, monthDateOfWithdrawCB, yearDateOfWithdrawCB;

    //Buttons
    private JButton switchToDC;
    private JButton switchToCC;
    private JButton addDebitCardBtn;
    private JButton withdrawDCBtn;
    private JButton clearDCBtn;
    private JButton displayDCBtn;

    /**Attributes for Credit card */
    
    //Declaration of panelCC
    private JPanel panelCC;
    
    //Headings
    private JLabel mainTitleCC;
    private JLabel creditCardTitle;
    private JLabel addCreditCardTitle;
    private JLabel setCreditLimit;
    private JLabel creditCardCancel;

    //For Add Credit Card

    private JLabel creditCardIDL;
    private JTextField creditCardIDTF;

    private JLabel creditClientNameL;
    private JTextField creditClientNameTF;

    private JLabel creditIssuerBankL;
    private JTextField creditIssuerBankTF;

    private JLabel creditBankAccountL;
    private JTextField creditBankAccountTF;

    private JLabel creditBalanceAmountL;
    private JTextField creditBalanceAmountTF;

    private JLabel creditCvcNumberL;
    private JTextField creditCvcNumberTF;

    private JLabel creditInterestRateL;
    private JTextField creditInterestRateTF;

    private JLabel creditExpirationDateL;
    private JComboBox dayExpirationDateCB, monthExpirationDateCB, yearExpirationDateCB;

    //For Set Credit Limit
    private JLabel cardIDcreditLimitL;
    private JTextField cardIDcreditLimitTF;

    private JLabel creditLimitL;
    private JTextField creditLimitTF;

    private JLabel gracePeriodL;
    private JTextField gracePeriodTF;

    //For Credit Card Cancellation
    private JLabel cardIDCreditCancelL; 
    private JTextField cardIDCreditCancelTF;

    //Buttons
    private JButton addCreditCardBtn;
    private JButton setCreditLimitCCBtn;
    private JButton creditCardCancelCCBtn;
    private JButton clearCCBtn;
    private JButton displayCCBtn;

    //ArrayList
    ArrayList<BankCard> cards = new ArrayList<BankCard>();

    //List of months for Combo Box
    String[] mon = {"Jan","Feb","Mar","April","May","Jun","July","Aug","Sept","Oct","Nov","Dec"};

    public BankGUI(){
        //Initialization of frame with required customization
        frame = new JFrame();
        frame.setSize(900,750);
        panelDC = new JPanel();
        panelDC.setSize(900, 750);

        /** Debit Card Panel */

        //Heading
        mainTitleDC = new JLabel("Bank Card");
        mainTitleDC.setFont(new Font("Arial",Font.BOLD,30));
        mainTitleDC.setBounds(380, 20, 150, 40);
        panelDC.add(mainTitleDC);

        //Card-Heading
        debitCardTitle = new JLabel("Debit Card");
        debitCardTitle.setFont(new Font("Arial",Font.BOLD,24));
        debitCardTitle.setBounds(393, 70, 125, 35);
        panelDC.add(debitCardTitle);

        //Switch button
        switchToCC = new JButton("Switch to Credit");
        switchToCC.setBounds(660, 80, 130, 32);
        switchToCC.addActionListener(this);
        panelDC.add(switchToCC);

        //Sub-Heading(Add Debit Card)
        addDebitCardTitle = new JLabel("Add Debit Card");
        addDebitCardTitle.setFont(new Font("Arail",Font.BOLD,20));
        addDebitCardTitle.setBounds(55, 125, 145, 30);
        panelDC.add(addDebitCardTitle);

        //First Column of Add Debit Card

        debitCardIDL = new JLabel("Card ID");
        debitCardIDL.setBounds(55, 190, 60, 20);
        debitCardIDTF = new JTextField();
        debitCardIDTF.setBounds(175, 185, 210, 32);
        panelDC.add(debitCardIDL);
        panelDC.add(debitCardIDTF);

        debitClientNameL = new JLabel("Client Name");
        debitClientNameL.setBounds(55, 230, 75, 20);
        debitClientNameTF = new JTextField();
        debitClientNameTF.setBounds(175, 225, 210, 32);
        panelDC.add(debitClientNameL);
        panelDC.add(debitClientNameTF);

        debitIssuerBankL = new JLabel("Issuer Bank");
        debitIssuerBankL.setBounds(55, 270, 75, 20);
        debitIssuerBankTF = new JTextField();
        debitIssuerBankTF.setBounds(175, 265, 210, 32);
        panelDC.add(debitIssuerBankL);
        panelDC.add(debitIssuerBankTF);

        //Second Column of Add Debit Card
        debitBankAccountL = new JLabel("Bank Account No.");
        debitBankAccountL.setBounds(500, 190, 110, 20);
        debitBankAccountTF = new JTextField();
        debitBankAccountTF.setBounds(625, 185, 210, 32);
        panelDC.add(debitBankAccountL);
        panelDC.add(debitBankAccountTF);

        debitBalanceAmountL = new JLabel("Balance Amount");
        debitBalanceAmountL.setBounds(500, 230, 100, 20);
        debitBalanceAmountTF = new JTextField();
        debitBalanceAmountTF.setBounds(625, 225, 210, 32);
        panelDC.add(debitBalanceAmountL);
        panelDC.add(debitBalanceAmountTF);

        debitPinNumberL = new JLabel("PIN Number");
        debitPinNumberL.setBounds(500, 270, 80, 20);
        debitPinNumberTF = new JTextField();
        debitPinNumberTF.setBounds(625, 265, 210, 32);
        panelDC.add(debitPinNumberL);
        panelDC.add(debitPinNumberTF);

        //Button(Add Debit Card)
        addDebitCardBtn = new JButton("Add Debit Card");
        addDebitCardBtn.setBounds(380, 345, 135, 32);
        addDebitCardBtn.addActionListener(this);
        panelDC.add(addDebitCardBtn);

        //Sub-heading(withdraw)
        withdraw = new JLabel("Withdraw");
        withdraw.setFont(new Font("Arail",Font.BOLD,20));
        withdraw.setBounds(55, 395, 90, 28);
        panelDC.add(withdraw);

        //First column of the Withdraw

        cardIDWithdrawL = new JLabel("Card ID");
        cardIDWithdrawL.setBounds(55, 455, 50, 20);
        cardIDWithdrawTF = new JTextField();
        cardIDWithdrawTF.setBounds(180, 450, 210, 32);
        panelDC.add(cardIDWithdrawL);
        panelDC.add(cardIDWithdrawTF);

        pinNumberWithdrawL = new JLabel("PIN Number");
        pinNumberWithdrawL.setBounds(55, 500, 80, 20);
        pinNumberWithdrawTF = new JTextField();
        pinNumberWithdrawTF.setBounds(180, 495, 210, 32);
        panelDC.add(pinNumberWithdrawL);
        panelDC.add(pinNumberWithdrawTF);

        withdrawalAmountL = new JLabel("Withdrawal Amount");
        withdrawalAmountL.setBounds(505, 455, 125, 20);
        withdrawalAmountTF = new JTextField();
        withdrawalAmountTF.setBounds(630, 450, 210, 32);
        panelDC.add(withdrawalAmountL);
        panelDC.add(withdrawalAmountTF);

        //Second column of Withdraw
        dateOfWithdrawL = new JLabel("Date of Withdraw");
        dateOfWithdrawL.setBounds(505, 500, 110, 20);
        panelDC.add(dateOfWithdrawL);

        //day
        dayDateOfWithdrawCB = new JComboBox();
        for(int i = 1; i <= 31; i++){
            dayDateOfWithdrawCB.addItem(i);
        }
        dayDateOfWithdrawCB.setBounds(630, 495, 65, 32);
        dayDateOfWithdrawCB.setEditable(true);
        panelDC.add(dayDateOfWithdrawCB);

        //month
        //String[] months={"Jan","Feb","Mar","April","May","Jun","July","Aug","Sept","Oct","Nov","Dec"};
        monthDateOfWithdrawCB = new JComboBox(mon);
        monthDateOfWithdrawCB.setBounds(700, 495, 75, 32);
        monthDateOfWithdrawCB.setEditable(true);
        panelDC.add(monthDateOfWithdrawCB);

        //year
        yearDateOfWithdrawCB = new JComboBox();
        for(int i = 2000; i <= 2023; i++){
            yearDateOfWithdrawCB.addItem(i);
        }
        yearDateOfWithdrawCB.setBounds(780, 495, 65, 32);
        yearDateOfWithdrawCB.setEditable(true);
        panelDC.add(yearDateOfWithdrawCB);

        //buttons(withdraw,clear,display)
        withdrawDCBtn = new JButton("Withdraw from Debit Card");
        withdrawDCBtn.setBounds(355, 580, 190, 32);
        withdrawDCBtn.addActionListener(this);
        panelDC.add(withdrawDCBtn);

        clearDCBtn = new JButton("Clear");
        clearDCBtn.setBounds(130, 655, 120, 32);
        clearDCBtn.addActionListener(this);
        panelDC.add(clearDCBtn);

        displayDCBtn = new JButton("Display");
        displayDCBtn.setBounds(650, 655, 120, 32);
        displayDCBtn.addActionListener(this);
        panelDC.add(displayDCBtn);

        /** Credit Card Panel */

        panelCC = new JPanel();
        panelCC.setSize(900, 750);

        //Switch button
        switchToDC = new JButton("Switch to Debit");
        switchToDC.setBounds(660, 80, 130, 32);
        switchToDC.addActionListener(this);
        panelCC.add(switchToDC);

        //Heading
        mainTitleCC = new JLabel("Bank Card");
        mainTitleCC.setFont(new Font("Arial",Font.BOLD,30));
        mainTitleCC.setBounds(380, 20, 150, 40);
        panelCC.add(mainTitleCC);

        //Card-Heading
        creditCardTitle = new JLabel("Credit Card");
        creditCardTitle.setFont(new Font("Arial",Font.BOLD,24));
        creditCardTitle.setBounds(390, 65, 130, 35);
        panelCC.add(creditCardTitle);

        //Sub-Heading(Add Credit Card)
        addCreditCardTitle = new JLabel("Add Credit Card");
        addCreditCardTitle.setFont(new Font("Arail",Font.BOLD,20));
        addCreditCardTitle.setBounds(55, 125, 155, 30);
        panelCC.add(addCreditCardTitle);

        //First Column of Add Credit Card
        creditCardIDL = new JLabel("Card ID");
        creditCardIDL.setBounds(55, 190, 60, 20);
        creditCardIDTF = new JTextField();
        creditCardIDTF.setBounds(175, 185, 210, 32);
        panelCC.add(creditCardIDL);
        panelCC.add(creditCardIDTF);

        creditClientNameL = new JLabel("Client Name");
        creditClientNameL.setBounds(55, 230, 75, 20);
        creditClientNameTF = new JTextField();
        creditClientNameTF.setBounds(175, 225, 210, 32);
        panelCC.add(creditClientNameL);
        panelCC.add(creditClientNameTF);

        creditIssuerBankL = new JLabel("Issuer Bank");
        creditIssuerBankL.setBounds(55, 270, 75, 20);
        creditIssuerBankTF = new JTextField();
        creditIssuerBankTF.setBounds(175, 265, 210, 32);
        panelCC.add(creditIssuerBankL);
        panelCC.add(creditIssuerBankTF);

        creditBankAccountL = new JLabel("Bank Account No");
        creditBankAccountL.setBounds(55, 310, 110, 20);
        creditBankAccountTF = new JTextField();
        creditBankAccountTF.setBounds(175, 305, 210, 32);
        panelCC.add(creditBankAccountL);
        panelCC.add(creditBankAccountTF);

        //Second Column of Add Credit Card
        creditBalanceAmountL = new JLabel("Balance Amount");
        creditBalanceAmountL.setBounds(495, 190, 105, 20);
        creditBalanceAmountTF = new JTextField();
        creditBalanceAmountTF.setBounds(645, 185, 210, 32);
        panelCC.add(creditBalanceAmountL);
        panelCC.add(creditBalanceAmountTF);

        creditCvcNumberL = new JLabel("CVC Number");
        creditCvcNumberL.setBounds(495, 230, 85, 20);
        creditCvcNumberTF = new JTextField();
        creditCvcNumberTF.setBounds(645, 225, 210, 32);
        panelCC.add(creditCvcNumberL);
        panelCC.add(creditCvcNumberTF);

        creditInterestRateL = new JLabel("Interest Rate");
        creditInterestRateL.setBounds(495, 270, 80, 20);
        creditInterestRateTF = new JTextField();
        creditInterestRateTF.setBounds(645, 265, 210, 32);
        panelCC.add(creditInterestRateL);
        panelCC.add(creditInterestRateTF);

        creditExpirationDateL = new JLabel("Expiration Date");
        creditExpirationDateL.setBounds(495, 310, 100, 20);
        panelCC.add(creditExpirationDateL);

        //day
        dayExpirationDateCB = new JComboBox();
        for(int i = 1; i <= 31; i++){
            dayExpirationDateCB.addItem(i);
        }
        dayExpirationDateCB.setBounds(610, 305, 65, 32);
        dayExpirationDateCB.setEditable(true);
        panelCC.add(dayExpirationDateCB);

        //month
        monthExpirationDateCB = new JComboBox(mon);
        monthExpirationDateCB.setBounds(695, 305, 75, 32);
        monthExpirationDateCB.setEditable(true);
        panelCC.add(monthExpirationDateCB);

        //year
        yearExpirationDateCB = new JComboBox();
        for(int i = 2000; i <= 2023; i++){
            yearExpirationDateCB.addItem(i);
        }
        yearExpirationDateCB.setBounds(790, 305, 65, 32);
        yearExpirationDateCB.setEditable(true);
        panelCC.add(yearExpirationDateCB);

        //Button(Add Credit Card)
        addCreditCardBtn = new JButton("Add Credit Card");
        addCreditCardBtn.setBounds(380, 375, 135, 32);
        addCreditCardBtn.addActionListener(this);
        panelCC.add(addCreditCardBtn);

        //Sub-heading(Set Credit Limit)
        setCreditLimit = new JLabel("Set the Credit Limit");
        setCreditLimit.setFont(new Font("Arail",Font.BOLD,20));
        setCreditLimit.setBounds(50, 425, 185, 30);
        panelCC.add(setCreditLimit);

        //Components of Set Credit Limit

        cardIDcreditLimitL = new JLabel("Card ID");
        cardIDcreditLimitL.setBounds(50, 470, 75, 20);
        cardIDcreditLimitTF = new JTextField();
        cardIDcreditLimitTF.setBounds(175, 465, 210, 32);
        panelCC.add(cardIDcreditLimitL);
        panelCC.add(cardIDcreditLimitTF);

        creditLimitL = new JLabel("Credit Limit");
        creditLimitL.setBounds(50, 515, 75, 20);
        creditLimitTF = new JTextField();
        creditLimitTF.setBounds(175, 510, 210, 32);
        panelCC.add(creditLimitL);
        panelCC.add(creditLimitTF);

        gracePeriodL = new JLabel("Grace Period");
        gracePeriodL.setBounds(50, 560, 85, 20);
        gracePeriodTF = new JTextField();
        gracePeriodTF.setBounds(175, 555, 210, 32);
        panelCC.add(gracePeriodL);
        panelCC.add(gracePeriodTF);

        //Button(Set Credit Limit)
        setCreditLimitCCBtn = new JButton("Set Credit Limit");
        setCreditLimitCCBtn.setBounds(130, 600, 190, 32);
        setCreditLimitCCBtn.addActionListener(this);
        panelCC.add(setCreditLimitCCBtn);

        //Sub-heading(Credit Card Cancellation)
        creditCardCancel = new JLabel("Credit Card Cancellation");
        creditCardCancel.setFont(new Font("Arail",Font.BOLD,20));
        creditCardCancel.setBounds(540, 425, 230, 30);
        panelCC.add(creditCardCancel);

        //Components of Credit Card Cancellation
        cardIDCreditCancelL = new JLabel("Card ID");
        cardIDCreditCancelL.setBounds(540, 475, 50, 20);
        cardIDCreditCancelTF = new JTextField();
        cardIDCreditCancelTF.setBounds(635, 470, 210, 32);
        panelCC.add(cardIDCreditCancelL);
        panelCC.add(cardIDCreditCancelTF);

        //Button(Cancel Credit Card)
        creditCardCancelCCBtn = new JButton("Cancel Credit Card");
        creditCardCancelCCBtn.setBounds(600, 540, 190, 32);
        creditCardCancelCCBtn.addActionListener(this);
        panelCC.add(creditCardCancelCCBtn);

        //Buttons(Clear, Display)
        clearCCBtn = new JButton("Clear");
        clearCCBtn.setBounds(130, 655, 120, 32); 
        clearCCBtn.addActionListener(this);
        panelCC.add(clearCCBtn);

        displayCCBtn = new JButton("Display");
        displayCCBtn.setBounds(650, 655, 120, 32);
        displayCCBtn.addActionListener(this);
        panelCC.add(displayCCBtn);

        //Frame and Panels Setup
        panelDC.setLayout(null);
        panelCC.setLayout(null);
        frame.add(panelDC);

        frame.setLayout(null);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }

    //implement the method of the ActionListener
    public void actionPerformed(ActionEvent e){
        //Switches between Debit Card panel and Credit Card panel
        if(e.getSource() == switchToCC){
            frame.remove(panelDC);
            frame.validate(); //ensure that the layout of the container is updated
            frame.repaint();  //signals to the system that the component needs to be redrawn on the screen  
            frame.add(panelCC);
            frame.validate();
            frame.repaint();
        }
        if(e.getSource() == switchToDC){
            frame.remove(panelCC);
            frame.validate();
            frame.repaint();
            frame.add(panelDC);
            frame.validate();
            frame.repaint();
        }

        //Event Handeling of Add Debit Card Button
        if(e.getSource() == addDebitCardBtn){

            if(debitCardIDTF.getText().equals("") || debitClientNameTF.getText().equals("") || debitIssuerBankTF.getText().equals("") || debitBankAccountTF.getText().equals("") || debitBalanceAmountTF.getText().equals("") || debitPinNumberTF.getText().equals(""))
            {   
                //checks if any textfield is empty or not
                JOptionPane.showMessageDialog(frame, "All values must be entered.", "Error", JOptionPane.ERROR_MESSAGE);

            }
            else{
                try{
                    //to retreive value from textfields
                    String cardIDText = debitCardIDTF.getText();
                    String clientName = debitClientNameTF.getText();
                    String issuerBank = debitIssuerBankTF.getText();
                    String bankAccount = debitBankAccountTF.getText();
                    String balanceAmountText = debitBalanceAmountTF.getText();
                    String pinNumberText = debitPinNumberTF.getText();

                    int cardID = Integer.parseInt(cardIDText); //converting the string values into integers
                    int balanceAmount = Integer.parseInt(balanceAmountText);
                    int pinNumber = Integer.parseInt(pinNumberText);

                    //creating an object of DebitCard class
                    DebitCard debitObj = new DebitCard(cardID, issuerBank, bankAccount, balanceAmount, clientName, pinNumber);

                    if(cards.size() == 0){
                        //checks if the ArrayList is empty
                        cards.add(debitObj); //adds the object ot the cards ArrayList
                        JOptionPane.showMessageDialog(frame, "Debit Card has been Added.", "Successful", JOptionPane.INFORMATION_MESSAGE);
                    }

                    else{
                        for(BankCard card : cards){
                            //loops through every object present in cards ArrayList
                            if(card instanceof DebitCard){
                                //if card belongs to DebitCard class                                
                                DebitCard debitCard = (DebitCard) card; //Downcast
                                if(debitCard.getCardID() == cardID){
                                    JOptionPane.showMessageDialog(frame, "The Debit Card is already present.", "Error", JOptionPane.ERROR_MESSAGE);
                                    return;
                                }

                            }
                        }

                        cards.add(debitObj); //adds the object ot the cards ArrayList
                        JOptionPane.showMessageDialog(frame, "Debit Card Added.", "Successful", JOptionPane.INFORMATION_MESSAGE);
                    }

                }
                catch (NumberFormatException em){
                    //this will be returned if the desired input is not provided
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers in Card ID, Balance Amount and PIN number.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        //Event Handeling of Add Credit card Button
        if(e.getSource() == addCreditCardBtn){

            if(creditCardIDTF.getText().equals("") || creditClientNameTF.getText().equals("") || creditIssuerBankTF.getText().equals("") || creditBankAccountTF.getText().equals("") || creditBalanceAmountTF.getText().equals("") 
            || creditCvcNumberTF.getText().equals("") || creditInterestRateTF.getText().equals(""))
            {
                JOptionPane.showMessageDialog(frame, "All values must be entered.", "Error", JOptionPane.ERROR_MESSAGE);

            }
            else{
                try{
                    //to retreive value from textfields
                    String cardIDText = creditCardIDTF.getText();
                    String clientName = creditClientNameTF.getText();
                    String issuerBank = creditIssuerBankTF.getText();
                    String bankAccount = creditBankAccountTF.getText();
                    String balanceAmountText = creditBalanceAmountTF.getText();
                    String cvcNumberText = creditCvcNumberTF.getText();
                    String interestRateText = creditInterestRateTF.getText();
                    
                    //to retreive value from combo box
                    String dayCB = dayExpirationDateCB.getSelectedItem().toString();
                    String monthCB = monthExpirationDateCB.getSelectedItem().toString();
                    String yearCB = yearExpirationDateCB.getSelectedItem().toString();

                    String expirationDate = monthCB + " " + dayCB + "," + yearCB;

                    //converting the string values into integers
                    int cardID = Integer.parseInt(cardIDText);
                    int balanceAmount = Integer.parseInt(balanceAmountText);
                    int cvcNumber = Integer.parseInt(cvcNumberText);
                    double interestRate = Double.parseDouble(interestRateText);

                    CreditCard creditObj = new CreditCard(cardID, issuerBank, bankAccount, balanceAmount, clientName, cvcNumber, interestRate, expirationDate);
                
                    if(cards.size() == 0){
                        //checks if the ArrayList is empty
                        cards.add(creditObj); //adds the object ot the cards ArrayList
                        JOptionPane.showMessageDialog(frame, "Credit Card has been Added.", "Successful", JOptionPane.INFORMATION_MESSAGE);
                    }

                    else{
                        for(BankCard card : cards){
                            //loops through every object present in cards ArrayList
                            if(card instanceof CreditCard){
                                //if card belongs to CreditCard class
                                CreditCard creditCard = (CreditCard) card; //Downcast
                                if(creditCard.getCardID() == cardID){
                                    JOptionPane.showMessageDialog(frame, "The Credit Card is already present.", "Error", JOptionPane.ERROR_MESSAGE);
                                    return;
                                }

                            }
                        }
                        cards.add(creditObj); //adds the object ot the cards ArrayList
                        JOptionPane.showMessageDialog(frame, "Credit Card Added.", "Successful", JOptionPane.INFORMATION_MESSAGE);
                    }

                }
                catch (NumberFormatException em){
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers in Card ID, Balance Amount, CVC Number and Interest Rate.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        //Event Handeling of Withdraw Button
        if(e.getSource() == withdrawDCBtn){
            if(cardIDWithdrawTF.getText().equals("") || withdrawalAmountTF.getText().equals("") || pinNumberWithdrawTF.getText().equals(""))
            {
                JOptionPane.showMessageDialog(frame, "All values must be entered.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                try{
                    boolean correctCard = false;
                    String cardIDWithdrawText = cardIDWithdrawTF.getText();
                    String withdrawalAmountText = withdrawalAmountTF.getText();
                    String pinNumberTextWithdraw = pinNumberWithdrawTF.getText();

                    String dayCB = dayDateOfWithdrawCB.getSelectedItem().toString();
                    String monthCB = monthDateOfWithdrawCB.getSelectedItem().toString();
                    String yearCB = yearDateOfWithdrawCB.getSelectedItem().toString();

                    String dateOfWithdraw = monthCB + " " + dayCB + "," + yearCB;

                    int cardIDWithdraw = Integer.parseInt(cardIDWithdrawText);
                    int pinNumberWithdraw = Integer.parseInt(pinNumberTextWithdraw);
                    int withdrawalAmount = Integer.parseInt(withdrawalAmountText);

                    for(BankCard card : cards){
                        if(card instanceof DebitCard){
                            //Downcast
                            DebitCard debitCard = (DebitCard) card;
                            if(debitCard.getCardID() == cardIDWithdraw){
                                correctCard = true;
                                ((DebitCard)card).withdraw(pinNumberWithdraw, withdrawalAmount, dateOfWithdraw); // calls withdraw method from DebitCard class
                                if (pinNumberWithdraw == debitCard.getPinNumber()){
                                    if(withdrawalAmount < debitCard.getBalanceAmount() && withdrawalAmount > 0){
                                        JOptionPane.showMessageDialog(frame, "Your amount is withdrawn.", "Successful", JOptionPane.INFORMATION_MESSAGE);
                                        break;
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(frame, "Your Withdrawal Amount exceeds your Balance Amount.", "Warning", JOptionPane.WARNING_MESSAGE);
                                    }
                                }
                                else{
                                    JOptionPane.showMessageDialog(frame, "You have entered an incorrect PIN Number.", "Warning", JOptionPane.WARNING_MESSAGE);
                                }
                            }
                        }
                    }
                    if(!correctCard){
                        //if invalid card is given
                        JOptionPane.showMessageDialog(frame, "The Card ID is invalid.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                catch (NumberFormatException em){
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers in Card ID, PIN number and Withdrawal Amount.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        //Event Handeling of Set Credit Limit Button
        if(e.getSource() == setCreditLimitCCBtn){
            if(cardIDcreditLimitTF.getText().equals("") || creditLimitTF.getText().equals("") || gracePeriodTF.getText().equals(""))
            {
                JOptionPane.showMessageDialog(frame, "All values must be entered.", "Error", JOptionPane.ERROR_MESSAGE);

            }

            else{
                try{
                    boolean correctCard = false;
                    String cardIDcreditLimitText = cardIDcreditLimitTF.getText();
                    String creditLimitText = creditLimitTF.getText();
                    String gracePeriodText = gracePeriodTF.getText();

                    int cardIDcreditLimit = Integer.parseInt(cardIDcreditLimitText);
                    int creditLimit = Integer.parseInt(creditLimitText);
                    int gracePeriod = Integer.parseInt(gracePeriodText);

                    for(BankCard card : cards){
                        if(card instanceof CreditCard){
                            //Downcast
                            CreditCard creditCard = (CreditCard) card;
                            if(creditCard.getCardID() == cardIDcreditLimit){

                                correctCard = true;
                                ((CreditCard)card).setCreditLimit(creditLimit, gracePeriod); // calls setCreditLimit method from CreditCard class
                                if (creditLimit <= creditCard.getBalanceAmount() * 2.5 && creditLimit >= creditCard.getBalanceAmount() * 2){
                                    JOptionPane.showMessageDialog(frame, "The Credit Limit is set.", "Successful", JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                }
                                else{
                                    JOptionPane.showMessageDialog(frame, "The requested Amount exceeds the Credit Limit. It should be lesser than 2.5 times your balance amount and greater than 2 times your balance amount.", "Warning", JOptionPane.WARNING_MESSAGE);
                                }
                            }
                        }
                    }
                    if(!correctCard){
                        JOptionPane.showMessageDialog(frame, "The Card ID is invalid.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                catch (NumberFormatException em){
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers in Card ID, Credit Limit and Grace Period.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        //Event Handeling of Credit Card Cancellation Button
        if(e.getSource() == creditCardCancelCCBtn){
            if(cardIDCreditCancelTF.getText().equals(""))
            {
                JOptionPane.showMessageDialog(frame, "Card ID not entered.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                try{
                    boolean correctCard = false;
                    String cardIDCancelText = cardIDCreditCancelTF.getText();
                    int cardIDCancel = Integer.parseInt(cardIDCancelText);
                    for(BankCard card : cards){
                        if(card instanceof CreditCard){
                            //Downcast
                            CreditCard creditCard = (CreditCard) card;
                            if(cardIDCancel == creditCard.getCardID()){
                                correctCard = true;
                                ((CreditCard)card).cancelCreditCard(); // calls cancelCreditCard method from CreditCard class
                                JOptionPane.showMessageDialog(frame, "The Card has been cancelled.", "Successful", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }
                        }
                    }
                    if(!correctCard){
                        JOptionPane.showMessageDialog(frame, "The Card ID is invalid.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                catch(NumberFormatException em){
                    JOptionPane.showMessageDialog(frame, "Please enter valid number in Card ID.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        //Event Handeling of Display Button of Debit card
        if(e.getSource() == displayDCBtn){
            for (BankCard card : cards){
                if (card instanceof DebitCard) {
                    ((DebitCard)card).debitDisplay(); // calls debitDisplay method from DebitCard class
                }
            }
        }

        //Event Handeling of Display Button for Credit card
        if(e.getSource() == displayCCBtn){
            for (BankCard card : cards){
                if (card instanceof CreditCard) {
                    ((CreditCard)card).creditDisplay(); // calls creditDisplay method from CreditCard class
                }
            }
        }

        //Event Handeling of Clear Button for Debit card
        if(e.getSource() == clearDCBtn){
            // Clear all text fields and combo boxes
            debitCardIDTF.setText("");
            debitClientNameTF.setText("");
            debitIssuerBankTF.setText("");
            debitBankAccountTF.setText("");
            debitBalanceAmountTF.setText("");
            debitPinNumberTF.setText("");

            cardIDWithdrawTF.setText("");
            pinNumberWithdrawTF.setText("");
            withdrawalAmountTF.setText("");
            dayDateOfWithdrawCB.setSelectedItem(1);
            monthDateOfWithdrawCB.setSelectedItem("Jan");
            yearDateOfWithdrawCB.setSelectedItem(2000);
        }

        //Event Handeling of Clear Button for Credit Card
        if(e.getSource() == clearCCBtn){
            // Clear all text fields and combo boxes
            creditCardIDTF.setText("");
            creditClientNameTF.setText("");
            creditIssuerBankTF.setText("");
            creditBankAccountTF.setText("");
            creditBalanceAmountTF.setText("");
            creditCvcNumberTF.setText("");
            creditInterestRateTF.setText("");
            dayExpirationDateCB.setSelectedItem(1);
            monthExpirationDateCB.setSelectedItem("Jan");
            yearExpirationDateCB.setSelectedItem(2000);

            cardIDcreditLimitTF.setText("");
            creditLimitTF.setText("");
            gracePeriodTF.setText("");

            cardIDCreditCancelTF.setText("");
        }
    }

    public static void main(String[] args){
        //create obj of BankGUI
        BankGUI obj = new BankGUI();
    }
}
