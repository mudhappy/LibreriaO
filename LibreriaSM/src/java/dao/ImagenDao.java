/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import db.AccesoDB;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ImagenBean;

/**
 *
 * @author Windows7
 */
public class ImagenDao {
    public List<ImagenBean> listar() throws SQLException {
        Connection cn = null;
        List<ImagenBean> lista = new ArrayList<ImagenBean>();

        cn = AccesoDB.getConnection();
        String sql = "SELECT * FROM IMAGEN";
        CallableStatement cstm = cn.prepareCall(sql);
        ResultSet rs = cstm.executeQuery();
        while (rs.next()) {
            ImagenBean t = new ImagenBean();
            t.setIdima(rs.getInt("idima"));
            t.setNombre(rs.getString("nombre"));

            lista.add(t);
        }
        cstm.close();

        return lista;
    }
}
