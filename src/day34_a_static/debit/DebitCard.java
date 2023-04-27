package day34_a_static.debit;

public class DebitCard {
    //data: cardNum, holderName, cardType, pin, balance
    long cardNum;
    String holderName;
    String cardType;
    int pin;
    double balance;
    //have a data of account type that is the same for all users

    static String accountType;

    //have a message saying "Static block is running" and initialize your static data to be "Checking"
    /*static  { // static block
        String accountType="Checking"; // local variable ??this a new variable
    }
     */
    static {
        System.out.println("Static block is running");
        accountType = "checking";
    }
    //create a constructor that accepts 3 argument: cardName, holdName, balance


    public DebitCard(long cardNum, String holderName, String cardType) {

        this.holderName = holderName;
        //this.cardType = cardType;
        if (cardType.equalsIgnoreCase("Master")) {
            this.cardType = cardType;
        } else {
            System.out.println("Invalid card type");
        }
        //this.cardNumber = cardNumber;  // it will be 16 numbers
        if ((cardNum + "").length() == 16) {   // if(String.valueOf(curdNumber).length() == 16)
            this.cardNum = cardNum;
        } else {
            System.out.println("The length is not not correct");
        }
    }


    //create a constructor that accepts 5 arg: cardNumb, holdName, balance, pin, cardType
    // assign if length of pin is 4
    // assign if cardType is ONLY master/MASTER/Master
    public DebitCard(long cardNum, String holderName, double balance, String cardType, int pin) {
        this(cardNum, holderName, cardType);
        int numPin = String.valueOf(pin).length();

        if (numPin == 4) {
            this.pin = pin;

        } else {
            System.out.println("Invalid pin length");
        }

    }

}
