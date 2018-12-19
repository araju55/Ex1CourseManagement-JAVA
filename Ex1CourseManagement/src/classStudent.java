/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 17011947
 */
public class classStudent {
    
    private int number;
    private String name;
    private String course;
    private Module[] studying;
    private int numStudying;
    
    public classStudent(String sName, int number) {
        name = sName;
        this.number = number;
        studying = new Module[5];
        numStudying = 0;
    }
   
    public void changeCourse(String nCourse) {
        course = nCourse;
    } 
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
	this.name = name;
    }
           
    public void addModule(Module m) {
        studying[numStudying] = m;
        numStudying++;
    }
    
    public void deleteModule(int pos) {
        int i = pos;
        while (i < numStudying - 1) {
            studying[i] = studying[i + 1];
            i++;
        }
        numStudying--;
    }
    
    public void displayModule() {
        for (int i = 0; i < 1; i++) {
            System.out.println("Student name: " + name + "Module: " + studying[i].getName());
        }
    }
}
