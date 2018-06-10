package pl.mmuller.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FruitServices {
    @Autowired
    private FruitRepository fruitRepository;

    public List<Fruit> getFruits(){
        List<Fruit> fruits = new ArrayList<>();
        fruitRepository.findAll().forEach(fruits::add);
        return fruits;
    }
}
