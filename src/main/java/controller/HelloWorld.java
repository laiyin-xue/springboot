package controller;

import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;

import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class HelloWorld {

    @RequestMapping("/helloWorld")
    public String helloWorld() {
        return "Hello World";
    }

    @RequestMapping("/printMessage")
    public String printMessage(@RequestParam String message) {
        return message;
    }

    @RequestMapping("/printHttpRequests")
    public String printHttpRequestParams(HttpServletRequest httpServletRequest) {
        return httpServletRequest.getParameterMap()
                .values()
                .stream()
                .map(value -> StringUtils.join(value, ""))
                .collect(Collectors.joining(", "));
    }
}
