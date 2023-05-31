/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

/**
 *
 * @author tuann
 */
public class Phim {
    String maphim, tenphim, mota, theloai;

    public Phim(String maphim, String tenphim, String mota, String theloai) {
        this.maphim = maphim;
        this.tenphim = tenphim;
        this.mota = mota;
        this.theloai=theloai;
    }

    public String getMaphim() {
        return maphim;
    }

    public void setMaphim(String maphim) {
        this.maphim = maphim;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }   

    public String getMatl() {
        return theloai;
    }

    public void setMatl(String theloai) {
        this.theloai = theloai;
    }

    public String getTenphim() {
        return tenphim;
    }

    public void setTenphim(String tenphim) {
        this.tenphim = tenphim;
    }
    
}
