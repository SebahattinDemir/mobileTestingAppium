package AppiumClasses;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Appium04 {

    @Test
    public void test() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "RealDevice"); // Android de fark etmiyor böyle de yazılabilirveya cmd --> adb devices yazdığında gelen değeri de yazabilirsin
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\sdemi\\Downloads\\Calculator Vault_1.3.4_Apkpure.apk");
        capabilities.setCapability("noReset",true);

        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        MobileElement num0 = driver.findElementByXPath("//android.widget.Button[@text='0']");
        MobileElement num1 = driver.findElementByXPath("//android.widget.Button[@text='1']");
        MobileElement num2 = driver.findElementByXPath("//android.widget.Button[@text='2']");
        MobileElement num3 = driver.findElementByXPath("//android.widget.Button[@text='3']");
        MobileElement num4 = driver.findElementByXPath("//android.widget.Button[@text='4']");
        MobileElement num5 = driver.findElementByXPath("//android.widget.Button[@text='5']");
        MobileElement num6 = driver.findElementByXPath("//android.widget.Button[@text='6']");
        MobileElement num7 = driver.findElementByXPath("//android.widget.Button[@text='7']");
        MobileElement num8 = driver.findElementByXPath("//android.widget.Button[@text='8']");
        MobileElement num9 = driver.findElementByXPath("//android.widget.Button[@text='9']");
        MobileElement nokta = driver.findElementByXPath("//android.widget.Button[@text='.']");

        MobileElement plus = driver.findElementByAccessibilityId("plus");
        MobileElement minus = driver.findElementByAccessibilityId("minus");
        MobileElement times = driver.findElementByAccessibilityId("times");
        MobileElement divide = driver.findElementByAccessibilityId("divide");
        MobileElement delete = driver.findElementByAccessibilityId("delete");
        MobileElement equals = driver.findElementByAccessibilityId("equals");

        //64+71 sonucunu test edelim
        num6.click();
        num4.click();
        plus.click();
        num7.click();
        num1.click();

        MobileElement preResult = driver.findElementByXPath("(//*[@class='android.widget.EditText'])[2]");
        System.out.println("preResult = " + preResult);
        String preResultText = preResult.getText();

        equals.click();

        MobileElement result = driver.findElementByXPath("(//*[@class='android.widget.EditText'])[1]");
        System.out.println("result = " + result);

        Assert.assertEquals(result.getText(),preResultText);
    }
}
