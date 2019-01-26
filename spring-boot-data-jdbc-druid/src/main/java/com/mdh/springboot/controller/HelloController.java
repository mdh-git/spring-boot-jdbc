package com.mdh.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Author: madonghao
 * @Date: 2019/1/25 11:22
 */
@RestController
public class HelloController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/query")
    public Map<String, Object> map(){
        List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * FROM department");
        return list.get(0);
    }

    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello spring boot!";
    }
}
