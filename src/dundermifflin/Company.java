package dundermifflin;


import java.util.ArrayList;
import java.util.*;
import java.util.Collections;


public class Company 
{
    ArrayList <Department> departments  = new ArrayList();
    
    
    public Company()
    {
        populateCompany();
    }
   
    void addDept(int id, String description)
    {
       Department myDept = new Department(id, description);
       
       departments.add(myDept);
       Collections.sort(departments, new SortByID());
       
       
    }
    
       void search_For_Dept()
   {
        Integer emp_id;
       int dept_id;
       int deptFnd= 0;
       
        Scanner input = new Scanner(System.in);
       System.out.println("Enter Dept ID:");
       dept_id = input.nextInt();
       
       BinarySearch bs = new BinarySearch();
      deptFnd = bs.index(dept_id, departments);
      if (deptFnd == -1)
      {
          System.out.println("Dept ID not found");
      }
      else
      {
      printDepartment(deptFnd);
      }
      
      
       /*
       System.out.println("Enter Employee ID: ");
      emp_id = input.nextInt();
      Employee emp = map.get(emp_id);
       System.out.println(emp.getName());
    */
   }
    
    void populateCompany()
    {
         addDept(8, "Accounting");
         addDept(2, "Corporate");
         addDept(5, "Customer Service");
         addDept(4, "Human Resources");
         addDept(3, "Management");
         addDept(6, "Quality Assurance");
         addDept(10, "Reception");
         addDept(1, "Sales");
         addDept(9, "Supply Relations");
         addDept(7, "Warehouse");
         
    }
    
    
    void printDepartment(int i)
    {
           System.out.println(departments.get(i).toString());
            departments.get(i).printEmployeeList();
    }
    
    void printDepartmentList()
    {
        for (int i = 0; i < departments.size(); i++)
        {
            System.out.println(departments.get(i).toString());
            departments.get(i).getMap();
            //departments.get(i).printEmployeeList();
            
        }
    }
   
  
    
}
