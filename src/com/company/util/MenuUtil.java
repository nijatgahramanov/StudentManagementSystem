package com.company.util;

//import static java.awt.SystemColor.menu;


import java.util.Scanner;

public class MenuUtil {

    public static void showMenu() {
        System.out.println("Please select menu : ");
        Menu.showAllMenu();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please select menu : ");
        int selectedMenuNumber = sc.nextInt();
        System.out.println("");

        Menu selectedMenu = Menu.find(selectedMenuNumber);
        selectedMenu.process();

    }

    public static void processMenu(Menu menu) {
        menu.process();
    }
}

