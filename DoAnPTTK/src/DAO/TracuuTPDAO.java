/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.TraCuuTP;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author vumin
 */
public class TracuuTPDAO {
    public static ArrayList<TraCuuTP> getDSTP()
    {
        ArrayList<TraCuuTP> dskq = new ArrayList<TraCuuTP>();
        try {
            String sql = "select TENPHIM\n" +
                                "from PHIM";
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next()){
                TraCuuTP kq = new TraCuuTP(rs.getString("TENPHIM").trim());
                dskq.add(kq);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Lỗi không thể lấy dữ liệu");
        }
        return dskq;
    }
}
