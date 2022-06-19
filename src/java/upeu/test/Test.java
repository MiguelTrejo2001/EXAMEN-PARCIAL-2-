/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package upeu.test;

import com.google.gson.Gson;
import upeu.config.Conexion;
import upeu.dao.ClienteDAO;
import upeu.daoImpl.ClientesDAOImpl;

/**
 *
 * @author admin
 */
public class Test {

    static Gson g = new Gson();

    static Gson gson = new Gson();
    static ClienteDAO clienteDao = new ClientesDAOImpl();
    public static void main(String[] args) {
    System.out.println(gson.toJson(clienteDao.readAll()));

        if (Conexion.getConexion() != null) {
            System.out.println("si");
        } else {
            System.out.println("no");
        }
    }
}
