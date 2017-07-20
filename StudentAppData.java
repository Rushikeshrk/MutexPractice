import java.io.*;
import java.lang.*;
class StudentAppData
{
	//private String name;
	
 private StudentAppData()
	{
		System.out.println("Student Details:-");

	}
	public static StudentAppData hello()
	{
		return new StudentAppData();
	}	
	public void print()
	{
		System.out.println("Hello");
	}
}

