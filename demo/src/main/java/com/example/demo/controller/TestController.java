package com.example.demo.controller;/**
 * @author codeManZuo
 * @date 2019/7/23 - 15:48
 */

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zh6753
 * @date 2019/7/23 15:48 
 */
@RestController
public class TestController {
    @GetMapping("/item")
    public ResponseEntity<String> item(String name,String price)
    {
        if(name == null || name.equals(""))
        {
            throw new RuntimeException("名字不能为空");
        }
        return ResponseEntity.status(200).body("成功");
    }
}
