package pl.mmuller.spring.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/fruit")
public class FruitController {
    private static List<Fruit> fruits = initializeFruits();
    private static List<Fruit> initializeFruits(){
        if(fruits==null) {
            fruits = new ArrayList<>();
            fruits.add(new Fruit("orange", "spherical", "orange"));
            fruits.add(new Fruit("grey", "oval", "cantaloupe"));
        }
        return fruits;
    }

    @GetMapping
    public String getFruits(Model model){
        fruits.add(new Fruit("red","spherical","apple"));

        model.addAttribute("fruits",fruits);
        return "fruits";
    }
}