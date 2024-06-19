package vascopanigi.u5_w1_d2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Pizza {
    private String name;
    private List<Topping> toppings;
    private double price;
    private int calories;
}
