package day40_exeption.bank;

public class NotEnoughMoneyException extends RuntimeException{

  public NotEnoughMoneyException(String msg){
      super(msg);
  }


//This is
    public NotEnoughMoneyException(){
        super("Not enough money");
    }
}
