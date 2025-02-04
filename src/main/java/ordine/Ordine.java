package ordine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import menu.Menu;
import tavolo.Tavolo;

import java.time.LocalTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ordine {
    private int idOrdine;
    private StatoOrdine statoOrdine;
    private int numeroPosti;
  private LocalTime orario;
    private double prezzo;
    private Tavolo tavolo;
    private List<Menu> menu;

}
