package OopAbstract;

public class Salary extends Employee{
	
	double salary;
	
	 Salary(String name,String address,int number,double salary) {
		// TODO Auto-generated constructor stub
		 super(name, address, number);
//		 this.salary=salary;
		 setSalary(salary);
	}
	 
	 public void setSalary(double salary) {
		 if (salary>=0.0) {
			this.salary=salary;
		}
	 }
	 
	 public double getSalary() {
		 return this.salary;
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public double computePay() {
		// TODO Auto-generated method stub
		
		System.out.println("Employee name: "+getName());
		double result=salary/52;
		return result;
	}

}
