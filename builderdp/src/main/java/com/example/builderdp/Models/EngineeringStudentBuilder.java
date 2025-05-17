package com.example.builderdp.Models;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder {
    @Override
    public StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("Data Structures");
        subs.add("Operating Systems");
        subs.add("Computer Networks");
        this.subjects = subs;
        return this;
    }

}
