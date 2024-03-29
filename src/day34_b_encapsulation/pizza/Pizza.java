package day34_b_encapsulation.pizza;

public class Pizza {
    //private date: size, numOfToppings
  private String size;
  private int numOfToppings;


    //constructor: accepts 2 arg
    //if size is (small, medium, large)
    //if numOfTopics >0
    public Pizza(String size, int numOfToppings){

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("medium") ||
                size.equalsIgnoreCase("small")||
                size.equalsIgnoreCase("large")) {
            this.size = size;
        }else{
            System.out.println("not correct size");
        }
    }

    public int getNumOfToppings() {
        return numOfToppings;
    }

    public void setNumOfToppings(int numOfToppings) {
        if (numOfToppings>0){
            this.numOfToppings = numOfToppings;
        }else {
            System.out.println("the number can not be less then 0");
    }
    }
    // make a method to calculatePrice
    //if small = $10
    //if medium = $12
    //if large = $14
    //each tipping = $0.5

    public double calculatePrice(){
        double price = 0;
        if(size.equalsIgnoreCase("small")){
            price = 10 + (numOfToppings *0.5);
        }else if (size.equalsIgnoreCase("medium")){
            price = 12 + (numOfToppings* 0.5);
        }else if (size.equalsIgnoreCase("Large")){
            price = 14 + (numOfToppings * 0.5);
        }
        return price;
    }


    public String toString(){
        return "Pizza size: " + size + ", number of toppings " + numOfToppings + ". Total price $" + calculatePrice();
    }

    }

