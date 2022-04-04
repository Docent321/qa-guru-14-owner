package tests.config;

import org.aeonbits.owner.Config;



@Config.Sources("classpath:${launch}.properties")
public interface WebConfig extends Config {

    @Key("browserName")
    String browserName1();

    @Key("browserVersion")
    String browserVersion();

    @Key("browserSize")
    String browserSize();

    @Key("remoteUrl")
    String remoteUrl();

}
