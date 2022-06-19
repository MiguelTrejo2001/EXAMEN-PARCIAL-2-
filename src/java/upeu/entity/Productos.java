
package upeu.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author admin
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Productos {
    private int idproducto;
    private String nombre;
    private int precio;
    private String stock;
    private int estado;
    private int idcategoria;
}
