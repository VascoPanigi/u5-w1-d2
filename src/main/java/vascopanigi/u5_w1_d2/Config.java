package vascopanigi.u5_w1_d2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import vascopanigi.u5_w1_d2.entities.Drink;
import vascopanigi.u5_w1_d2.entities.Menu;
import vascopanigi.u5_w1_d2.entities.Pizza;
import vascopanigi.u5_w1_d2.entities.Topping;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("application.properties")
public class Config {

    @Bean(name = "cheese")
    public Topping getCheese() {
        return new Topping("cheese", 1.00, 150);
    }

    @Bean(name = "tomato")
    public Topping getTomato() {
        return new Topping("tomato", 1.00, 50);
    }

    @Bean(name = "pineapple")
    public Topping getPineapple() {
        return new Topping("pineapple", 30.00, 200);
    }

    @Bean(name = "pepperoni")
    public Topping getPepperoni() {
        return new Topping("pepperoni", 2.50, 300);
    }

    @Bean(name = "ham")
    public Topping getHam() {
        return new Topping("ham", 2.00, 250);
    }

    @Bean(name = "hawaiian_pizza")
    public Pizza getHawaiianPizza() {
        return new Pizza("hawaiian", Arrays.asList(getPineapple(), getCheese()), 10.99, 1500);
    }

    @Bean(name = "pepperoni_pizza")
    public Pizza getPepperoniPizza() {
        return new Pizza("pepperoni", Arrays.asList(getPepperoni(), getCheese()), 12.99, 2000);
    }

    @Bean(name = "hawaiian")
    public Pizza getClassicPizza() {
        return new Pizza("hawaiian", Arrays.asList(getCheese(), getTomato()), 8.99, 1500);
    }

    @Bean(name = "water")
    public Drink getWater() {
        return new Drink("water", 1.50, 50);
    }

    @Bean(name = "cola")
    public Drink getCola() {
        return new Drink("cola", 3.50, 300);
    }

    @Bean
    public Menu menu() {
        List<Pizza> pizzas = Arrays.asList(getClassicPizza(), getHawaiianPizza(), getPepperoniPizza());
        List<Topping> toppings = Arrays.asList(getPineapple(), getPepperoni(), getHam(), getCheese());
        List<Drink> drinks = Arrays.asList(getCola(), getWater());
        return new Menu(pizzas, toppings, drinks);
    }
}
