public class Employee {
	
	protected String name;
	protected double salary;
	protected String birthDate;
	
	public Employee() 
	{
		this.name = null;
		this.salary = 0;
		this.birthDate = null;
	}
	
	public Employee(String Name, double Salary, String DOB)
	{
		this.name = Name;
		this.salary = Salary;
		this.birthDate = DOB;
	}
	
	public String getDetails()
	{
		String Details = (""+ this.name+" " + this.salary+ " " + this.birthDate);
		System.out.println(Details);
		return Details;
	}
}
