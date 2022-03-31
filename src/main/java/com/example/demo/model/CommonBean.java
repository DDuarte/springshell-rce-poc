package com.example.demo.model;

public class CommonBean {

    public CommonBean() {
        System.out.println("[+] com.example.spbdemo.pojo.CommonBean.CommonBean");
    }

    public String name;

    public String getName() {
        System.out.println("[+] com.example.spbdemo.pojo.CommonBean.getName");
        return name;
    }

    public void setName(String name) {
        System.out.println("[+] com.example.spbdemo.pojo.CommonBean.setName");
        this.name = name;
    }
}
