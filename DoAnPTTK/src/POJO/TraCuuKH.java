/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;
/**
 *
 * @author vumin
 */
public class TraCuuKH {
    private String mahd, makh,manv, tenkh, trangthai, sdt;
    private int soluong, thanhtien;
    
    public TraCuuKH(String mahd, String manv , String tenkh, String trangthai,int soluong, int thanhtien, String sdt)
    {
        this.mahd = mahd;
        this.manv = manv;
        this.tenkh= tenkh;
        this.trangthai = trangthai;
        this.sdt = sdt;
        this.soluong = soluong;
        this.thanhtien = thanhtien;
    }


    
    public String getMahd()
    {
        return mahd;
    }
    
    public void setMahd(String mahd) {
        this.mahd = mahd;
    }
    
    public String getManv()
    {
        return manv;
    }
    
    public void setManv(String mahd) {
        this.manv = manv;
    }    
    
    public String getMakh()
    {
        return makh;
    }
    
    public void setMakh(String makh) {
        this.makh = makh;
    }
    
    
    
    public String getTenkh()
    {
        return tenkh;
    }
    
    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }
    
    
    
    
    public String getTrangthai()
    {
        return trangthai;
    }
    
    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }
    
    
    public String getSdt()
    {
        return sdt;
    }
    
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }      
    
    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }    
    
    public int getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(int thanhtien) {
        this.thanhtien = thanhtien;
    }
    
}
