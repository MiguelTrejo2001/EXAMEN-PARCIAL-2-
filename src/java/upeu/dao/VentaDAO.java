/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.dao;

import java.util.List;
import upeu.entity.Ventas;

/**
 *
 * @author alarc
 */
public interface VentaDAO {
    int create(Ventas ventas);
    int update(Ventas ventas);
    int delete(int idventa);
    Ventas read(int idventa);
    List<Ventas> readAll();
}
