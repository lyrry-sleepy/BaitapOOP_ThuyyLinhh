package BaiTap1;

public class NhanVien {
    private String tenNhanVien;
    private int tuoiNhanVien;
    private String gioiTinhNhanVien;
    private String viTriCongTac;


    public NhanVien(String tenNhanVien, int tuoiNhanVien, String gioiTinhNhanVien, String viTriCongTac) {
        this.tenNhanVien = tenNhanVien;
        this.tuoiNhanVien = tuoiNhanVien;
        this.gioiTinhNhanVien = gioiTinhNhanVien;
        this.viTriCongTac = viTriCongTac;
    }

    public NhanVien() {

    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public int getTuoiNhanVien() {
        return tuoiNhanVien;
    }

    public void setTuoiNhanVien(int tuoiNhanVien) {
        this.tuoiNhanVien = tuoiNhanVien;
    }

    public String getGioiTinhNhanVien() {
        return gioiTinhNhanVien;
    }

    public void setGioiTinhNhanVien(String gioiTinhNhanVien) {
        this.gioiTinhNhanVien = gioiTinhNhanVien;
    }

    public String getViTriCongTac() {
        return viTriCongTac;
    }

    public void setViTriCongTac(String viTriCongTac) {
        this.viTriCongTac = viTriCongTac;
    }

    public void showInfoNhanVien(){
        System.out.println("Tên: "+tenNhanVien);
        System.out.println("Tuổi: "+tuoiNhanVien);
        System.out.println("Vị trí: "+viTriCongTac);
        System.out.println("Giới tính: "+gioiTinhNhanVien);
    }
}
