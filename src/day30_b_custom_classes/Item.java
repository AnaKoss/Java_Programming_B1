package day30_b_custom_classes;
/*
have instance variable called name and price
 */
public class Item {

String name;
double price;

    @Override
    public String toString() {
        return "Name='" + name + '\'' +
                "\nPrice= " + price;
    }
}
