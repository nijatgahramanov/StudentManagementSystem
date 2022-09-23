package com.company.util;

import com.company.bean.Config;
import com.company.service.menu.*;
import com.company.service.menu.inter.MenuService;

import static com.company.util.MenuUtil.showMenu;

public enum Menu {
    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2, "Register", new MenuRegisterService()),
    ADD_TEACHER(3, "Add teacher", new MenuAddTeacherService()),
    ADD_STUDENT(4,"Add student",new MenuAddStudentService()),
    SHOW_ALL_TEACHER(5, "Show all teacher", new MenuShowTeacherService()),
    SHOW_ALL_STUDENT(6, "Show all student", new MenuShowStudentService()),
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
        showMenu();
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
                if (menus[i] == LOGIN || menus[i] == REGISTER) {
                    if (!Config.isLoggedIn()) {
                        System.out.println(menus[i]);
                    }
                } else if (Config.isLoggedIn()) {
                    System.out.println(menus[i]);
                }
        }
    }

    @Override
    public String toString() {
        return number + "." + label;
    }
}


