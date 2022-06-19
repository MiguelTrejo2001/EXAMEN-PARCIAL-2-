
package upeu.dao;
import java.util.List;
import upeu.entity.Vendedores;

public interface VendedorDAO {
    int create(Vendedores vendedores);
    int update(Vendedores vendedores);
    int delete(int idvendedor);
    Vendedores read(int idvendedor);
    List<Vendedores> readAll();
}
