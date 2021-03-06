package tests.config;

import org.aeonbits.owner.ConfigFactory;

public class Project {
    public static WebConfig webConfig = ConfigFactory.create(WebConfig.class, System.getProperties());

    public static boolean isRemoteWebDriver() {
        return !webConfig.remoteUrl().equals("");
    }

    public static String browserName2() {
        return webConfig.browserName1();
    }

    public static String browserVersion() {
        return webConfig.browserVersion();
    }

    public static String browserSize() {
        return webConfig.browserSize();
    }

}
