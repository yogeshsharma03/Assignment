package pkg1;

public class Asignment 
{
	int age;
	int rollNo;
	public void Display1()
	{
		System.out.println("Welcome to All of you.");
	}
	public void Display2()
	{
		System.out.println("Automation is very easy.");
	}
	public static void main(String[] args)
	{
		Asignment as = new Asignment();
		as.age=32;
		as.rollNo=56;
		System.out.println("age is = "+as.age);
		System.out.println("Roll No = "+as.rollNo);
		as.Display1();
		as.Display2();
		// TODO Auto-generated method stub

	}

}
