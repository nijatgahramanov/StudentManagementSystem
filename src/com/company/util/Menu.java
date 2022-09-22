package com.company.util;

import com.company.service.menu.MenuLoginService;
import com.company.service.menu.MenuRegisterService;
import com.company.service.menu.MenuService;

public enum Menu {
    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2, "Register", new MenuRegisterService()),
    ADD_STUDENT(3, "Add student", null),
    ADD_TEACHER(4, "Add teacher", null),
    SHOW_ALL_TEACHER(5, "Show all teacher", null),
    SHOW_ALL_STUDENT(6, "Show all student", null),
    UNKNOWN;

    private int number;
    private String label;
    private MenuService service;


    Menu() {
    }

    Menu(int number, String label, MenuService service) {
        this.number = number;
        this.label = label;
        this.service = service;
    }

    public String getLabel(String label) {
        return label;
    }

    public void process() {
        service.process();
    }

    public int getNumber() {
        return this.number;
    }

    public static Menu find(int number) {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == number) {
                return menus[i];
            }
        }
        return Menu.UNKNOWN;
    }

    public static void showAllMenu() {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i] != UNKNOWN)
                System.out.println(menus[i]);
        }
    }

    @Override
    public String toString() {
        return number + "." + label;
    }
}


