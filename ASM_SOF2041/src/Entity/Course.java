
package Entity;

/**
 *
 * @author Nguyen Truc
 */
public class Course {
    private int makh;
    private String macd;
    private float hocphi;
    private int thoiluong;
    private String ngaykhaigiang;
    private String ghichu;
    private String manv;
    private String ngaytao;

    public Course() {
    }

    public Course(int makh, String macd, float hocphi, int thoiluong, String ngaykhaigiang, String ghichu, String manv, String ngaytao) {
        this.makh = makh;
        this.macd = macd;
        this.hocphi = hocphi;
        this.thoiluong = thoiluong;
        this.ngaykhaigiang = ngaykhaigiang;
        this.ghichu = ghichu;
        this.manv = manv;
        this.ngaytao = ngaytao;
    }

    

    public int getMakh() {
        return makh;
    }

    public void setMakh(int makh) {
        this.makh = makh;
    }

    public String getMacd() {
        return macd;
    }

    public void setMacd(String macd) {
        this.macd = macd;
    }

    public float getHocphi() {
        return hocphi;
    }

    public void setHocphi(float hocphi) {
        this.hocphi = hocphi;
    }

    public int getThoiluong() {
        return thoiluong;
    }

    public void setThoiluong(int thoiluong) {
        this.thoiluong = thoiluong;
    }

    public String getNgaykhaigiang() {
        return ngaykhaigiang;
    }

    public void setNgaykhaigiang(String ngaykhaigiang) {
        this.ngaykhaigiang = ngaykhaigiang;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(String ngaytao) {
        this.ngaytao = ngaytao;
    }


    
    
    
}
