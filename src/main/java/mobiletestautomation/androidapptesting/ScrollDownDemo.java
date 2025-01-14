package mobiletestautomation.androidapptesting;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollDownDemo extends TestBase {

    public static void main(String[] args) throws MalformedURLException {

        // TODO Auto-generated method stub
        AndroidDriver<AndroidElement> driver = capabilities("Pixel 4a API 31");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");

    }
}
