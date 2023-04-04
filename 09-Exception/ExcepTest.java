import java.io.*;
public class ExcepTest{
 
   public static void main(String args[]){
      try{
         int a[] = new int[2];
         System.out.println("Access element three :" + a[3]);
      }catch(ArrayIndexOutOfBoundsException e){
         System.out.println("Exception thrown  :" + e);
      }
      System.out.println("Out of the block");



	public void readFile(String filePath) throws IOException {
  	BufferedReader reader = new BufferedReader(new FileReader(filePath));
  	String line = reader.readLine();
  	while (line != null) {
    		System.out.println(line);
    		line = reader.readLine();
  	}
  		reader.close();
	}



   }
}
