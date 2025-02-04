package menu;

import bibite.Bibite;
import lombok.AllArgsConstructor;
import lombok.Data;
import pizze.Pizza;
import topping.Toppings;

import java.util.List;

@Data
@AllArgsConstructor
public class Menu {
    private List<Pizza> pizze;
    private List<Bibite> bibite;
    private List<Toppings> toppings;
}
