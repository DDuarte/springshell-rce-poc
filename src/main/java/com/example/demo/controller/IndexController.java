package com.example.demo.controller;

import com.example.demo.model.EvalBean;
//import org.springframework.web.bind.WebDataBinder;
//import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/index")
    public void index(EvalBean evalBean) {

    }

    //@InitBinder
    //public void initBinder(WebDataBinder binder) {
    //    // mitigation:
    //    String[] blackList = { "class.*", "Class.*", "*.class.*", ".*Class.*" };
    //    binder.setDisallowedFields(blackList);
    //}
}
