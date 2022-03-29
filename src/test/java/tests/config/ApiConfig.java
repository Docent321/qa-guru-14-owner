package tests.config;


import org.aeonbits.owner.Config;

@Config.Sources({
        "file:/tmp/api.properties",
        "classpath:api.properties"
})

public interface ApiConfig extends Config {

    @Key("baseURL")
    String baseURL();

    @Key("token")
    String token();
}
