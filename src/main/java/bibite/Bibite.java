package bibite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bibite {
    private String name;

    private double price;

    private double calories;

    public String getNome() {
        return "";
    }

}
