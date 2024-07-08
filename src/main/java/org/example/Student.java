package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private String address;


    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static Map<Student, String> loadStudents() {
        Map<Student, String> stud = new HashMap<>();
        stud.put(new Student(1, "harsha", "RKP"), "harsha details");
        stud.put(new Student(2, "pooja", "KTR"), "pooja details");
        return stud;
    }

    public static Map<Student, String> Students() {
        Map<Student, String> stud = new TreeMap<>();
        stud.put(new Student(1, "harsha", "RKP"), "harsha details");
        stud.put(new Student(2, "pooja", "KTR"), "pooja details");
        return stud;
    }

    @Override
    public int compareTo(Student o) {
        if (this.id == o.id)
            return this.name.compareTo(o.name);
        return this.id > o.id ? -1 : 1;
    }
}
