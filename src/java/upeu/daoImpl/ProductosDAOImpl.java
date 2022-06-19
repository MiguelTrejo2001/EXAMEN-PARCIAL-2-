
package upeu.daoImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import upeu.config.Conexion;
import upeu.entity.Productos;
import upeu.dao.ProductoDAO;

public class ProductosDAOImpl implements ProductoDAO{
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    
    @Override
    public int create(Productos productos) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int update(Productos productos) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int delete(int idproducto) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Productos read(int idproducto) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public List<Productos> readAll() {
        String SQL = "Select * from productos";
        List<Productos> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Productos p = new Productos();
                p.setIdproducto(rs.getInt("idproducto"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getInt("precio"));
                p.setStock(rs.getString("stock"));
                p.setEstado(rs.getInt("estado"));
                p.setIdcategoria(rs.getInt("idcategoria"));
           
                lista.add(p);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return lista;
    }   
}

