package org.bpz.rabbitmq.management.web.controller;

import com.google.gson.Gson;
import org.apache.commons.codec.digest.DigestUtils;
import org.bpz.rabbitmq.management.common.dto.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @PostMapping("/test")
    public void test(@RequestBody User user) {
        Gson gson = new Gson();
        System.out.println(gson.toJson(user));
       System.out.println(DigestUtils.sha1Hex(gson.toJson(user)));
       String ddd= "{\"name\":\"bob\",\"age\":11}";
       System.out.println(ddd);
        System.out.println(DigestUtils.sha1Hex(ddd));
    }
}
