package upeu.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import upeu.config.Conexion;
import upeu.entity.Vendedores;
import upeu.dao.VendedorDAO;

public class VendedoresDAOImpl implements VendedorDAO{

    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;

    @Override
    public int create(Vendedores vendedores) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int update(Vendedores vendedores) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int delete(int idvendedor) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Vendedores read(int idvendedor) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public List<Vendedores> readAll() {
        String SQL = "Select *from vendedor";
        List<Vendedores> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Vendedores n = new Vendedores();
                n.setIdvendedor(rs.getInt("idvendedor"));
                n.setIdpersona(rs.getInt("idpersona"));
                n.setNombre(rs.getString("nombre"));

                lista.add(n);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return lista;
    }

}

