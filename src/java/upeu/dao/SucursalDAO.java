package upeu.dao;

import java.util.List;
import upeu.entity.Sucursales;

public interface SucursalDAO  {
      int create(Sucursales sucursales);
    int update(Sucursales sucursales);
    int delete(int idsucursal);
    Sucursales read(int idsucursal);
    List<Sucursales> readAll();
}
