package dundermifflin;


public class Employee 
{
    private Integer Employee_ID;
    private String Employee_Name;
    private String Employee_Bday;
    private String Employee_SS;
    private String Employee_Salary;
    private String Employee_Address;
    private Department Dept_Name;
    
    Employee(Integer id,  String name, String bday, String ss,  String salary,  String address) // pass dept
    {
        Employee_ID = id;
        Employee_Name = name;
        Employee_Bday = bday;
        Employee_SS = ss;
        Employee_Salary  = salary;
         Employee_Address = address;
        //Dept_Name = dpt;
        
    }
   void add_Employee(Integer id, String name, String bday, String ss, String salary, String address)  //pass dept
   {
       setEmployee_ID(id);
       setEmployee_Name(name);
       setEmployee_Bday(bday);
       setEmployee_SS(ss);
       setEmployee_Salary(salary);
       setEmployee_Address(address);
       //setDept_Name(dpt);
       
   }
   
   @Override
    public String toString()
   {
       return ("ID" + getEmployee_ID() + 
                        "\nName: " + getEmployee_Name() + 
                        "\nDOB: " + getEmployee_Bday() + 
                        "\nSS#: " + getEmployee_SS() + 
                        "\n$" + getEmployee_Salary() +
                        "\nAddress: " + getEmployee_Address()
                        );
   }
   
   
    public Integer getEmployee_ID() {
        return Employee_ID;
    }

    public void setEmployee_ID(Integer Employee_ID) {
        this.Employee_ID = Employee_ID;
    }

    public String getEmployee_Name() {
        return Employee_Name;
    }

    public void setEmployee_Name(String Employee_Name) {
        this.Employee_Name = Employee_Name;
    }

    public String getEmployee_Bday() {
        return Employee_Bday;
    }

    public void setEmployee_Bday(String Employee_Bday) {
        this.Employee_Bday = Employee_Bday;
    }

    public String getEmployee_SS() {
        return Employee_SS;
    }

    public void setEmployee_SS(String Employee_SS) {
        this.Employee_SS = Employee_SS;
    }

    public String getEmployee_Salary() {
        return Employee_Salary;
    }

    public void setEmployee_Salary(String Employee_Salary) {
        this.Employee_Salary = Employee_Salary;
    }

    public String getEmployee_Address() {
        return Employee_Address;
    }

    public void setEmployee_Address(String Employee_Address) {
        this.Employee_Address = Employee_Address;
    }

    public Department getDept_Name() {
        return Dept_Name;
    }

    public void setDept_Name(Department Dept_Name) {
        this.Dept_Name = Dept_Name;
    }   
    
}
