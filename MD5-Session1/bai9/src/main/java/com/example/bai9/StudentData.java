package com.example.bai9;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentData {
    private static List<Student> studentList = new ArrayList<>();

    public static void addStudent(Student s) {
        studentList.add(s);
    }

    public static List<Student> getAllStudents() {
        return studentList;
    }
}
