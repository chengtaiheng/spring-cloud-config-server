package com.chth.config.consumer.controller;

import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: 程泰恒
 * @date: 2019/3/12 11:20
 */

@RestController
@RequestMapping("/consumer")
@RefreshScope
public class ConsumerController {

    @Value("${com.chth.contextual.model}")
    private String contextualModel;

    @Value("${com.chth.first.name}")
    private String firstName;

    @Value("${com.chth.last.name}")
    private String lastName;

    @Value("${com.chth.age}")
    private Integer age;


    @GetMapping
    public Map getConfigServerCenterProperties() throws Throwable {

        HashMap<Object, Object> map = Maps.newHashMap();

        map.put("contextualModel", contextualModel);
        map.put("firstName", firstName);
        map.put("lastName", lastName);
        map.put("age", age);
        map.put("ageValue", age);

        return map;
    }
}
