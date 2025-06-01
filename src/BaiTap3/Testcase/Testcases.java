package BaiTap3.Testcase;

import BaiTap3.Common.BaseTest;

public class Testcases extends BaseTest {
    public void login(){
        Testcases tc1 = new Testcases();
        System.out.println("Step 1: Create Driver");
        tc1.createDriver();
    }

    public void addCategory(){
        Testcases tc1 = new Testcases();
        System.out.println("Step 1: Close Driver");
        tc1.closeDriver();
    }

    public static void main(String[] args) {
        Testcases tc = new Testcases();
        tc.createDriver();
        tc.closeDriver();
    }
}
