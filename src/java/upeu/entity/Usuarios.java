package upeu.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Usuarios {
    private int idusuario;
    private String username;
    private String password;
    private int estado;
    private int idrol;
    private int idempleado;
}
