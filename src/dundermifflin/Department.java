package dundermifflin;


import java.util.HashMap;
import java.util.*;

public class Department 
{
    int id;
    String description;
    Integer idCount = 24;
   private HashMap<Integer, Employee>  map = new HashMap();

   Department(int id, String description)
   {
       this.id = id;
      this.description = description;
      this.map = map;
      
      populateDept();
   }
   
   void set_Department_ID(int id)
   {
       this.id = id;
   }
   
   int  get_Department_ID()
   {
       return id;
   }
   
     void set_Department_Description(String description)
   {
       this.description = description;
   }
   
   String  get_Department_Description()
   {
       return description;
   }
   
   @Override
   public String toString()
   {
        if (get_Department_ID() == 1)
            return ("Welcome to the " + get_Department_Description() + " Team!\n---------------------------------------------\nGlad you joined the winning team led by me, Dwight Schrute!!!\n\nHere's the updated team's employee list:");
        else
            return ("Welcome to the " + get_Department_Description() + " Team!\n---------------------------------------------\nToo bad you didn't join the winning team...sales! Anyways.\n\nHere's the updated team's employee list:");
   }
   
       public HashMap<Integer, Employee> getMap() {
        return map;
    }

    public void setMap(HashMap<Integer, Employee> map) {
        this.map = map;
    }
   
    void addNewEmployee(String fullName, String birthday, String ssn, String salary, String address)
    {
        Employee newEmp = new Employee(idCount + 1, fullName, birthday, ssn, salary, address, "newbie");
        idCount++;
        getMap().put(newEmp.getEmployeeID(), newEmp);
    }
   
   void addEmployee(Integer id,  String name, String bday, String ss,  String salary,  String address, String job)
   {
        Employee newEmp = new Employee(id, name, bday, ss, salary, address, job);

        if (job.equals(description))
            getMap().put(newEmp.getEmployeeID(), newEmp);
   }
   
   void populateDept()
   {
        addEmployee(1, "Meridith Palmer" , "August 13, 1998" , "680-34-XXXX" , "$50,000.00" , "908 Goodman St Scranton, Pennsylvania(PA), 18512" , "Supply Relations" );
        addEmployee(2 , "Creed Bratton" , "March 8, 1985" , "630-96-XXXX" , "$51,000.00" , "110 E Main St Hummelstown, Pennsylvania(PA), 17036" , "Quality Assurance");
        addEmployee(3 , "Kelly Kapoor" , "August 17, 1959 " , "490-01-XXXX" ,  "$52,000.00" , "911 Hamilton Ave Farrell, Pennsylvania(PA), 16121" , " Customer Service");
        addEmployee(4 ,"Ryan Howard ","August 17, 1959" , "401-98-XXXX" , "$53,000.00" , "910 Cedar Ave Scranton, Pennsylvania(PA), 18505" , " Customer Service" );
        addEmployee(5 , "Clark Green" , "February 16, 1996" , "446-14-XXXX" , "$51,000.00" , "1396 Hall Ave Sharon, Pennsylvania(PA), 16146"  , "Customer Service" );
        addEmployee(6 , "Pete Miller " , "May 17, 1967" , "310-34-XXXX" , "$62,000.00" , "913 Eynon St Scranton, Pennsylvania(PA), 18504" , " Customer Service");
        addEmployee(7 , "Holly Flax" , "August 29 ,1955" , "594-52-XXXX" , "$42,000.00" , "1302 Airport Rd Falls Creek, Pennsylvania(PA), 15840" , "Human Resources");
        addEmployee(8 , "Toby Flenderson" , "December 27, 1970" , "767-16-XXXX" , "$55,000.00" , "932 Prospect Ave Scranton, Pennsylvania(PA), 18505" , "Human Resources" );
        addEmployee(9 , "Kevin Malone" , "November 9, 1986" , "033-44-XXXX" , "$62,000.00" , "257 Liberty St Sharon, Pennsylvania(PA), 16146" , "Accounting" );
        addEmployee(10 , "Gabe Lewis" , "May 18, 1972" , "284-84-XXXX" , "$58,000.00" , "816 Goodman St Scranton, Pennsylvania(PA), 18512"  , "Human Resources" );
        addEmployee(11 , "Andy Bernard" , "August 25, 1970" , "491-05-XXXX" , "$55,000.00" , "1301 College Ave Beaver, Pennsylvania(PA), 15009" , "Sales" );
        addEmployee(12 , "Oscar Martinez" , "March 31, 1989" , "296-36-XXXX" , "$56,000.00" , "475 Steamboat Rd Greenwich, Connecticut(CT), 06830" , "Accounting" );
        addEmployee(13 , "Michael Scott" , "February 16, 1972" , "234-58-XXXX" , "$84,000.00" , "49 Rockwood Ln Greenwich, Connecticut(CT), 06830" ,  "Management" );
        addEmployee(14 , "Pam Beasley" , "August 18, 1969" , "492-64-XXXX" , "$63,000.00" , "607 Powell Ave Jessup, Pennsylvania(PA), 18434" , "Reception" );
        addEmployee(15 , "Darryl Phillis" ,  "October 5, 1994" , "406-25-XXXX" , "$61,000.00" , "908 N Cayuga St Ithaca, New York(NY), 14850" , "Warehouse");
        addEmployee(16 , "David Wallis" , "June 30, 1965" , "195-10-XXXX" , "$52,000.00" , "947 Virginia Ave Lancaster, Pennsylvania(PA), 17603" , "Corporate" );
        addEmployee(17 , "Angela Martin" , "November 1, 1978" , "604-01-XXXX" , "$55,000.00" , "322 Schocopee Rd Milford, Pennsylvania(PA), 18337" , "Accounting" );
        addEmployee(18 , "Charles Minor" , "June 2, 1987" , "649-22-XXXX" , "$64,000.00" , "500 College Ave Swarthmore, Pennsylvania(PA), 19081" , "Corporate" );
        addEmployee(19 , "DeAngelo Vickers" , "December 30, 1991" , "401-70-XXXX" , "$62,000.00" , "568 Firethorn Dr Monroeville, Pennsylvania(PA), 15146" , "Management");
        addEmployee(20 , "Jan Levinson" , "December 5, 1975" , "530-90-XXXX" , "$68,000.00" , "1310 Adams Ave Scranton, Pennsylvania(PA), 18509" , "Corporate" );
        addEmployee(21 ,  "Erin Hannon" , "November 12, 1995" , "275-62-XXXX" , "$71,000.00" , "20 Princeton Ave Ridley Park, Pennsylvania(PA), 19078" , "Reception" );
        addEmployee(22 , "Phyllis Vance" , "December 31, 1970" , "515-25-XXXX" , "$72,000.00" , "109 Lantern Ln Lancaster, Pennsylvania(PA), 17602" , "Sales" );
        addEmployee(23 , "Jim Halpert" , "August 8, 1972" , "105-62-XXXX" , "$82,001.00" , "1302 Blue Mountain Dr Danielsville, Pennsylvania(PA), 18038" , "Sales" );
        addEmployee(24 , "Dwight Schrute" , "July 20, 1963" , "011-64-XXXX" , "$82,000.00" , "1302 Kennedy Dr Uniontown, Pennsylvania(PA), 15401" , "Sales");
   }
   
   StringBuilder printEmployeeList()
   {
        StringBuilder sb = new StringBuilder();
       
        for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
            sb.append(getMap().get(entry.getKey()).OutputEmployee());
}
        return sb;
   }


   
}
