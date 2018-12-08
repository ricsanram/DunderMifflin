/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dundermifflin;
import java.util.Scanner;
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
    // *****************************************************
    //                Other Functions?
    // *****************************************************
    public void getEmployeeData()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the employee's name?: ");
        String name = input.nextLine();
        this.setName(name);
        
        System.out.println("What is the employee's Social Security Number?: ");
        String SS = input.nextLine();
        this.setSSNum(SS);
        
        System.out.println("What is the employee's birthday?: ");
        String bday = input.nextLine();
        this.setBDay(bday);
        
        System.out.println("What is the employee's Job?: ");
        String job = input.nextLine();
        this.setJob(job);
        
        System.out.println("What is the employee's address?: ");
        String address = input.nextLine();
        this.setAddress(address);
                
        System.out.println("What is the employee's ID number?: ");
        int id = input.nextInt();
        this.setEmployeeID(id);
        
        System.out.println("What is the employee's salary?: ");
        String salary = input.nextLine();
        this.setSalary(salary);
        
    }
    
    public void OutputEmployee()
    {
        System.out.println("**************************************************");
        System.out.println("                     Employee Data                ");
        System.out.println("**************************************************");
        System.out.printf("\n   Employee's ID Number   :  %-5d" , getEmployeeID());
        System.out.printf("\n   Employee's Name        : %s" , getName());
        System.out.printf("\n   Employee's Salary      : %s" , getSalary());
        System.out.printf("\n   Social Security Number : %s" , getSSNum());
        System.out.printf("\n   Employee's Birthday    : %s" , getBDay());
        System.out.printf("\n   Employee's Address     : %s" , getAddress());
      //  System.out.printf("\n Employee's Job         : %s" , getJob());
        System.out.println("\n");
    }
    
    
    
    

    
}
