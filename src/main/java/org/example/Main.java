package org.example;

import java.util.*;

import static org.example.Student.Students;
import static org.example.Student.loadStudents;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<Student, String> obj = loadStudents();
        System.out.println(obj.get(new Student(1, "harsha", "hh")));
        Map<Student, String> obj1 = Students();
        System.out.println(obj1.get(new Student(1, "harsha", "hh")));

    }
}