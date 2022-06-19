package upeu.dao;

import java.util.List;
import upeu.entity.TablaListars;

public interface TablaListarDAO {
    int create(TablaListars tablaListars);
    int update(TablaListars tablaListars);
    int delete(int idventa);
    TablaListars read(int idventa);
    List<TablaListars> readAll();
}
