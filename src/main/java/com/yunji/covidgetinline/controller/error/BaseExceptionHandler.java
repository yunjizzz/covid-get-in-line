package com.yunji.covidgetinline.controller.error;

import com.yunji.covidgetinline.constant.ErrorCode;
import com.yunji.covidgetinline.exception.GeneralException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 9. 29.
 */
@ControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler
    public ModelAndView general(GeneralException e){
        ErrorCode errorCode = e.getErrorCode();
        HttpStatus status = errorCode.isClientSideError() ? HttpStatus.BAD_REQUEST : HttpStatus.INTERNAL_SERVER_ERROR;

        return new ModelAndView("error",
                Map.of(
                        "statusCode",status.value(),
                        "errorCode",errorCode,
                        "message",errorCode.getMessage(e)
                ),
                status);
    }


    @ExceptionHandler
    public ModelAndView exception(Exception e){
        ErrorCode errorCode = ErrorCode.INTERNAL_ERROR;
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;

        return new ModelAndView("error",
                Map.of(
                        "statusCode",status.value(),
                        "errorCode",errorCode,
                        "message",errorCode.getMessage(e)
                ),
                status);
    }
}
