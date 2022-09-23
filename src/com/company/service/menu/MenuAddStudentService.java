package com.company.service.menu;

import com.company.bean.Student;
import com.company.service.menu.inter.MenuAddStudentServiceInter;
import com.company.bean.Config;

import java.util.Scanner;

public class MenuAddStudentService implements MenuAddStudentServiceInter {


    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name : ");
        String name = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter surname : ");
        String surname = sc2.nextLine();

        Student s = new Student();
        s.setName(name);
        s.setSurname(surname);


        Config.instance().appendStudent(s);
        System.out.println("Student added");

    }
}
