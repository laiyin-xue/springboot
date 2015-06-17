package controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorHandler implements ErrorController{

    @Override
    public String getErrorPath() {
        return "Customizer Error Path";
    }

    @RequestMapping("/error")
    public String error() {
        return "Customizer Error Message";
    }
}
