package day21_arrays;

public class Store {
    public static void main(String[] args) {
        // we looking for Hat item
        String [] items = { "Shoes", "Jacket", "Gloves", "Dress", "Hat","Sunglasses" };
boolean hasHat = false;

        for (int i = 0; i < items.length ; i++) {
            if (items[i].equalsIgnoreCase("hat")){
                hasHat =true;
                break;
            }
        }
        if (hasHat){
            System.out.println("Hat item is available.");
        } else {
            System.out.println("Hat is out of stock.");
        }
        System.out.println(hasHat? "Hat item is available." : "hat is out of stock");




    }
}
