/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 * A model class to model Student Objects
 * @author Ali Hassan, 2019
 */
public class StudentDemo 
{
  private int studentID;
  private String name;
  
  /**
   * A constructor to pass in the given ID and then name
   * @param givenID - the ID to assign
   * @param givenName- the name to assign 
   */
  public StudentDemo(int givenID, String givenName)
  {
      studentID = givenID;
      name = givenName;
  }
  
  /**
   * A method to set the student ID
   * @param givenID the ID to set
   */
  public void setStudentID(int givenID)
  {
      studentID=givenID;
  }
  /**
   * An accessor method for studentID
   * @return the student's ID 
   */
  public int getStudentID()
  {
      return studentID;
  }

    /**
     * A method to return the student's name
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * A method to set the student's name
     * @param givenName the name to set
     */
    public void setName(String givenName) {
        name = givenName;
    }
    
    public String toString (){
       return String.format("The name of student is: %s\nThe ID of student is %d\n", name,studentID);
        
        //return "Student name: "+name+" Student Id : "+studentID;
       
    }
    
}
