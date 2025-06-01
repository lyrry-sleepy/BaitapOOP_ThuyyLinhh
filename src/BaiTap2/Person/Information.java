package BaiTap2.Person;

public class Information {
    public static void main(String[] args) {
        Person ps1 = new Person("Linh",26,"Nữ","Hà Nội","0965481722");
        System.out.println("Tên: "+ps1.getName());
        System.out.println("Tuổi: "+ps1.getAge());
        System.out.println("Giới tính: "+ps1.getGender());
        System.out.println("Địa chỉ: "+ps1.getAddress());
        System.out.println("SĐT: "+ps1.getPhone());
    }
}
