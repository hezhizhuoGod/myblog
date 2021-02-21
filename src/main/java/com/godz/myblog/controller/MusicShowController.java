package com.godz.myblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author :Godz
 * @description :音乐盒页面显示控制器
 * @date: 2021-02-19 23:57
 **/
@Controller
public class MusicShowController {

    @GetMapping("/music")
    public String about() {
        return "music";
    }

}