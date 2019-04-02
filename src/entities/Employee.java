package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public  double netSalary() {
		return 0;
	}
	public void increaseSalary(double percentage) {
		
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ grossSalary;
	}

}
