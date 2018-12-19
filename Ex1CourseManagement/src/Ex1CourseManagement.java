/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 17011947
 */
public class Ex1CourseManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       classStudent s1 = new classStudent("Amalamol", 2345);
       Module m1 = new Module("Introduction to Object Oriented Programming", 8029);
       System.out.println(m1.getName());
       System.out.println(m1.getNumber());
       s1.addModule(m1);
       s1.displayModule();
    }
    
}
