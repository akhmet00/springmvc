package com.example.demo.Controller;

import org.slf4j.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class errorController implements ErrorController{

    Logger logger = LoggerFactory.getLogger(errorController.class);

    @RequestMapping("/error")
    private String handleError(HttpServletRequest request, Model model, Authentication authentication){
        String errorPage="error";
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        if(status!=null){
            Integer statusCode = Integer.valueOf(status.toString());

            if(statusCode==HttpStatus.NOT_FOUND.value()) {
                errorPage = "error/404";
                logger.warn("User: " + authentication.getName() + " get NOT FOUND 404 error");
            }
            if(statusCode==HttpStatus.FORBIDDEN.value()){
                errorPage = "error/403";
                logger.warn("User: " + authentication.getName() + " get ACCESS DENIED 403 error");
            }

        }
        return errorPage;
    }


    @Override
    public String getErrorPath() {
        return "/error";
    }
}
