package ordine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import menu.Menu;
import tavolo.Tavolo;


import java.time.LocalDateTime;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ordine {
    private int idOrdine;
    private StatoOrdine statoOrdine;
    private int numeroPosti;
  private LocalDateTime oraAcquisizione;
    private double prezzo;
    private Tavolo tavolo;
    private List<Menu> menu;

}
