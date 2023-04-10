package AppiumClasses;

import appium.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Appium09 extends BaseClass {

    @Test
    public void test() throws MalformedURLException, InterruptedException {
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//
//        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
//        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "RealDevice"); // Android de fark etmiyor böyle de yazılabilirveya cmd --> adb devices yazdığında gelen değeri de yazabilirsin
//        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
//        capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\sdemi\\IdeaProjects\\mobileTesting\\src\\Apps\\API Demos for Android_1.9.0_Apkpure.apk");
//
////        capabilities.setCapability("appPackage","com.davemac327.gesture.tool");
////        capabilities.setCapability("appActivity","com.davemac327.gesture.tool.GestureBuilderActivity");
//
//        capabilities.setCapability("noReset",true);// Eğer aplikasyonun izinler atlayarak ana sayfada açılmasını istiyorsak kullanılır
//
//        AndroidDriver<MobileElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

        AndroidDriver driver = getAndroidDriver();
        //API Demos seçeneğine tıkla
        driver.findElementByXPath("(//*[@class='android.widget.TextView'])[3]").click();
        Thread.sleep(2000);
        //Preference butonuna tıkla
        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        Thread.sleep(2000);
        //Preference Dependencies butonuna tıkla
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        Thread.sleep(2000);
        //Check box butonuna tıkla
        String checkBoxKontrol = driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"android:id/checkbox\").checkable(true)").getAttribute("checked");
        MobileElement checkBox = (MobileElement) driver.findElementById("android:id/checkbox");
        if (checkBoxKontrol.equals("false")){
            checkBox.click();
        }

//        if (!checkBox.isSelected()) { neden olmadığı anlamadım????
//            checkBox.click();
//        }
        Thread.sleep(2000);
        //WiFi settings butonuna tıkla
        driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();
        Thread.sleep(3000);
        //Text penceresinin açıldığını doğrula
        Assert.assertTrue(driver.findElementById("android:id/alertTitle").isDisplayed());
        Thread.sleep(3000);
        //Text yazdır
        driver.findElementById("android:id/edit").sendKeys("TextAppium");
        //ok butonuna tıkla
        driver.findElementById("android:id/button1").click();
        Thread.sleep(10000);
        //session kapat
        driver.closeApp();


    }
}
