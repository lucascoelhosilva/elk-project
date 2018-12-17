package com.coelho.example;

import java.util.concurrent.atomic.AtomicLong;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public User greeting(@RequestParam(value="name", defaultValue="Hello World") String name) {

//        LOGGER.info("This is an info message id:" + counter.incrementAndGet() + " Name: " + name);

        logger.info("name: " + name);
//        logger.info("====> This is an info log");
//        logger.warn("====> This is an warn log");

        return new User(counter.incrementAndGet(),
                            String.format(name));
    }

    @RequestMapping("/")
    public ResponseEntity<String> welcome() {//Welcome page, non-rest
        logger.info("PAGE INIT");
        return ResponseEntity.status(HttpStatus.OK).body("OK");
    }
}