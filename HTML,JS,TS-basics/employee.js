class Employee{
    constructor(companyName){
        this.companyName = "Cognizant"
    }
}

class Developers extends Employee{
    constructor(empname, Ex, dept, position, joiningdate, location, emailid, empid, salary){
        super();
        this.empname = empname;
        this.Ex = Ex;
        this.dept = dept;
        this.position = position;
        this.joiningdate = joiningdate;
        this.location = location;
        this.emailid = emailid;
        this.empid = empid;
        this.salary = salary;
    }
}

class HR extends Employee{
    constructor(empname, Ex, dept, position, joiningdate, location, emailid, empid, salary){
        super();
        this.empname = empname;
        this.Ex = Ex;
        this.dept = dept;
        this.position = position;
        this.joiningdate = joiningdate;
        this.location = location;
        this.emailid = emailid;
        this.empid = empid;
        this.salary = salary;
    }
}
class Finance extends Employee{
    constructor(empname, Ex, dept, position, joiningdate, location, emailid, empid, salary){
        super();
        this.empname = empname;
        this.Ex = Ex;
        this.dept = dept;
        this.position = position;
        this.joiningdate = joiningdate;
        this.location = location;
        this.emailid = emailid;
        this.empid = empid;
        this.salary = salary;
    }
}
class Sales extends Employee{
    constructor(empname, Ex, dept, position, joiningdate, location, emailid, empid, salary){
        super();
        this.empname = empname;
        this.Ex = Ex;
        this.dept = dept;
        this.position = position;
        this.joiningdate = joiningdate;
        this.location = location;
        this.emailid = emailid;
        this.empid = empid;
        this.salary = salary;
    }
}
class Marketing extends Employee{
    constructor(empname, Ex, dept, position, joiningdate, location, emailid, empid, salary){
        super();
        this.empname = empname;
        this.Ex = Ex;
        this.dept = dept;
        this.position = position;
        this.joiningdate = joiningdate;
        this.location = location;
        this.emailid = emailid;
        this.empid = empid;
        this.salary = salary;
    }
}
class QA extends Employee{
    constructor(empname, Ex, dept, position, joiningdate, location, emailid, empid, salary){
        super();
        this.empname = empname;
        this.Ex = Ex;
        this.dept = dept;
        this.position = position;
        this.joiningdate = joiningdate;
        this.location = location;
        this.emailid = emailid;
        this.empid = empid;
        this.salary = salary;
    }
}


let dev = new Developers("ABC", "No", "FSE", "A", "16", "Pune1", "abc@com",1, 1000);
console.log(dev.companyName+" "+dev.empname+ " "+dev.Ex+ " "+dev.dept+" "+dev.position+" "+dev.joiningdate+" "+dev.location+" "+dev.emailid+" "+dev.empid+ " "+dev.salary);

let hr = new HR("DEF", "No", "HumanResource", "B", "17", "Pune2", "def@com",2, 2000);
console.log(hr.companyName+" "+hr.empname+ " "+hr.Ex+ " "+hr.dept+" "+hr.position+" "+hr.joiningdate+" "+hr.location+" "+hr.emailid+" "+hr.empid+ " "+hr.salary);

let finance = new Finance("GHI", "Yes", "Finance", "C", "18", "Pune3", "ghI@com",3, 3000);
console.log(finance.companyName+" "+finance.empname+ " "+finance.Ex+ " "+finance.dept+" "+finance.position+" "+finance.joiningdate+" "+finance.location+" "+finance.emailid+" "+finance.empid+ " "+finance.salary);

let sales = new Sales("JKL", "Yes", "Sales", "SalesExecutive", "19", "Pune4", "jkl@com",4, 4000);
console.log(sales.companyName+" "+sales.empname+ " "+sales.Ex+ " "+sales.dept+" "+sales.position+" "+sales.joiningdate+" "+sales.location+" "+sales.emailid+" "+sales.empid+ " "+sales.salary);

let mark = new Marketing("MNO", "No", "Marketing", "Marketing Engineer", "20", "Pune5", "mno@com",5, 5000);
console.log(mark.companyName+" "+mark.empname+ " "+mark.Ex+ " "+mark.dept+" "+mark.position+" "+mark.joiningdate+" "+mark.location+" "+mark.emailid+" "+mark.empid+ " "+mark.salary);

let qa = new QA("PQR", "No", "Quality", "Quality Engineer", "21", "Pune6", "pqr@com",7, 6000);
console.log(qa.companyName+" "+qa.empname+ " "+qa.Ex+ " "+qa.dept+" "+qa.position+" "+qa.joiningdate+" "+qa.location+" "+qa.emailid+" "+qa.empid+ " "+qa.salary);