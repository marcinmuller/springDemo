package pl.mmuller.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fruit")
public class FruitController {
    private FruitServices fruitServices;

    @Autowired
    public FruitController(FruitServices fruitServices){
        this.fruitServices=fruitServices;
    }

    @GetMapping
    public String getFruits(Model model){
        fruitServices.getFruits().add(new Fruit("red","spherical","apple"));

        model.addAttribute("fruits",fruitServices.getFruits());
        return "fruits";
    }
}