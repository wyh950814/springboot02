package com.wang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
@Controller
public class UpLoud {
    @PostMapping("/file")
    public  String getUpLoud(MultipartFile file) throws IOException {
        String filename = file.getOriginalFilename();
        System.out.println(filename);
        file.transferTo(new File("E:/"+filename));
        return "ok";
    }
}
