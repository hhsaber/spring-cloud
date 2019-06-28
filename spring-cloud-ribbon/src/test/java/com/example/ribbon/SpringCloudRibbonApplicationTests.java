package com.example.ribbon;

import com.example.ribbon.model.Servant;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCloudRibbonApplicationTests {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void contextLoads() {
        String swaggerService="SPRING-BOOT-SWAGGER";
        ResponseEntity<Servant> forEntity = restTemplate.getForEntity("http://"+swaggerService+"/servant/findById/1", Servant.class);
        Servant servant = forEntity.getBody();
        System.out.println(servant);
    }

}
