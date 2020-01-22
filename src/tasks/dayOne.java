package tasks;

import java.util.Scanner;

public class dayOne {

	public void task() {
		System.out.println("give me two number start and end");
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		
	//print in range and add sum	
		int i = start+1;
		int j = end;
		int res = 0;
		
		while(i < j ) {

			System.out.println(i);
			res+=i;
			i++;
			
		}
		System.out.println("The sum is " + res);
		
	}
	public class EmployeeDemo {
		
	}
	public class Employee {
		String name;
		String company;
		String location;
		public void setName(String name) {
			this.name = name;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public void sayHello() {
			System.out.println("Hi this is " + this.name);
		}
	}
}
