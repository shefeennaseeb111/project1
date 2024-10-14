package aggregation;

public class Address {
	Student Agg;
	String House;
	String place;
	public Address(Student Agg,String House,String place)
	{
		this.Agg=Agg;
		this.House=House;
		this.place=place;
	}
	public void display()
	{
		System.out.println(Agg.name);
		System.out.println(Agg.rollno);
		System.out.println(House);
		System.out.println(place);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student o=new Student("Shefeena",18);
		Address o1=new Address(o,"Mangattu","Kothamangalam");
		o1.display();
		
		
	}

}
