package tests;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import tests.config.ApiConfig;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestApi {

    @Test
    public void testApi(){
        ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());
        assertThat(apiConfig.baseURL()).isEqualTo("https://www.github.ru/");
        assertThat(apiConfig.token()).isEqualTo("tokenGitHub");
    }
}
