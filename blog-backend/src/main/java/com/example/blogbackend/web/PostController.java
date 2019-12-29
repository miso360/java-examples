package com.example.blogbackend.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @RequestMapping(value={"/",""})
    @ResponseBody
    public String getPosts() {
        return "hello";
    }
}
