package superkeyword;

public class Childsuper extends Parentsuper
{
	public Childsuper()
	{
		super();
		int d=a-b;
		System.out.println(d);
		System.out.println(super.a);
		System.out.println(super.b);
		super.dislay();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childsuper s=new Childsuper();
	}

}
