package BaiTap3.Common;

public class BaseTest {

    public void createDriver(){
        System.out.println("======= Create Driver");
        System.out.println("Browser: "+Constants.getBrowser());
        System.out.println("Report: "+Constants.isReport());
        System.out.println("Headless: "+Constants.isHeadless());
    }

    public void closeDriver(){
        System.out.println("======= Close Driver");
        System.out.println("Close browser: " + Constants.getBrowser());
    }

    public void closeDriver(String browser){ // đa hình
        System.out.println("======= Close Driver");
        System.out.println("Close browser: " + browser);
    }
}
