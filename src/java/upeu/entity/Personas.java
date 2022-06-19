
package upeu.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Personas {
    private int idpersona;
    private String nombres;
    private String apellidos;
    private String dni;
    private String telefono;
    
}
