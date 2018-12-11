package dundermifflin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rebecca
 */
public class MakeItWork 
{
   
    public MakeItWork()
    {
//        StringBuilder output = new StringBuilder();
//            output.append("       .-\"\"-. \n")
//                  .append("      / _  _ \\\n")
//                  .append("      |(_)(_)|\n")
//                  .append("      (_ /\\ _)\n")
//                  .append("       |wwww| \n")
//                  .append("       \'-..-\' \n")
//                  .append("/--------||--------\\");
//        FrameMaker frame1 = new FrameMaker("dwightsalute.gif", "Welcome, what is your name?",true);
//        FrameMaker frame2 = new FrameMaker("dwightcreepysmile.gif", "Hello, " + frame1.getUserInput() + "!",false);
//        FrameMaker frame3 = new FrameMaker(output);
        
//        Company c = new Company();
//        c.printDepartmentList();
//        c.departments.get(0).printEmployeeList();
//        c.search_For_Dept();
//        c.search_For_Dept();
//        c.search_For_Dept();
//        c.search_For_Dept();
        
        
        //VARIABLES//
        String fullName;
        String birthday;
        String ssn;
        String address;
        String salary;
        String deptString;
        Integer dept = 0;
        
        
        //PROGRAM//
        FrameMaker welcome1 = new FrameMaker("dundermifflin.png");
//        Welcome to dunder mifflin, enter your full name
        FrameMaker welcome2 = new FrameMaker("entireoffice.jpg","Welcome to Dunder Mifflin Paper Company!\n\nWhat is your name?\n(full name)",true);
        fullName = welcome2.getUserInput();
        System.out.println(fullName);
//        Greeting from michael (greets with name)
        FrameMaker michaelHello = new FrameMaker("michaelbow.gif","Hello, " + fullName + "! I'm Michael Scott, Regional Manager. ", false);
        FrameMaker michaelJob = new FrameMaker("prison mike.png","So I heard you're interested in a job.\n\nI'll let Dwight, Assistant to the Regional Manager, take it from here.\n\n\"Dwight! We got a new employee!\"",false);
//        Dwight does the filling out the paper work, enter birthday
        FrameMaker dwight = new FrameMaker("dwight.jpg","Good Morning, " + fullName + ".\n\nI'm Dwight Schrute, Assistant Regional Manager.\n\nLet's begin with some information we need. What is your birthday?\n(Month DD, YYYY)", true);
        birthday = dwight.getUserInput();
        System.out.println(birthday);
//        Enter ssn
        FrameMaker dwightSSN = new FrameMaker("dwightexcitedtime.gif", "Okay. What is your Social Security Number?\n(XXX-XX-XXXX)", true);
        ssn = dwightSSN.getUserInput();
        System.out.println(ssn);
//        Toby enters
        FrameMaker toby = new FrameMaker("tobywasnti.gif","Wait, Dwight.\nI'm in Human Resources.\n\nI should be doing this...",false);
//        Michael screams at Toby
        FrameMaker michaelScreams = new FrameMaker("michaelno.gif","Toby! Nooo!\nShut up!!\nJust stop!\nGo away!!!",false);
//        Address
        FrameMaker dwightAdd = new FrameMaker("dwightmask.gif", "Sorry about Toby.\nSo inappropriate.\n\nAnyways, what is your address?", true);
        address = dwightAdd.getUserInput();
        System.out.println(address);
//        FrameMaker = new FrameMaker("");
//        What department do you want to work in?
        StringBuilder depts = new StringBuilder("Alright, so here are our departments:\n\n")
            .append(" 1. Sales\n")
            .append(" 2. Corporate\n")
            .append(" 3. Management\n")
            .append(" 4. Human Resources\n")
            .append(" 5. Customer Service\n")
            .append(" 6. Quality Assurance\n")
            .append(" 7. Warehouse\n")
            .append(" 8. Accounting\n")
            .append(" 9. Supply Relations\n")
            .append("10. Reception\n\n")
            .append("Remember the number of the department where you'd like to work at!");    
        FrameMaker dwightDeptList = new FrameMaker(depts);
        FrameMaker dwightDept = new FrameMaker("dwighttriumph.gif", "So what department do you want to work at?\n\nPick wisely.", true);
        deptString = dwightDept.getUserInput();
        if (!deptString.equals(""))
            dept = Integer.parseInt(deptString);
        System.out.println(dept);
//        How much do you want to make a year?
        FrameMaker dwightSal = new FrameMaker("dwightcreepysmile.gif", "Excellent choice.\n\nHow much would you like to make a year?\n($XX,XXX.XX)", true);
        salary = dwightSal.getUserInput();
        System.out.println(salary);
//        Department is displayed with all employees
//
//        Other characters pop in every now and then
//        Ryan asks if you’re single
//        Kelly if you like shopping
//        Meridith about gift cards to steakhouse in trade of discounts
//        Toby asking if he should be doing the hiring process but then being interrupted by michael
//        Jim asks you to help with a prank on dwight (pam’s involved somehow)
//        Creed is introduced
//        Stanley
//        Go back to michael calls a conference
//        End with jim doing the prank you helped him with

    
    }
    
    
}
