package AppiumClasses;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Appium01 {

    @Test
    public void test() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

//  capabilities.setCapability("platformName","Android"); --> Bu şekilde de yazımı var
//  capabilities.setCapability(CapabilityType.PLATFORM_NAME,"Android"); --> Bu şekilde de yazımı var
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "RealDevice"); // Android de fark etmiyor böyle de yazılabilirveya cmd --> adb devices yazdığında gelen değeri de yazabilirsin
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\sdemi\\IdeaProjects\\mobileTesting\\src\\Apps\\Gesture Tool_1.3_Apkpure.apk");

        capabilities.setCapability("appPackage","com.davemac327.gesture.tool");
        capabilities.setCapability("appActivity","com.davemac327.gesture.tool.GestureBuilderActivity");

        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

        //capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        //        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        //        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "RealDevice"); // Android de fark etmiyor böyle de yazılabilirveya cmd --> adb devices yazdığında gelen değeri de yazabilirsin
        //        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        //        capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\sdemi\\IdeaProjects\\mobileTesting\\src\\Apps\\Gesture Tool_1.3_Apkpure.apk");
        //
        //        capabilities.setCapability("appPackage","com.davemac327.gesture.tool");
        //        capabilities.setCapability("appActivity","com.davemac327.gesture.tool.GestureBuilderActivity");
        //
        //        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

    }
}
