package com.company.util;

import com.company.service.menu.MenuLoginService;
import com.company.service.menu.MenuService;

public enum Menu {

    LOGIN("Login",new MenuLoginService()),
    REGISTER("Register",null),
    ADD_STUDENT("Add student",null),
    ADD_TEACHER("Add teacher",null),
    SHOW_ALL_TEACHER("Show all teacher",null),
    SHOW_ALL_STUDENT("Show all student",null);

    private String label;
    private MenuService service;

    Menu(String label,MenuService service) {
        this.label = label;
        this.service = service;
    }

    public String getLabel(String label) {
        return label;
    }

    public void process(MenuService service) {
        service.process();
    }


    @Override
    public String toString() {
        return "Menu{" +
                "label='" + label + '\'' +
                '}';
    }
}


