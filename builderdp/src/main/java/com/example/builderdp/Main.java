package com.example.builderdp;

import com.example.builderdp.Models.Director;
import com.example.builderdp.Models.EngineeringStudentBuilder;
import com.example.builderdp.Models.MBAStudentBuilder;
import com.example.builderdp.Models.Student;

public class Main {
    public static void main(String[] args) {
        Director directorObj1 = new Director(new EngineeringStudentBuilder());
        Director directorObj2 = new Director(new MBAStudentBuilder());

        Student engineerStudent = directorObj1.createStudent();
        Student mbaStudent = directorObj2.createStudent();

        System.out.println(engineerStudent.toString());
        System.out.println(mbaStudent.toString());

    }
}