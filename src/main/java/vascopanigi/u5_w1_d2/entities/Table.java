package vascopanigi.u5_w1_d2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Table {
    private int tableNumber;
    private int maxSeats;
    private double coverPrice;
    private boolean isBusy;

}
