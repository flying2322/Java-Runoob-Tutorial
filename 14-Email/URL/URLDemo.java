import java.net.*;  
public class URLDemo{  
public static void main(String[] args){  
try{  
URL url=new URL("http://www.javatpoint.com/java-tutorial");  
  
System.out.println("Protocol: "+url.getProtocol());  
System.out.println("Host Name: "+url.getHost());  
System.out.println("Port Number: "+url.getPort());  
System.out.println("File Name: "+url.getFile());  


System.out.println("\nNew DemoExample:");

URL url2=new URL("https://www.google.com/search?q=javatpoint&oq=javatpoint&sourceid=chrome&ie=UTF-8");    
    
System.out.println("Protocol: "+url2.getProtocol());    
System.out.println("Host Name: "+url2.getHost());    
System.out.println("Port Number: "+url2.getPort());    
System.out.println("Default Port Number: "+url2.getDefaultPort());    
System.out.println("Query String: "+url2.getQuery());    
System.out.println("Path: "+url2.getPath());    
System.out.println("File: "+url2.getFile());    

  
}catch(Exception e){System.out.println(e);}  
}  
}  
