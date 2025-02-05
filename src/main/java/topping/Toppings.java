package topping;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import menu.ElementoMenu;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Toppings implements ElementoMenu {
    private String name;
    private double price;
    private double calories;

    @Override
    public String getNome() {
        return "";
    }
}
