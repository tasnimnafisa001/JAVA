import java.lang.*;

public class Square extends Shape
{
	public Square()
	{
		System.out.println("this is empty for Square!!");
	}
	public Square(double x)
	{
		super(x);
		System.out.println("this is Parameterized for Square!!");
	}
	public double getArea()
	{
		return x*x;         //method overrriding
	}

}