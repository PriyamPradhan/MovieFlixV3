package com.priyam.movieflix.handler;

import lombok.extern.slf4j.Slf4j;
import com.priyam.movieflix.controller.ScreeningController;
import com.priyam.movieflix.exception.HousefullException;
import com.priyam.movieflix.model.ErrorDetail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@Slf4j
@RestControllerAdvice(assignableTypes = ScreeningController.class)
public class ScreeningExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(ScreeningExceptionHandler.class);

    @ExceptionHandler(HousefullException.class)
    public ResponseEntity<?> handleHouseFullException(HousefullException ex, WebRequest request) {

        logger.info("In Screening Exception Handler");


        ErrorDetail error = new ErrorDetail(new Date(), "House Full!", ex.toString());

        return new ResponseEntity<>(
                error, new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }
}
