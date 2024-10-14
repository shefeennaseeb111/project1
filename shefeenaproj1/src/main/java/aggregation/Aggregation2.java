package aggregation;

public class Aggregation2 {
	
	Aggregation1 Agg;
	String place;
	public Aggregation2(Aggregation1 Agg,String place)
	{
		this.Agg=Agg;
		this.place=place;
	}
	public void display()
	{
		System.out.println(Agg.name);
		System.out.println(Agg.id);
		System.out.println(place);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Aggregation1 objparent=new Aggregation1("Shefeena",3);
		Aggregation2 obj1=new Aggregation2(objparent,"Kattappana");
		obj1.display();
		
	}

}
