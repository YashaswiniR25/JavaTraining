package com.EmployeeSalaryDetails;

public class Employee1 {
    private double basicsalary,HRA,SA,TA,incometax = 2500.00,netsalary;
	private int employeeid;
	private String empname;
	
    public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getBasicsalary() {
		return basicsalary;
	}
	public void setBasicsalary(double basicsalary) {
		this.basicsalary = basicsalary;
	}
	public void display(double basicsalary) {
	
		if(basicsalary<=10000) {
			HRA=0.2*basicsalary;
			SA=0.8*basicsalary;
			netsalary=basicsalary+HRA+SA+TA-incometax;
			System.out.println("NetSalary: "+netsalary);
		}
		else if(basicsalary>=10001 && basicsalary<=20000)
		{
			HRA=0.25*basicsalary;
			SA=0.9*basicsalary;
			netsalary=basicsalary+HRA+SA+TA-incometax;
			System.out.println("NetSalary: "+netsalary);
		}
		else if(basicsalary>20000)
		{
			HRA=0.3*basicsalary;
			SA=0.95*basicsalary;
			netsalary=basicsalary+HRA+SA+TA-incometax;
			System.out.println("NetSalary: "+netsalary);
		}
		
	}
}





