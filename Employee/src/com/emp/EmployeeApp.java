package com.emp;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee e = new Employee();
       /*e.empId = 123;
        e.firstName = "Tilak";
        e.lastName = "Kumar";
        e.email = "tilak@example.com";
        e.phoneNumber = "9876543210";
        e.hireDate = "2024-02-20";
        e.jobTitle = "Software Engineer";
        e.salary = 50000.00;*/
        
       /*e.empId = 124;
        e.firstName = "Keshav";
        e.lastName = "Gowda S P";
        e.email = "keshavgowdasp@gamil.com";
        e.phoneNumber = "6362242228";
        e.hireDate = "2024-01-15";
        e.jobTitle = "Developer";
        e.salary = 60000.00;*/
        
     /* e.empId = 125;
        e.firstName = "Rohan";
        e.lastName = "J S";
        e.email = "rohanshekar@example.com";
        e.phoneNumber = "6364735336";
        e.hireDate = "2023-12-25";
        e.jobTitle = "Software Developer";
        e.salary = 65000.00;*/
        
      /*e.empId = 126;
        e.firstName = "Akshay";
        e.lastName = "J k";
        e.email = "Akshay@gmail.com";
        e.phoneNumber = "9986980757";
        e.hireDate = "2023-11-26";
        e.jobTitle = "Software Testing";
        e.salary = 52000.00;*/
        
     /* e.empId = 127;
        e.firstName = "Naveen";
        e.lastName = "Kumar";
        e.email = "Naveenkumar@gmail.com";
        e.phoneNumber = "7795029055";
        e.hireDate = "2023-10-18";
        e.jobTitle = "Cloud Engineer";
        e.salary = 65000.00;*/





        HibernateManager hbm = new HibernateManager();

//        hbm.saveEmployee(e);

        hbm.fetchAllData();

//        hbm.fetchSpecific(3);

//        hbm.updateSpecific(3, "Dushyanth");
//        hbm.fetchAllData();

//        hbm.deleteSpecific(2);
        
//        hbm.fetchAllData();
    }
}
