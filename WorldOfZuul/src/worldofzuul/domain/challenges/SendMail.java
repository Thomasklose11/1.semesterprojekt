package worldofzuul.domain.challenges;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
import worldofzuul.domain.game.FXMLController;
import worldofzuul.domain.objects.Score;
import worldofzuul.domain.rooms.Rooms;


public class SendMail {
    //When the user have completed the game it send a mail to us with the useres name, highscore and room count.  

    public static void mail() {
        final String username = "gruppeprojektzuul@gmail.com";//The addres the mail is sent to
        final String password = "worldofzuul2018";//Passwordword to the mail

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

            message.setText("Player : " + FXMLController.playerName + "   |   Score: " + Score.getScore() + "   |   Rooms visited: " + Rooms.getRoomCounter());
            //Get the user name, score and room count
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

            System.out.println("Done");//The mail have been sent

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

    }
}
