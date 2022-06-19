package upeu.dao;

import java.util.List;
import upeu.entity.Clientes;

public interface ClienteDAO {
    int create(Clientes clientes);
    int update(Clientes clientes);
    int delete(int idcliente);
    Clientes read(int idcliente);
    List<Clientes> readAll();
}
