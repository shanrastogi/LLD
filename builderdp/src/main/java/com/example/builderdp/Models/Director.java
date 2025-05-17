package com.example.builderdp.Models;

public class Director {

    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {

        if (studentBuilder instanceof EngineeringStudentBuilder) {
            return createEngineeringStudent();
        } else if (studentBuilder instanceof MBAStudentBuilder) {
            return createMBAStudent();
        }
        return null;
    }

    private Student createEngineeringStudent() {

        return studentBuilder.setRollNumber(3143412).setAge(22).setName("QWERTY ASDF").setSubjects().build();
    }

    private Student createMBAStudent() {

        return studentBuilder.setRollNumber(4764353).setAge(29).setName("POIUYT HFFDS").setFatherName("MyFatherName")
                .setMotherName("MyMotherName").setSubjects().build();

    }

}
