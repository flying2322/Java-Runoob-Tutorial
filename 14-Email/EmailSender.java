import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class EmailSender {
    
    public static void main(String[] args) {
        String to = "liwenpeng000@icloud.com";
        String from = "flying2327@gmail.com";
        String host = "smtp.gmail.com"; // replace with your email provider's SMTP server
        
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        properties.setProperty("mail.smtp.port", "587");
        properties.setProperty("mail.smtp.auth", "true");
        properties.setProperty("mail.smtp.starttls.enable", "true");
        
        // replace with your email provider's username and password
        String username = "flying2327@gmail.com";
        String password = "Flying232!";
        
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Hello from Java!");
            message.setText("This is a test email sent from a Java program.");
            Transport.send(message);
            System.out.println("Email sent successfully.");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}
