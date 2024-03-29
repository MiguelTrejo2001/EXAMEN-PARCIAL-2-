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
import upeu.entity.Ventas;
import upeu.dao.VentaDAO;

/**
 *
 * @author alarc
 */
public class VentasDAOImpl implements VentaDAO {

    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;

    @Override
    public int create(Ventas ventas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int update(Ventas ventas) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int delete(int idventas) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Ventas read(int idventas) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public List<Ventas> readAll() {
        String SQL = "Select *from ventas";
        List<Ventas> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Ventas v = new Ventas();
                v.setIdventa(rs.getInt("idventa"));
                v.setFecha(rs.getString("fecha"));
                v.setIdusuario(rs.getInt("idusuario"));
                v.setIdcliente(rs.getInt("idcliente"));
                v.setIdsucursal(rs.getInt("idsucursal"));

                lista.add(v);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return lista;
    }

}
