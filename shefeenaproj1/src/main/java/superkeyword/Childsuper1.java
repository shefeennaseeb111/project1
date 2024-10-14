package superkeyword;


public class Childsuper1 extends Parentsuper
{
	public Childsuper1()
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
		Childsuper1 s=new Childsuper1();
	}

}
