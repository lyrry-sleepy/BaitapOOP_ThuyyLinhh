package BaiTap1;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien nhanVien1 = new NhanVien();
        nhanVien1.setTenNhanVien("Linh");
        nhanVien1.setTuoiNhanVien(26);
        nhanVien1.setViTriCongTac("Kiểm thử phần mềm");
        nhanVien1.setGioiTinhNhanVien("Nữ");

        NhanVien nhanVien2 = new NhanVien();
        nhanVien2.setTenNhanVien("Bún");
        nhanVien2.setTuoiNhanVien(3);
        nhanVien2.setViTriCongTac("Kiểm thử phần mềm");
        nhanVien2.setGioiTinhNhanVien("Nam");

        nhanVien1.showInfoNhanVien();
        nhanVien2.showInfoNhanVien();

    }
}
