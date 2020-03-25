package com.Kr;

public class Main {

    public static void main(String[] args) {
	 Manager manager1=new Manager(1,"M1","m1",1300);
	 Manager manager2=new Manager(2,"M2","m2",2000);
	 Manager manager3=new Manager(3,"M3","m3",65866);
	 Manager manager4=new Manager(4,"M4","m4",6978,manager3,300);
	 Manager manager5=new Manager(5,"M5","m5",1000,manager4);
	 Manager manager6=new Manager(6,"M6","m6",6978,manager5,750);


	 Employee employee1=new Employee(1,"E1","e1",5867,manager2);
	 Employee employee2=new Employee(2,"E2","e2",5000,manager2);
	 Employee employee3=new Employee(3,"E3","e3",4500,manager1);
	 Employee employee4=new Employee(4,"E4","e4",2000,manager6);

	 System.out.println(manager4.toString());
	 System.out.println(employee2.toString());
	 System.out.println(manager3.getNameManager());
    }
}
