import java.lang.*;

public class Shape
{
	double x;
	public Shape()
	{
		System.out.println("This is empty for Shape!!");
	} 
	public Shape(double x)
	{
		System.out.println("This is parameterized for Shape!!");
		this.x = x;
	}
	public void setX(double x)
	{
		this.x = x;
	}
	public double getX()
	{
		return x;
	}
	public double getArea()
	{
		return -99999.9999;
	}
}
