package com.isoftstone.pmit.project.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;
import static com.isoftstone.pmit.project.common.DateUtils.format;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/demo")
public class VocController {

    @GetMapping(value = "/getNowDate")
    public String getAllMenuResultList() {

        return "当前时间为"+format(new Date())+";返回数据模块为VOC模块，端口为7008";
    }
}
