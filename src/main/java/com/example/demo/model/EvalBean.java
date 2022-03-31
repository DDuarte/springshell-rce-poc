package com.example.demo.model;

public class EvalBean {

    public EvalBean() throws ClassNotFoundException {
        System.out.println("[+] EvalBean.EvalBean");
    }

    public String name;

    public CommonBean commonBean;

    public String getName() {
        System.out.println("[+] EvalBean.getName");
        return name;
    }

    public void setName(String name) {
        System.out.println("[+] EvalBean.setName");
        this.name = name;
    }

    public CommonBean getCommonBean() {
        System.out.println("[+] EvalBean.getCommonBean");
        return commonBean;
    }

    public void setCommonBean(CommonBean commonBean) {
        System.out.println("[+] EvalBean.setCommonBean");
        this.commonBean = commonBean;
    }
}
