package Utils.Mail;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author akash
 */
public class SendMail {
    public static void sendMail(String recepient, String msg){
        
        System.out.println("Preparing to send email");
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.ssl.trust", "*");
        
        String senderEmail = "gymmanagementsystem94@gmail.com";
        String senderPassword = "ogxjiodfqkohnzuv";
        
        Session session = Session.getInstance(properties, new Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });  
        
        Message message = prepareMessage(session,senderEmail, recepient, msg);
        
        try {
            Transport.send(message);
            System.out.println("Email sent Successfully!");
        } catch (MessagingException ex) {
            //Logger.getLogger(SendMail.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
   
    }

    private static Message prepareMessage(Session session,String senderEmail, String recepientEmail, String msg){
      
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepientEmail));
            message.setSubject("Hello from AED Project");
            message.setText(msg);
            return message;
        } catch (Exception ex) {
           // Logger.getLogger(SendMail.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
