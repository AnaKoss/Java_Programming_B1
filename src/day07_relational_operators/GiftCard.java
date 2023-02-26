package day07_relational_operators;

public class GiftCard {
    public static void main(String[] args) {

        //declare & assign a gift card with 300;
        // buy 2 items
        //buy item1 for $50;
        //buy item2 for $100;
        //print out the remaining

        double giftCard = 300;
        String item1 = "Dior";
        String item2 = "LV";
//giftCard = giftCard -50;

giftCard-=50;
        System.out.println ("I have gift $"+ giftCard + " worth of gift card." );
        System.out.println("After buying " + item1 + ", I have left " +  giftCard  + " amount in gift card");
        giftCard-=100;
        System.out.println("After buying " + item2 + ", I have left " +  giftCard  + " amount in gift card");
//multiply gift card balance by 2

        giftCard*=2;

        System.out.println(" Now I have a new balance of $" + giftCard);


    }
}
