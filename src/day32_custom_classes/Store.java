package day32_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Store {

/*
    Create a separate class to create and test the Food objects

    try making an array of Food objects
    find all the Food objects that start with 'a'
    find all the Food objects that have a total price over 20
*/
public static void main(String[] args) {

    Food food1 = new Food("Apple");
    Food food2 = new Food("Grape", 4);
    Food food3 = new Food("Banana", 5, 2.99);


    // if we want to add it to array
    Food[] foodArr = {food1, food2, food3};

    ArrayList<Food> foodList = new ArrayList();

    foodList.addAll(Arrays.asList(foodArr));

    for (int i = 0; i < foodList.size(); i++) {

        if (     (foodList.get(i).name.charAt(0)+"").equalsIgnoreCase("a")    ) {
            System.out.println(foodList.get(i));
        }

    }



}


}




