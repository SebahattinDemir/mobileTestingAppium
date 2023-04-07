package appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {

    @Test
    public AndroidDriver getAndroidDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "RealDevice"); // Android de fark etmiyor böyle de yazılabilirveya cmd --> adb devices yazdığında gelen değeri de yazabilirsin
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\sdemi\\IdeaProjects\\mobileTesting\\src\\Apps\\API Demos for Android_1.9.0_Apkpure.apk");
        capabilities.setCapability("noReset", true);// Eğer aplikasyonun izinler atlayarak ana sayfada açılmasını istiyorsak kullanılır

        AndroidDriver<MobileElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        return driver;
        //DesiredCapabilities capabilities = new DesiredCapabilities();
        //
        //        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        //        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        //        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "RealDevice"); // Android de fark etmiyor böyle de yazılabilirveya cmd --> adb devices yazdığında gelen değeri de yazabilirsin
        //        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        //        capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\sdemi\\IdeaProjects\\mobileTesting\\src\\Apps\\API Demos for Android_1.9.0_Apkpure.apk");
        //        capabilities.setCapability("noReset", true);// Eğer aplikasyonun izinler atlayarak ana sayfada açılmasını istiyorsak kullanılır
        //
        //        AndroidDriver<MobileElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        //        return driver;
    }
}
