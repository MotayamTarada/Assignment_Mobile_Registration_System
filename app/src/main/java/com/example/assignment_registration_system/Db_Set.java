
package com.example.assignment_registration_system;

import java.util.ArrayList;
import java.util.List;

public class Db_Set {

    private final List<Students> studentList;

    public Db_Set() {
        studentList = new ArrayList<>();
    }

    public String[] typeofperiod() {
        String[] arr = {"Calculus 1", "Calculus 2", "Calculus 3", "Linear Algebra", "Statistics", "Differential Equations", "Abstract Algebra", "Discrete Mathematics"};
        return arr;
    }

    public void addStudent(Students student) {
        studentList.add(student);
    }
    public String getStudent(){
        String s = null;
        for (int i = 0; i < studentList.size(); i++) {
           s= studentList.get(i).toString();
        }

        return s ;
    }

    public String[] getAllNames() {
        String[] arr = new String[studentList.size()];
        for (int i = 0; i < studentList.size(); i++) {
            arr[i] = studentList.get(i).getFirstName() + " " + studentList.get(i).getLastName();
        }
        return arr;
    }
    public String[] getAllStudentsData() {
        String[] dataArray = new String[studentList.size()];
        for (int i = 0; i < studentList.size(); i++) {
            dataArray[i] = studentList.get(i).toString();
        }
        return dataArray;
    }





}