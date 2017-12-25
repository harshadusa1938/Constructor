package constructor;

public class Gradebook1
{
	private String name;
	private String professor_name;
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getProfessor_name()
	{
		return professor_name;
	}

	public void setProfessor_name(String professor_name)
	{
		this.professor_name = professor_name;
	}
	
	public Gradebook1(String name, String professor_name) 
	{
		
	}

	public static void main(String[] args)
	{
		Gradebook1 gd= new Gradebook1("Java","Prof. Mukhtar Rana");
		gd.setName("Java");
		gd.setProfessor_name("Prof Mukhatar Sir");
		System.out.println(gd.getName());
		System.out.println(gd.professor_name);
		
		
		//Gradebook1 gd1= new Gradebook1("UDI", "Prof. Rana");
		
	}
}
