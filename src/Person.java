import java.util.ArrayList;

public class Person {
	private String name;
	private int age;
	private ArrayList<Education> schools;
	private Job job;
	
	public Person()
	{
		this.name="";
		this.age=0;
		this.schools = new ArrayList<Education>();
		this.job = new Job();
	}
	
	public Person(String name, int age)
	{
		this.name=name;
		this.age=age;
		this.schools = new ArrayList<Education>();
		this.job = new Job();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<Education> getSchools() {
		return schools;
	}

	public void setSchoolHistory(ArrayList<Education> schools) 
	{
		this.schools = schools;
	}
	
	public void addSchool(Education school) 
	{
		this.schools.add(school);
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}
	
	public void setNewJob(String role, long salary, int id)
	{
		Job job = new Job(role, salary, id);
		this.job=job;
	}
	@Override
	public String toString()
	{
		String personInfo = this.name+": \n";
		//ArrayList<Education>edu = this.schools;
		for(int i =0;i<this.schools.size();i++)
		{
			personInfo+=this.schools.get(i)+"\n";
		}
		personInfo+=this.job;
		return personInfo;
	}
}
