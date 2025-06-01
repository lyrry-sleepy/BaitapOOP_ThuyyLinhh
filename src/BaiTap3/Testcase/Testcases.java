package BaiTap3.Testcase;

import BaiTap3.Common.BaseTest;

public class Testcases extends BaseTest {
    public void login(){
        Testcases tc1 = new Testcases();
        tc1.createDriver();
        System.out.println("Step 1: Enter username");
        System.out.println("Step 2: Enter password");
        System.out.println("Step 3: Click button login");
        tc1.closeDriver();
    }

    public void addCategory(){
        Testcases tc1 = new Testcases();
        tc1.createDriver();
        System.out.println("Step 1: Click button (+)");
        System.out.println("Step 2: Enter category name");
        System.out.println("Step 3: Enter category description");
        System.out.println("Step 4: Click button Create category");
        tc1.closeDriver();
    }

    public static void main(String[] args) {
        Testcases tc = new Testcases();
        tc.login();
        tc.addCategory();
    }
}
