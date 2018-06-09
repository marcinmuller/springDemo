package pl.mmuller.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    private FruitServices fruitServices;

    @Autowired
    public ApiController(FruitServices fruitServices){
        this.fruitServices=fruitServices;
    }
    @GetMapping("/fruits")
    public List<Fruit> getFruits(){
        return fruitServices.getFruits();
    }
}