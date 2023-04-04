import java.io.*;

public class SerializeDemo
{
	public static void main(String[] args)
	{
		Employee e = new Employee();
		e.name = "Dominic Li";
		e.address = "Shenzhen Guangdong, China";
		e.SSN = 11223344;
		e.number = 101;
		try
		{
			FileOutputStream fileOut = new FileOutputStream("/tmp/employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in /tem/employee.ser");
		}catch(IOException i)
		{
			i.printStackTrace();
		}
	}
}
