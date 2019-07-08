package com.example.feign.client;

import com.example.feign.model.Servant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

/**
 * @Author: zhangyanlong
 * @Date: 2019/7/8 7:56
 */
@FeignClient(value = "SPRING-BOOT-SWAGGER")
public interface ServantFeign {
    @GetMapping("/servant/findAll")
    public List<Servant> findAll();

    @GetMapping("/servant/findById/{id}")
    public Optional<Servant> findById(@PathVariable("id") int id);
}
