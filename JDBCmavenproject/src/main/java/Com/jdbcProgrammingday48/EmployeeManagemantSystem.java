package Com.jdbcProgrammingday48;

import java.util.Scanner;

public class EmployeeManagemantSystem {
	public static void main(String[] args) {
	System.out.println("Welcome to employee management System.\n"
			+"Please Select the option to perform:\n"
			+"1.Add a new wmployee\n"
			+"2.View all the employees\n"
			+"3.View employee by id\n"
			+"4.Update the name of the employee\n"
			+"5.Update salary of all employees\n"
			+"6.Update the salary of specific employee\n"
			+"7.Update the phone number of employee\n"
			+"8.Update the email of the employee\n"
			+"9.Delete a specific employee\n"
			+"10.Terminate");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your choice: ");
	int choice=sc.nextInt();
	JDBCEmployeeOperation j=new JDBCEmployeeOperation();
	switch(choice) {
	case 1:
		j.insertEmployee();
		System.out.println("=====================");
		break;
	case 2:
		j.ViewEmployee();
		System.out.println("=====================");
		break;
	case 3:
		j.ViewAllEmployee();
		System.out.println("=====================");
		break;
		
	case 4:
		j.ViewSpecificEmployee();
		System.out.println("=====================");
		break;
		
	case 5:
		j.UpdateAllEmployeeSalary();
		System.out.println("=====================");
		break;
		
	case 6:
		j.UpdateSpecificEmployeeSalary();
		System.out.println("=====================");
		break;
		
	case 7:
		j.UpdateEmployeephone();
		System.out.println("=====================");
		break;
		
	case 8:
		j.UpdateEmployeeEmail();
		System.out.println("=====================");
		break;
		
	case 9:
		j.DeleteEmployee();
		System.out.println("=====================");
		break;
	case 10:
		System.out.println("ThankYou");
		System.exit(0);
		break;
	default:
		System.out.println("Wrong Choice.Please try Again");
		break;
		
		
	}
	main(null);
	}
}
