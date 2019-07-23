package com.example.demo.controller;/**
 * @author codeManZuo
 * @date 2019/7/23 - 15:54
 */

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author zh6753
 * @date 2019/7/23 15:54 
 */
@ControllerAdvice
public class GlobalException {
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> nameIsEmpty(Exception e)
    {
        return ResponseEntity.status(500).body(e.getMessage());
    }
}
