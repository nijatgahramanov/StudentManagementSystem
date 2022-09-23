package com.company.service.menu;

import com.company.service.menu.inter.MenuRegisterServiceInter;


public class MenuRegisterService implements MenuRegisterServiceInter {
    @Override
    public void process() {
        System.out.println("register");
    }
}
