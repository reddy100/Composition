import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person bobby = new Person("Bobby", 46);
		Person abishek = new Person("abishek", 23);
		Person dave = new Person("dave", 32);
		Person jessica = new Person("jessica", 98);
		Education middleSchool = new Education("Great Falls Middle School", 1984);
		Education highSchool = new Education("Arlington High School", 1984);
		Education elementarySchool = new Education("Rockville Elementary School", 1984);
		Education college = new Education("University of Illinois", 2010);
		Education mastersCollege = new Education("Stanford", 2006);
		Education highSchool2 = new Education("Great Falls Middle School", 2006);
		Job systemsEngineer = new Job("Systems Engineer", 100000L, 198);
		Job softwareDeveloper = new Job("Software Developer", 105000L, 4098);
		Job projectManager = new Job("Project Manager", 130000L, 2938);
		Job vicePresident = new Job("Vice President", 350000L, 12);
		

		bobby.addSchool(highSchool);
		bobby.setJob(systemsEngineer);
		
		ArrayList<Education> history1= new ArrayList<Education>();
		history1.add(elementarySchool);history1.add(highSchool);history1.add(college);
		abishek.setSchoolHistory(history1);
		abishek.setJob(vicePresident);
		
		
		
		print(bobby.toString());
		print(abishek.toString());
	}
	 public static void print(String a)
	 {
		 System.out.println(a);
	 }

}
