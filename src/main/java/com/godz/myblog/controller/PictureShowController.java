package com.godz.myblog.controller;

import com.godz.myblog.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author :Godz
 * @description :照片墙页面显示控制器
 * @date: 2021-02-19 23:59
 **/
@Controller
public class PictureShowController {

    @Autowired
    private PictureService pictureService;

    @GetMapping("/picture")
    public String friends(Model model) {
        model.addAttribute("pictures",pictureService.listPicture());
        return "picture";
    }

}