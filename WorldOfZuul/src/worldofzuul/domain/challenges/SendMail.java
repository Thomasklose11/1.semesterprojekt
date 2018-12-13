package worldofzuul.domain.challenges;

import java.io.File;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
import javax.activation.*;
import worldofzuul.domain.rooms.Rooms;


public class SendMail {

    public static void mail() {
        final String username = "gruppeprojektzuul@gmail.com";
        final String password = "worldofzuul2018";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);

            message.setFrom(new InternetAddress("gruppeprojektzuul@gmail.com"));

            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("gruppeprojektzuul@gmail.com"));

            message.setSubject("Testing Subject");

            message.setText("Rooms visited: " + Rooms.getRoomCounter());
//
//            Multipart multipart = new MimeMultipart();
//
//            BodyPart messageBodyPart = new MimeBodyPart();
//
//            messageBodyPart = new MimeBodyPart();
//
//            //VIRKER IKKE. ROOMCOUNTER.txt bliver muligvis ikke sendt til DataSource, men ved ikke nok om den datatype til at gennemskue fejlen
//            String filename =  "RoomCounter.txt";
//            DataSource source = new FileDataSource(filename);
//            
//            messageBodyPart.setDataHandler(new DataHandler(source));
//
//            messageBodyPart.setFileName(filename);
//
//            multipart.addBodyPart(messageBodyPart);
//
//            message.setContent(multipart);

            System.out.println("Sending");

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

    }
}
