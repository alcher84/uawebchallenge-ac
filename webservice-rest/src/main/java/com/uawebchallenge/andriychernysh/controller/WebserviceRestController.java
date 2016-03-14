package com.uawebchallenge.andriychernysh.controller;

import com.uawebchallenge.andriychernysh.transport.HelloDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/WebserviceRest")
public class WebserviceRestController {

    @RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
    public
    @ResponseBody
    String helloWorld() {
        log.debug("HelloWorld has been invoked");
        return "Hello, World";
    }

    @RequestMapping(value = "/helloName", method = RequestMethod.GET)
    public
    @ResponseBody
    String helloName(@RequestParam(value = "name", defaultValue = "My Lord") final String name) {
        log.debug("HelloName has been invoked. Sent name is:" + name);
        return "Hello, " + name;
    }

    @RequestMapping(value = "/helloJson", method = RequestMethod.GET)
    public ResponseEntity<HelloDto> helloJson() throws Exception {
        final HelloDto hello = new HelloDto();
        hello.setId(1L);
        hello.setMessage("Hi, babe");

        return ResponseEntity.ok(hello);
    }

}
