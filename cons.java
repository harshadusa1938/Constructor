package constructor;

public class cons 
{

	int id;
	String name;
	String city;
	String Address;
	String phone_no;
	
	cons(int id, String name, String city, String Address, String phone_no)
	{
		this.id=id;
		this.name=name;
		this.city=city;
		this.Address=Address;
		this.phone_no=phone_no;
	}
	
	void show()
	{
		//System.out.println(id+" "+name);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		cons c1 = new cons(101, "Dhaval","Albany","1343- Central Ave","518-482-9200");
		cons c2 = new cons(102, "ABC","Troy","465-Hamilton Street","518-898-1701");
		
		System.out.println(c1.id+" "+c1.name+" "+c1.city +" "+c1.Address+" "+c1.phone_no);
		System.out.println(c2.id+" "+c2.name+" "+c2.city+" "+c2.Address+" "+c2.phone_no);
		//c1.show();
		//c2.show();
		
	}
}