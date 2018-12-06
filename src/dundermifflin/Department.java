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
   

   
   void addEmployee(Integer id,  String name, String bday, String ss,  String salary,  String address)
   {
         Employee newEmp = new Employee(id, name, bday, ss, salary, address);
         map.put(newEmp.getEmployeeID(), newEmp);
   }
   
   void populateDept()
   {
        addEmployee(1, "Meridith Palmer" , "August 13, 1998" , "680-34-XXXX" , "$50,000.00" , "908 Goodman St Scranton, Pennsylvania(PA), 18512" );
        addEmployee(2 , "Creed Bratton" , "March 8, 1985" , "630-96-XXXX" , "$51,000.00" , "110 E Main St Hummelstown, Pennsylvania(PA), 17036" );
        addEmployee(3 , "Kelly Kapoor" , "August 17, 1959 " , "490-01-XXXX" ,  "$52,000.00" , "911 Hamilton Ave Farrell, Pennsylvania(PA), 16121" );
        addEmployee(4 ,"Ryan Howard ","August 17, 1959" , "401-98-XXXX" , "$53,000.00" , "910 Cedar Ave Scranton, Pennsylvania(PA), 18505" );
        addEmployee(5 , "Clark Green" , "February 16, 1996" , "446-14-XXXX" , "$51,000.00" , "1396 Hall Ave Sharon, Pennsylvania(PA), 16146" );
        addEmployee(6 , "Pete Miller " , "May 17, 1967" , "310-34-XXXX" , "$62,000.00" , "913 Eynon St Scranton, Pennsylvania(PA), 18504" );
        addEmployee(7 , "Holly Flax" , "August 29 ,1955" , "594-52-XXXX" , "$42,000.00" , "1302 Airport Rd Falls Creek, Pennsylvania(PA), 15840" );
        addEmployee(8 , "Toby Flenderson" , "December 27, 1970" , "767-16-XXXX" , "$55,000.00" , "932 Prospect Ave Scranton, Pennsylvania(PA), 18505" );
        addEmployee(9 , "Kevin Malone" , "November 9, 1986" , "033-44-XXXX" , "$62,000.00" , "257 Liberty St Sharon, Pennsylvania(PA), 16146" );
        addEmployee(10 , "Gabe Lewis" , "May 18, 1972" , "284-84-XXXX" , "$58,000.00" , "816 Goodman St Scranton, Pennsylvania(PA), 18512" );
        addEmployee(11 , "Andy Bernard" , "August 25, 1970" , "491-05-XXXX" , "$55,000.00" , "1301 College Ave Beaver, Pennsylvania(PA), 15009" );
        addEmployee(12 , "Oscar Martinez" , "March 31, 1989" , "296-36-XXXX" , "$56,000.00" , "475 Steamboat Rd Greenwich, Connecticut(CT), 06830" );
        addEmployee(13 , "Michael Scott" , "February 16, 1972" , "234-58-XXXX" , "$84,000.00" , "49 Rockwood Ln Greenwich, Connecticut(CT), 06830" );
        addEmployee(14 , "Pam Beasley" , "August 18, 1969" , "492-64-XXXX" , "$63,000.00" , "607 Powell Ave Jessup, Pennsylvania(PA), 18434" );
        addEmployee(15 , "Darryl Phillis" ,  "October 5, 1994" , "406-25-XXXX" , "$61,000.00" , "908 N Cayuga St Ithaca, New York(NY), 14850" );
        addEmployee(16 , "David Wallis" , "June 30, 1965" , "195-10-XXXX" , "$52,000.00" , "947 Virginia Ave Lancaster, Pennsylvania(PA), 17603" );
        addEmployee(17 , "Angela Martin" , "November 1, 1978" , "604-01-XXXX" , "$55,000.00" , "322 Schocopee Rd Milford, Pennsylvania(PA), 18337" );
        addEmployee(18 , "Charles Minor" , "June 2, 1987" , "649-22-XXXX" , "$64,000.00" , "500 College Ave Swarthmore, Pennsylvania(PA), 19081" );
        addEmployee(19 , "DeAngelo Vickers" , "December 30, 1991" , "401-70-XXXX" , "$62,000.00" , "568 Firethorn Dr Monroeville, Pennsylvania(PA), 15146" );
        addEmployee(20 , "Jan Levinson" , "December 5, 1975" , "530-90-XXXX" , "$68,000.00" , "1310 Adams Ave Scranton, Pennsylvania(PA), 18509" );
        addEmployee(21 ,  "Erin Hannon" , "November 12, 1995" , "275-62-XXXX" , "$71,000.00" , "20 Princeton Ave Ridley Park, Pennsylvania(PA), 19078" );
        addEmployee(22 , "Phyllis Vance" , "December 31, 1970" , "515-25-XXXX" , "$72,000.00" , "109 Lantern Ln Lancaster, Pennsylvania(PA), 17602" );
        addEmployee(23 , "Jim Halpert" , "August 8, 1972" , "105-62-XXXX" , "$82,001.00" , "1302 Blue Mountain Dr Danielsville, Pennsylvania(PA), 18038" );
        addEmployee(24 , "Dwight Schrute" , "July 20, 1963" , "011-64-XXXX" , "$82,000.00" , "1302 Kennedy Dr Uniontown, Pennsylvania(PA), 15401");
   }
   
   void printEmployeeList()
   {
       populateDept();
       
      //Set<Entry<Integer, Employee>> hashSet = map.entrySet();
//      for(Entry entry:  hashSet)
//      {
//          System.out.println("key="+ entry.getKey()+", Value= " + entry.getValue());
//      }

        map.get(id).OutputEmployee();
   }
   
}
