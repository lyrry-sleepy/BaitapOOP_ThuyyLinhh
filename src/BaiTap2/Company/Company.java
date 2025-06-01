package BaiTap2.Company;

import BaiTap2.Person.Person;

public class Company {
    public static void main(String[] args) {
        Person ps2 = new Person("Linh",26,"Nữ","Hà Nội","0965481722");
        System.out.println("Tên: "+ps2.getName());
        System.out.println("Tuổi: "+ps2.getAge());
        System.out.println("Giới tính: "+ps2.getGender());
//        System.out.println("Địa chỉ: "+ps2.getAddress()); -- default func cannot be access in other package
//        System.out.println("SĐT: "+ps2.getPhone()); -- default func cannot be access in other package
    }
}
