package day40_exeption.bank;

public class UserAccount {
    public static void main(String[] args) {

        Bank accountOne = new Bank();
        accountOne.balance = 1000;


        //accountOne.withdraw(9000);
        System.out.println("_______");
try {
    accountOne.login("Test", "1234");
}catch(InvalidCredentialException e) {
    System.out.println(e.getMessage());
}catch (Exception e){
}

        System.out.println("End");


    }
}
