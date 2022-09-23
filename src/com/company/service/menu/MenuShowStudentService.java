package com.company.service.menu;

import com.company.bean.Config;
import com.company.bean.Student;
import com.company.service.menu.inter.MenuShowStudentsServiceInter;

public class MenuShowStudentService implements MenuShowStudentsServiceInter {
    @Override
    public void process() {
        Student[] allStudent = Config.instance().getStudents();
        for(int i=0;i<allStudent.length;i++){
            System.out.println(allStudent[i]);
        }
    }
}
