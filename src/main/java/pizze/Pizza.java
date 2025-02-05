package pizze;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import menu.ElementoMenu;
import topping.Toppings;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pizza implements ElementoMenu {
    private String name;
    private double price;
    private double calories;
   private List<Toppings> toppings;


    @Override
    public String getNome() {
        return "";
    }
}
