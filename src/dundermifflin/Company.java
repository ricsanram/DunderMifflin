package dundermifflin;


import java.util.ArrayList;
import java.util.*;


public class Company 
{
    ArrayList <Department> departments  = new ArrayList();
    
    public Company(){
        populateCompany();
    }
   
    void addDept(int id, String description)
    {
       Department myDept = new Department(id, description);
       //sort the
       departments.add(myDept);
       
    }
    
    void populateCompany()
    {
         addDept(1, "Accounting");
         addDept(2, "Corporate");
         addDept(3, "Customer Service:");
         addDept(4, "Human Resouces:");
         addDept(5, "Managment:");
         addDept(6, "Quality Assurance");
         addDept(7, "Reseptions:");
         addDept(8, "Sales:");
         addDept(9, "Supply Relations");
         addDept(10, "Warehouse");
         
    }
    
    void printDepartmentList()
    {
        for (int i = 0; i < departments.size(); i++)
        {
            System.out.println(departments.get(i).toString());
            departments.get(i).printEmployeeList();
            
        }
    }
   
    
}
