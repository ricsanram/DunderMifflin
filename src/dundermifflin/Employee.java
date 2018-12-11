/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dundermifflin;
/**
 *
 * @author jasonguevara
 */
public class Employee {
    // *****************************************************
    //                Variables
    // *****************************************************
    private int employeeID;
    private String name, birthday, job, address,ssNum,salary;
    // *****************************************************
    //                Getters and Setters
    // *****************************************************
        
    Employee(Integer id,  String name, String bday, String ss, String salary,  String address, String job) // pass dept
    {
        employeeID = id;
        this.name = name;
        birthday = bday;
        ssNum =  ss;
        this.salary  = salary;
        this. address = address;
        this.job = job;
        
    }
    public void setEmployeeID(int employeeID)
    {
        this.employeeID = employeeID;
    }
    public int getEmployeeID()
    {
        return this.employeeID;
    }
    public void setSSNum(String ssNum)
    {
        this.ssNum = ssNum;
    }
    public String getSSNum()
    {
        return this.ssNum;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setBDay(String birthday){
        this.birthday = birthday;
    }
    
    public String getBDay()
    {
        return this.birthday;
    }
    
    public void setJob(String job){
        this.job = job;
    }
    
    public String getJob()
    {
        return this.job;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getAddress()
    {
        return this.address;
    }
    
    public void setSalary(String salary){
        this.salary = salary;
    }
    
    public String getSalary()
    {
        return this.salary;
    }
    
    public StringBuilder OutputEmployee()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n**************************************************\n")
        .append("                     Employee Data                \n")
        .append("**************************************************\n")
        .append("\nEmployee's ID Number   : " + getEmployeeID())
        .append("\nEmployee's Name        : " + getName())
        .append("\nEmployee's Salary      : " + getSalary())
        .append("\nSocial Security Number : " + getSSNum())
        .append("\nEmployee's Birthday    : " + getBDay())
        .append("\nEmployee's Address     : " + getAddress());

        return sb;
    }
    
    
    
    

    
}
