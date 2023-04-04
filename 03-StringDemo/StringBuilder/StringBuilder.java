public class StringBuilder {
	public static void main(String args[]) {
		StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
		sBuffer.append("www");
		sBuffer.append(".runoob.");
		sBuffer.append("com");
		System.out.println(sBuffer);
		
		// Test Reverse
		StringBuffer reverse = sBuffer.reverse();
		System.out.println("reverse:" + reverse);

		// Test Delete
		StringBuffer deleteString = sBuffer.delete(14, 17);
		System.out.println("delete:" + deleteString);

		// Test Insert
		//StringBuffer insertString = sBuffer.
	}
}
