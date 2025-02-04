package tavolo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tavolo {

    private int numeroTavolo;
    private int numeroPosti;
    private StatoTavolo statoTavolo;
}
