package capgexample;

public class student 
{
	String Name;
	int year;
	int no_of_Course;
	double GPA;

	public student(String name, int year, int no_of_Course, double gPA) {
		super();
		Name = name;
		this.year = year;
		this.no_of_Course = no_of_Course;
		GPA = gPA;
	}
	
	@Override
	public String toString() {
		return "student [Name=" + Name + ", year=" + year + ", no_of_Course=" + no_of_Course + ", GPA=" + GPA + "]";
	}

	public static void main(String[] args) 
	{
		student s1= new student("Freshman",1,2,95.8);
		student s2= new student("Sophomore",4,4,60.8);
		student s3= new student("Junior",6,6,70.8);
		student s4= new student("Senior",4,8,90.8);	
		System.out.println(s1+"\n"+s2+"\n"+s3+"\n"+s4);

	}

}
