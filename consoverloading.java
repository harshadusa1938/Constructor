package constructor;

public class consoverloading 
{
	int id;
	String name;
	String city;
	
	consoverloading(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	consoverloading(int id, String name, String city)
	{
		this.id=id;
		this.name=name;
		this.city=city;
	}
	
	void show()
	{
		//System.out.println(id+" "+name+" "+city);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		consoverloading c1=new consoverloading(101,"Harshad");
		consoverloading c2=new consoverloading(102,"Rahul","Mumbai");
		consoverloading c3=new consoverloading(103,"Mahesh");
		
		System.out.println(c1.id+" "+c1.name);
		System.out.println(c2.id+" "+c2.name+" "+c2.city);
		System.out.println(c3.id+" "+c3.name);
		/*c1.show();
		c2.show();
		c3.show();
*/	}

}
