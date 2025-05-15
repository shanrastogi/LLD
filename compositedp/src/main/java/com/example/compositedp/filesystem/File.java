package com.example.compositedp.filesystem;

public class File implements FileSystem{
    String FileName;
    public File(String FileName){
        this.FileName = FileName;
    }
    public void ls(){
        System.out.println("File: " + FileName);
    }
}
