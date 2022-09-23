package com.company.service.menu;

import com.company.bean.Config;
import com.company.bean.Student;
import com.company.bean.Teacher;
import com.company.service.menu.inter.MenuAddStudentServiceInter;

import java.util.Scanner;

public class MenuAddTeacherService implements MenuAddStudentServiceInter {
    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name : ");
        String name = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter surname : ");
        String surname = sc2.nextLine();

        Teacher t = new Teacher();
        t.setName(name);
        t.setSurname(surname);


        Config.instance().appendTeacher(t);
        System.out.println("Teacher added");
    }
}
