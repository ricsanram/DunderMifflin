package dundermifflin;

/*
    Controls the entire program!
 */

public class MakeItWork 
{
   
    public MakeItWork()
    {
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
        FrameMaker michaelJob = new FrameMaker("prison mike.png","So I heard you're interested in a job.\nI'll let Dwight, Assistant to the Regional Manager, take it from here.\n\"Dwight! We got a new employee!\"",false);
//      Meridith
        FrameMaker mer = new FrameMaker("meridithfreshmeat.gif");
//        Stanley
        FrameMaker stan = new FrameMaker("stanleydoesntcare.gif");
//        Dwight does the filling out the paper work, enter birthday
        FrameMaker dwight = new FrameMaker("dwight.jpg","Good Morning, " + fullName + ".\n\nI'm Dwight Schrute, Assistant Regional Manager.\n\nLet's begin with some information we need. What is your birthday?\n(Month DD, YYYY)", true);
        birthday = dwight.getUserInput();
        System.out.println(birthday);
//      jim invites to prank, and pam
        FrameMaker jimasks = new FrameMaker("jimneedshelp.gif","Hi, sorry, want to help me out with a prank after you're done?\n\nDon't tell Pam. She ruins pranks.",false);
        FrameMaker pam = new FrameMaker("pam.gif");
//        Enter ssn
        FrameMaker dwightSSN = new FrameMaker("dwightrolleye.gif", "Leave, Jim!\n\nAnyways, what is your Social Security Number?\n(XXX-XX-XXXX)", true);
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
//        Kelly threat
        FrameMaker kell = new FrameMaker("kellywhatever.gif","Hi! I don't know who you are but you better stay away from Ryan!",false);
        
//        What department do you want to work in?
        StringBuilder depts = new StringBuilder("Ignore Kelly.\n\nAlright, so here are our departments:\n\n")
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
            .append("(Remember the number of the department you'd like to work at)");    
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
        Company dm = new Company();
//      You are added to the employee list
        if (dept != 0)
            dm.departments.get(dept-1).addNewEmployee(fullName, birthday, ssn, salary, address);
//      Dept Employee list is shown
        StringBuilder compEmpList = new StringBuilder();
        compEmpList.append(dm.search_For_Dept(dept));
        FrameMaker deptFrame = new FrameMaker(compEmpList);
        FrameMaker dwightSalute = new FrameMaker("dwightsalute.gif","Welcome, "+ fullName +".\n\nI salute you!",false);
//      Jim finally pranks
        FrameMaker jimJazz = new FrameMaker("jimjazz.gif","It's prank time.\n\nThanks for helping me!",false);
        FrameMaker jimPrank = new FrameMaker("jimprank.gif","\"Merry Christmas, Dwight!\"\n-Love, Jim.\n\n",false);
        FrameMaker dwightScream = new FrameMaker("dwightscream.gif");
        //Michael final
        FrameMaker mikeBye = new FrameMaker("michaelregret.gif","It's not usually like this. You're going to love it here.\n\nWelcome to Dunder Mifflin!",false);
        //FIN
        FrameMaker fin = new FrameMaker("worldbestbossmug.png");
    
    }
    
    
}
