import java.util.ArrayList;

public class RunoobTest {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        System.out.println("Test println(ArrayList) Instance.");
	sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites);
	System.out.println("\nTest ArrayList Object's get method.");
	System.out.println(sites.get(1));
  	System.out.println("\nTest set method, New sites:");
        sites.set(2, "Wiki"); // index pos : Value to be modified	
	System.out.println(sites);
    }
}
