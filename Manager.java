
public class Manager extends Employee {
	public String department;
	
	public Manager()
	{
		this.department = null;
	}
	
	public Manager(String Name, double Salary, String DateOfBirth,String Department)
	{
		super(Name, Salary, DateOfBirth);
		this.department = Department;
	}
	
	public String getDetails() {
		String Details = (""+ this.name+" " + this.salary+ " " + this.birthDate + " " +this.department);
		System.out.println(Details);
		return Details;
	}
}
