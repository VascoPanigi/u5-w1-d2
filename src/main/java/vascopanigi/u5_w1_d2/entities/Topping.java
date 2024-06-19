package vascopanigi.u5_w1_d2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Topping {
    private String name;
    private double price;
    private int calories;
}
