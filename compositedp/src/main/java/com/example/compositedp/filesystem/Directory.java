package com.example.compositedp.filesystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    String DirectorName;
    List<FileSystem> files;
    public Directory(String DirectorName) {
        this.DirectorName = DirectorName;
        this.files = new ArrayList<>();    
    }
    public void add(FileSystem file) {
        files.add(file);
    }
    public void ls(){
        System.out.println("Directory: " + DirectorName);
        for (FileSystem file : files) {
            file.ls();
        }
    }

}
