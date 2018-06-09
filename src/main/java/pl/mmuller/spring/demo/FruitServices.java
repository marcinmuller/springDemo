package pl.mmuller.spring.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FruitServices {
    private static List<Fruit> fruits = initializeFruits();
    private static List<Fruit> initializeFruits(){
        if(fruits==null) {
            fruits = new ArrayList<>();
            fruits.add(new Fruit("orange", "spherical", "orange"));
            fruits.add(new Fruit("grey", "oval", "cantaloupe"));
        }
        return fruits;
    }

    public List<Fruit> getFruits(){
        return fruits;
    }
}
