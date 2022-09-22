package com.company.util;

//import static java.awt.SystemColor.menu;


import java.util.Scanner;

public class MenuUtil {

    public static Menu showMenu() {
        System.out.println("Please select menu : ");
        Menu.showAllMenu();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please select menu : ");
        int selectedMenu = sc.nextInt();
        System.out.println("");

        return Menu.find(selectedMenu);

    }

    public static void processMenu(Menu menu) {
        menu.process();
    }
}

