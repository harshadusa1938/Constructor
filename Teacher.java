package constructor;

public class Teacher 
{
	public static void main(String[] args)
	{
		Student s1=new Student(101,"Harshad");
		Student s2=new Student(102, "Asha");
		Student s3=new Student(103, "Rahul");
			
		System.out.println(s1.id+s1.name);
		System.out.println(s2.id+s2.name);
		System.out.println(s3.id+s3.name);
		
	}
}
