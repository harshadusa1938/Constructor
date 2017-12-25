package constructor;

public class Gradebook 
{

	private int id;
	private String name;
	
	Gradebook(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	void show()
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Gradebook gd1 = new Gradebook(101, "Java");
		Gradebook gd2 = new Gradebook(102, "UDI");
		Gradebook gd3 = new Gradebook(102, "Data Communication");
		
		gd1.show();
		gd2.show();
		gd3.show();
		
	}
}