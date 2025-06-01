package BaiTap1;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien nhanVien1 = new NhanVien();
        nhanVien1.setTenNhanVien("Linh");
        nhanVien1.setTuoiNhanVien(26);
        nhanVien1.setViTriCongTac("Kiểm thử phần mềm");
        nhanVien1.setGioiTinhNhanVien("Nữ");

        System.out.println("Tên: "+nhanVien1.getTenNhanVien());
        System.out.println("Tuổi: "+nhanVien1.getTuoiNhanVien());
        System.out.println("Vị trí: "+nhanVien1.getViTriCongTac());
        System.out.println("Giới tính: "+nhanVien1.getGioiTinhNhanVien());

        System.out.println(nhanVien1.toString());
    }
}
