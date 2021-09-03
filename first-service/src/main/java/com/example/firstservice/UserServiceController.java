package com.example.firstservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user-service")
@Slf4j
public class UserServiceController {
    Environment env;

    @GetMapping("/test")
    public String test(HttpServletRequest request) {
        log.info("Server port = {}", request.getServerPort());
        return String.format("user service %s",
                env.getProperty("local.server.port")); // request.getServerPort()와 동일
    }
}
