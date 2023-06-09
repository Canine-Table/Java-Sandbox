package myStore;

/** @author Table */

import java.util.Scanner;
import java.util.ArrayList;

public class Employees extends Person {

	static ArrayList<ArrayList<Employees>> employees = new ArrayList<ArrayList<Employees>>();
	static ArrayList<Employees> employee = new ArrayList<Employees>();
	private int employeeNumber;
	private double numHours;
	private double hourlyPay;
	static private String storeName;
	public Employees(String firstName, String lastName, int phoneNumber, String emailAddress, int employeeNumber, double numHours, double hourlyPay) {
		super(firstName, lastName, phoneNumber, emailAddress);
		this.employeeNumber = employeeNumber;
		this.numHours = numHours;
		this.hourlyPay = hourlyPay;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public static void readEmployeeDetails() {
		String border = "=======================================================================================";
		System.out.println(border);
		System.out.printf("| %-84s|%n","Store Name: "+storeName);
		System.out.println(border);
		System.out.printf("| %-14s | %-14s | %-14s | %-14s | %-14s  |%n","Emp#","Name","Email","Phone","Salary");
		System.out.println(border);
		for(int i=0;i<employees.size();i++) {
				for( Employees  j : employees.get(i)) {
					System.out.printf("| %-14d | %-14s | %-14s | %-14d | $%-14.2f |%n",
							j.getEmployeeNumber(),
							j.getName(),
							j.getEmailAddress(),
							j.getPhoneNumber(),
							j.calculateSalary(j.numHours,j.hourlyPay)
							);
				}
		}

		System.out.println(border);
	}

	public double calculateSalary(double numHours,double hourlyPay) {
		return numHours * hourlyPay;
	}

	public static void main(String[] args) {
			try ( Scanner scanner = new Scanner(System.in) ) {
					System.out.print("Enter name of the store: ");
					storeName = scanner.nextLine();
					
					System.out.print("How many employees do you have: ");
					int employeeCount = scanner.nextInt();
					scanner.nextLine();
					
					for (int i=1; i<=employeeCount;i++) {
						employee.clear();
						System.out.print("Enter details for employee "+i+".\n");

						System.out.print("Enter Employee Number: ");						
						int employeeNumber = scanner.nextInt();
						scanner.nextLine();
						
						System.out.print("Enter first name: ");
						String firstName = scanner.nextLine();
						
						System.out.print("Enter last name: ");
						String lastName = scanner.nextLine();
						
						System.out.print("Enter email: ");
						String emailAddress = scanner.nextLine();

						System.out.print("Enter phone number: ");						
						int phoneNumber = scanner.nextInt();
						scanner.nextLine();

						System.out.print("Enter number of hours worked: ");						
						double numHours = scanner.nextDouble();
						scanner.nextLine();

						System.out.print("Enter hourly pay: ");						
						double hourlyPay = scanner.nextDouble();
						scanner.nextLine();
						
						Employees emp = new Employees(firstName,lastName,phoneNumber,emailAddress,employeeNumber,numHours,hourlyPay);
						employee.add(emp);
						employees.add(employee);
					}
					scanner.close();
					readEmployeeDetails();
			} catch (Exception e) {
				System.out.println("Exception Caught: "+e.getMessage());
			}
	}
}
