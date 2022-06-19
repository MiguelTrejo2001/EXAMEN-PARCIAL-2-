/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import upeu.config.Conexion;
import upeu.dao.SucursalDAO;
import upeu.entity.Sucursales;

/**
 *
 * @author alarc
 */
public class SucursalesDAOImpl implements SucursalDAO{
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    @Override
    public int create(Sucursales sucursales) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int update(Sucursales sucursales) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int delete(int idsucursal) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Sucursales read(int idsucursal) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public List<Sucursales> readAll() {  
        String SQL = "SELECT * FROM sucursales";
        List<Sucursales> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Sucursales s = new Sucursales();
                s.setIdsucursal(rs.getInt("idsucursal"));
                s.setNombre(rs.getString("nombre"));
                s.setDireccion(rs.getString("direccion"));
                s.setEstado(rs.getInt("estado"));

                lista.add(s);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return lista;
    }
}
    

