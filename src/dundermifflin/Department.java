package dundermifflin;


import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;

public class Department 
{
    int id;
    String description;
   HashMap<Integer, Employee>  map = new HashMap();

   Department(int id, String description)
   {
       this.id = id;
      this.description = description;
      this.map = map;
   }
   
   void set_Department_ID(int id)
   {
       this.id = id;
   }
   
   int  get_Department_ID()
   {
       return id;
   }
   
     void set_Department_Description(String Description)
   {
       this.description = Description;
   }
   
   String  get_Department_Description()
   {
       return description;
   }
   
   @Override
   public String toString()
   {
       return ("ID: " + get_Department_ID() + "  " + get_Department_Description());
   }
   
   void search_For_Employee()
   {
        Integer emp_id;
       int dept_id;
       
        Scanner input = new Scanner(System.in);
       System.out.println("Enter Dept:: ");
       dept_id = input.nextInt();
 
       System.out.println("Enter Employee ID: ");
      emp_id = input.nextInt();
      Employee emp = map.get(emp_id);
       System.out.println(emp.getEmployee_Name());
   }
   
   void addEmployee(Integer id,  String name, String bday, String ss,  String salary,  String address)
   {
         Employee newEmp = new Employee(id, name, bday, ss, salary, address);
         map.put(newEmp.getEmployee_ID(), newEmp);
   }
   
   void populateDept()
   {
       addEmployee(1, "Scott", "10/10/10" , "12-12-1232", "2123124", "908 Goodman St. Scranton, PA. 18512 " );
       addEmployee(2, "Scott", "10/10/10" , "12-12-1232", "2123124", "110 E Main  St. Hummelstown, PA. 17036 " );
       addEmployee(3, "Scott", "10/10/10" , "12-12-1232", "2123124", "911 Hamilton Ave Farrell, PA. 16121 " );
       addEmployee(4, "Scott", "10/10/10" , "12-12-1232", "2123124", "910 Cedar Ave Scranton, PA. 18505 " );
       addEmployee(5, "Scott", "10/10/10" , "12-12-1232", "2123124", "1396 Hall Ave Sharon, PA. 16146 " );
       addEmployee(6, "Scott", "10/10/10" , "12-12-1232", "2123124", "913 Eynon St. Scranton, PA. 18504" );
       addEmployee(7, "Scott", "10/10/10" , "12-12-1232", "2123124", "" );
       addEmployee(8, "Scott", "10/10/10" , "12-12-1232", "2123124", "132413 asdfadfadf " );
       addEmployee(9, "Scott", "10/10/10" , "12-12-1232", "2123124", "132413 asdfadfadf " );
       addEmployee(10, "Scott", "10/10/10" , "12-12-1232", "2123124", "132413 asdfadfadf " );
                
   }
   
   void printEmployeeList()
   {
       populateDept();
      Set<Entry<Integer, Employee>> hashSet = map.entrySet();
      for(Entry entry:  hashSet)
      {
          System.out.println("key="+ entry.getKey()+", Value= " + entry.getValue());
      }
   }
   
}
