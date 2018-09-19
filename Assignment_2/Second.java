
public class Employee {
	String name;
	int age;
	double salary;
	double SSTax = 0;
	double insuranceCont = 0;
	double byPercent = 3;
	
	//Constructors
	public Employee(String name, int age, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	//Main method
	public static void main(String[] args) {
		Employee employee = new Employee("Charu",26,1000);
		Employee e1 = new Employee("Arya",9800.50);
		Employee e2 = new Employee("Divya",9100.50);
		Employee e3 = new Employee("Vineet",9500.50);
		employee.socialSecurityTax(employee);
		System.out.println("Social security tax of " +employee.name+ " is " +employee.SSTax);
		employee.insuranceCoverage(employee);
		System.out.println("Insurance coverage contribution of " +employee.name+ " is " +employee.insuranceCont);
		Employee.sortSalary(e1,e2,e3);
		System.out.println("Employee names after their salaries are sorted in ascending order: " +e1.name+ " " +e2.name+ " " +e3.name);
		employee.tripleSalary(employee);
		System.out.println(employee.name + "'s salary after raise is " +employee.salary);
	}
	
	//Setters and Getters
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSSTax(double SSTax) {
		this.SSTax = SSTax;
	}
	
	public double getSSTax() {
		return SSTax;
	}
	public void setInsuranceCont(double insuranceCont) {
		this.insuranceCont = insuranceCont;
	}
	
	public double getInsuranceCont() {
		return insuranceCont;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	/**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     */
    public double socialSecurityTax(Employee employee) {
    	if (salary <= 8900)
    	{
    		SSTax = 0.062 * salary;
    	}
    	else
    	{
    		SSTax = 0.062 * 106800;
    	}
    	return SSTax;   
    }
    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
    public double insuranceCoverage(Employee employee) {
    	if(age < 35)
    	{
    		insuranceCont = 0.03 * salary;
    	}
    	else if(age >= 35 && age <= 50)
    	{
    		insuranceCont = 0.04 * salary;
    	}
    	else if(age > 50 && age < 60)
    	{
    		insuranceCont = 0.05 * salary;
    	}
    	else
    	{
    		insuranceCont = 0.06 * salary;
    	}
    	return insuranceCont;
    }
    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     */
    public static void sortSalary(Employee e1, Employee e2, Employee e3) {
       for(int count = 0;count <=3;count++)
       {
    	   double temp = 0;
    	   String tempName = "";
    	   if(e1.salary > e2.salary)
    	   {
    		   temp = e1.salary;
    		   e1.salary = e2.salary;
    		   e2.salary = temp;
    		   tempName = e1.name;
    		   e1.name = e2.name;
    		   e2.name = tempName;
    	   }
    	   if(e2.salary > e3.salary)
    	   {
    		   temp = e2.salary;
    		   e2.salary = e3.salary;
    		   e3.salary = temp;
    		   tempName = e2.name;
    		   e2.name = e3.name;
    		   e3.name = tempName;
    	   }
    	   if(e2.salary > e3.salary)
    	   {
    		   temp = e2.salary;
    		   e2.salary = e3.salary;
    		   e3.salary = temp;
    		   tempName = e2.name;
    		   e2.name = e3.name;
    		   e3.name = tempName;
    	   }
       }
    }
    /**
     * Write a method to raise an employee's salary to three times of his/her original salary.
     * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
     * Do not change the input of this method.
     * Try to add a new method in Employee class: public void raiseSalary(double byPercent)
     */
    public void tripleSalary(Employee employee) {
    	employee.raiseSalary(byPercent);
    }
    public void raiseSalary(double byPercent) {
		salary = byPercent * salary;
	}
}
