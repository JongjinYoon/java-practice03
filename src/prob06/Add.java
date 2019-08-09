package prob06;

public class Add {
	private int a;
	private int b;
	void setValue(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
	}
	public void calculate()
	{
		System.out.println(a+b);
	}

}
