/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import POJO.TraCuuKH;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author vumin
 */
public class TraCuuKHDAO {
    public static ArrayList<TraCuuKH> getDSKH(String makh)
    {
        ArrayList<TraCuuKH> dskq = new ArrayList<TraCuuKH>();
        try {
            String sql = "select b.MAHOADON, b.MANV,k.TENKH,k.SDT,b.SOLUONG,b.THANHTIEN,b.TRANGTHAI\n" +
                            "from BANVE b, KHACHHANG k\n" +
                            "where k.MAKH = k.MAKH and k.MAKH = '"+makh+"'";
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next()){
                TraCuuKH kq = new TraCuuKH(rs.getString("MAHOADON").trim(), rs.getString("MANV").trim(),rs.getString("TENKH").trim(),rs.getString("SDT").trim(), rs.getInt("SOLUONG"),rs.getInt("THANHTIEN"),rs.getString("TRANGTHAI").trim());
                dskq.add(kq);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Lỗi không thể lấy dữ liệu");
        }
        return dskq;
    }
}
