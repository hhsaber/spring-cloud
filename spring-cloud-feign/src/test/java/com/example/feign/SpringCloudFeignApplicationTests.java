package com.example.feign;

import com.example.feign.client.ServantFeign;
import com.example.feign.model.Servant;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCloudFeignApplicationTests {

    @Autowired
    private ServantFeign servantFeign;

    @Test
    public void contextLoads() {
        Optional<Servant> servant = servantFeign.findById(1);
        System.out.println(servant.get());
    }

    @Test
    public void contextLoads2() {
        List<Servant> list = servantFeign.findAll();
        System.out.println(list);
    }
}
