package upeu.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import upeu.config.Conexion;
import upeu.entity.TablaListars;
import upeu.dao.TablaListarDAO;

public class TablaListarDAOImpl implements TablaListarDAO{
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    
    @Override
    public int create(TablaListars tablaListars) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    @Override
    public int update(TablaListars tablaListars) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int delete(int idventa) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public TablaListars read(int idventa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<TablaListars> readAll() {
        
        String SQL = "SELECT ventas.idventa AS \"id\", sucursales.direccion AS \"sucursal\",vendedor.nombre AS \"vendedor\",personas.nombres AS \"cliente\",ventas.fecha AS \"fecha\" FROM ventas,sucursales,personas,vendedor ORDER BY 1";
        List<TablaListars> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                TablaListars v = new TablaListars();
                v.setIdventa(rs.getInt("id"));
                v.setSucursal(rs.getString("sucursal"));
                v.setVendedor(rs.getString("vendedor"));
                v.setCliente(rs.getString("cliente"));
                v.setFecha(rs.getString("fecha"));

                lista.add(v);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return lista;
    }
}
    

