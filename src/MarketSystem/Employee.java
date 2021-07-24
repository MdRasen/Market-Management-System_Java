package MarketSystem;

public class Employee {
	private String ename;
	private String eID;
	private String edepartment;    //Encapsulation being used
	private double esalary;
	private double ejd;
	private double elockers;
	
	public void setename(String ename) {
		this.ename = ename;    // Employee name 
	}
	
	public void seteId(String eID) {
		this.eID = eID;       // Employee ID
	}

	public void setdepartment(String edepartment) {
		this.edepartment = edepartment;         // Employee Department or post
	}
	
	public void setesalary(double esalary) {
		this.esalary = esalary;      // Employee salary ( bonus or fine all incharge)
	}
	
	public void setejd(double ejd) {
		this.ejd = ejd;           // Employee joining date 
	}
	
	public void seterevenue(double erevenue) {
		this.elockers = elockers;     // Employees counter or lockers 
	}
		
	
	public String getename() {
		return ename;
	}
	
	public String geteID() {
		return eID;
	}
	
	public String getedepartment() {
		return edepartment;
	} 
	public double getesalary() {
		return esalary;
	} 
	
	public double getebonus() {
		return ejd;
	} 
	
	public double getefine() {
		return elockers;
	} 
	

}
