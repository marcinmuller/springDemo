package pl.mmuller.clr.clr;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class FruitClr implements CommandLineRunner {

    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public void run(String... args) throws Exception {
        String url="http://localhost:8080/api/fruits";
        Fruit[] fruitArray=restTemplate.getForObject(url, Fruit[].class);
        List<Fruit> fruits=Arrays.asList(fruitArray);
        fruits.forEach(System.out::println);
    }
}