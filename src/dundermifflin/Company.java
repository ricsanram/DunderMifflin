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
    
    StringBuilder search_For_Dept(Integer givenDep)
    {
        Integer emp_id;
        int dept_id;
        int deptFnd= 0;
       
//        Scanner input = new Scanner(System.in);
//       System.out.println("Enter Dept ID:");
//       dept_id = input.nextInt();
       
        BinarySearch bs = new BinarySearch();
        deptFnd = bs.index(givenDep, departments);
      if (deptFnd == -1)
      {
          StringBuilder errorSB = new StringBuilder("Invalid Input");
          return errorSB;
          
      }
      else
      {
        return printDepartment(deptFnd);
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
    
    
    StringBuilder printDepartment(int i)
    {
//           System.out.println(departments.get(i).toString());
//            departments.get(i).printEmployeeList();
            
            StringBuilder sb = new StringBuilder(departments.get(i).toString())
                    .append(departments.get(i).printEmployeeList())
                    .append("\n\n\nPlease don't use this information.\n")
                    .append("Identity theft is not a joke! Millions of families suffer every year!\n\n");
            return sb;
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
