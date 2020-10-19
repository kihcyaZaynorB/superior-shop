package com.kihcyaz.aynorb.superiorshop.userweb.web.aop;

import com.kihcyaz.aynorb.superiorshop.common.exception.BusinessException;
import com.kihcyaz.aynorb.superiorshop.common.serverresponse.ServerResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice({"com.kihcyaz.aynorb.superiorshopuserweb.web.controller"})
public class ExceptionAdvice {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionAdvice.class);


    @ExceptionHandler(value = {BusinessException.class})
    @ResponseBody
    public ServerResponse runtimeExceptionHandler(Exception ex, HttpServletRequest request, HttpServletResponse response) {
        BusinessException exception = (BusinessException) ex;
        logger.info("runtime exception: " + ex.getClass() + ", " + ex.getMessage());
        response.setStatus(HttpStatus.BAD_REQUEST.value());
        return ServerResponse.error(exception.getErrorCode(), exception.getMessage());
    }



    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ServerResponse unknownExceptionHandler(Exception ex, HttpServletRequest request, HttpServletResponse response) {
        logger.info("unknown error", ex);
        response.setStatus(HttpStatus.BAD_REQUEST.value());
        return ServerResponse.error();
    }


}
