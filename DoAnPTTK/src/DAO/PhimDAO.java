/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import POJO.Phim;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class PhimDAO {
    
    public static ArrayList<Phim> getListPhim(String ten){
        ArrayList<Phim> listPhim = new ArrayList<>();
        String sql="SELECT * FROM PHIM WHERE TENPHIM LIKE'%"+ten+"%'";
        try{
            ConnectionDB cnt = new ConnectionDB();
            cnt.getCn();
            ResultSet rs = cnt.executeQuery(sql);
            while(rs.next()){
                String maphim = rs.getString("MAPHIM");
                String tenphim=rs.getString("TENPHIM");
                String mota=rs.getString("MOTAPHIM");
                String tl=rs.getString("THELOAI");
                Phim ph= new Phim(maphim, tenphim, mota, tl);
                listPhim.add(ph);
            }
            cnt.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Không thể lấy dữ liệu!");
        }
        return listPhim;
    }
    
    public void them_phim(String ma, String ten, String mota, String tl){      
        String insert= "INSERT INTO PHIM(MAPHIM, TENPHIM, MOTAPHIM, THELOAI) VALUES('"+ma+"','"+ten+"','"+mota+"','"+tl+"')";
        ConnectionDB cnt= new ConnectionDB();
        int result = cnt.executeUpdate(insert);
        if(result==1){
            JOptionPane.showMessageDialog(null, "Thêm phim thành công!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Thêm phim thất bại!");
        }   
        cnt.close();
    }
    
    public void cap_nhat_phim(String ma, String ten, String mota, String tl){
        String update="UPDATE PHIM SET TENPHIM='"+ten+"',MOTAPHIM='"+mota+"',THELOAI='"+tl+"' WHERE MAPHIM='"+ma+"'";
        ConnectionDB cnt= new ConnectionDB();
        int result = cnt.executeUpdate(update);
        if(result==1){
            JOptionPane.showMessageDialog(null, "Cập nhật phim thành công!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Cập nhật phim thất bại!");
        } 
        cnt.close();
    }
    
    public void xoa_phim(String ma){
        String delete="DELETE FROM PHIM WHERE MAPHIM='"+ma+"'";
        ConnectionDB cnt= new ConnectionDB();
        int result = cnt.executeUpdate(delete);
        if(result==1){
            JOptionPane.showMessageDialog(null, "Xóa phim thành công!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Xóa phim thất bại!");
        } 
        cnt.close();
    }
    
    
    
}
