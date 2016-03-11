
public class Job {
	
	private String role;
	private long salary;
	private int id;
	public Job()
	{
		this.role="";
		this.salary=0;
		this.id=0;
	}
	public Job(String role, long salary, int id)
	{
		this.role=role;
		this.salary=salary;
		this.id=id;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString()
	{
		String eduInfo = "Works as a "+this.role+" with a salary of "+this.salary+". Id is "+this.id;
		return eduInfo;
	}
}