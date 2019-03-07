/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

import java.util.Scanner;

/**
 * A class to create an array of students and print their names
 *
 * @author Ali Hassan, 2019
 */
public class StudentArray {

    public static void main(String[] args) {
        
        System.out.println("Hello World");
      
//        StudentDemo student1 = new StudentDemo(100, "Jim Halpern");
//        System.out.println(student1.getName()+ student1.getStudentID());
//        System.out.println(student1.toString());
//        
        
       StudentDemo [] students = new StudentDemo[3];
//       students [0] = new StudentDemo(100, "Aamir");
//       students [1] = new StudentDemo(101, "Aliiiii");
//       students [2] = new StudentDemo(102, "zzzzzzzz");
//       students [0].setName("Aamir Amin Nagra");
//       
//       //System.out.println(students[1]);
//       
//       for (int i=0; i<students.length; i++){
//           //System.out.println(students[i].getName()+ students[i].getStudentID());
//           System.out.println(students[i]);
//       }
       
       Scanner input = new Scanner (System.in);
       for (int i=0; i<students.length; i++){

           System.out.println("Please enter the ID: ");
            int id = input.nextInt();
           
           System.out.println("Enter the Name: ");
           String name= input.next();
           
           students[i] = new StudentDemo(id, name);
       }
       
       for (int j=0; j<students.length; j++){
           System.out.println(students[j]);
       }
       
    }

}
