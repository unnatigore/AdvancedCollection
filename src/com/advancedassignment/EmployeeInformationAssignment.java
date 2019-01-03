package com.advancedassignment;

public class EmployeeInformationAssignment {
	private int employeeID;
	private String employeeName;
	private String designation;
	private double employeeSalary;
	private double employeeCommission;
	
	public EmployeeInformationAssignment(int employeeID, String employeeName,
			String designation, double employeeSalary, double employeeCommission) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.designation = designation;
		this.employeeSalary = employeeSalary;
		this.employeeCommission = employeeCommission;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public double getEmployeeCommission() {
		return employeeCommission;
	}

	public void setEmployeeCommission(double employeeCommission) {
		this.employeeCommission = employeeCommission;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((designation == null) ? 0 : designation.hashCode());
		long temp;
		temp = Double.doubleToLongBits(employeeCommission);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + employeeID;
		result = prime * result
				+ ((employeeName == null) ? 0 : employeeName.hashCode());
		temp = Double.doubleToLongBits(employeeSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeInformationAssignment other = (EmployeeInformationAssignment) obj;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (Double.doubleToLongBits(employeeCommission) != Double
				.doubleToLongBits(other.employeeCommission))
			return false;
		if (employeeID != other.employeeID)
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (Double.doubleToLongBits(employeeSalary) != Double
				.doubleToLongBits(other.employeeSalary))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EmployeeInformationAssignment [employeeID=" + employeeID
				+ ", employeeName=" + employeeName + ", designation="
				+ designation + ", employeeSalary=" + employeeSalary
				+ ", employeeCommission=" + employeeCommission + "]";
	}
	
	
	
	
}
