
public class Education {
	private String name;
	private int year;
	public Education()
	{
		this.name="";
		this.year=0;
	}
	public Education(String name, int year)
	{
		this.name=name;
		this.year=year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString()
	{
		String eduInfo = "Attended "+this.name+" school in "+this.year;
		return eduInfo;
	}
}
