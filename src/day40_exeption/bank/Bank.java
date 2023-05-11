package day40_exeption.bank;

public class Bank {

        double balance;

        public void withdraw (double amountToTakeOut){
if (amountToTakeOut > balance){
    //System.out.println("Not enough balance ");
    throw new NotEnoughMoneyException();

}
        }
    public void login(String username, String password) throws Exception{
if (!username.equals("TomJarry")){
    throw new InvalidCredentialException("not valid username");
}
if (!password.equals("1234")){
    throw new InvalidCredentialException("Not valid password");
}


    }
}
