/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm.roundRobin;

/**
 *
 * @author @Shardul_Negi(negi_mags)
 */
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessageRemovedException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.*;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class SendEmail extends Object{

public void sendEmail(String email, String amt)
{

    try{

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); // for gmail use smtp.gmail.com
        props.put("mail.smtp.auth", "true");
        props.put("mail.debug", "true"); 
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.port", "465");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.fallback", "false");

        Session mailSession = Session.getInstance(props, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("shardul.negi21@gmail.com", "tag20121");
            }
        });

        mailSession.setDebug(true); // Enable the debug mode

        Message msg = new MimeMessage( mailSession );

        //--[ Set the FROM, TO, DATE and SUBJECT fields
        msg.setFrom( new InternetAddress( "donotreply@yahoo.com" ) );
        msg.setRecipients( Message.RecipientType.TO,InternetAddress.parse(email) );
        msg.setSentDate( new Date());
        msg.setSubject( "Invoice Details" );

        //--[ Create the body of the mail
        msg.setText( "Your Order Has been placed" +"\n" +
                amt);

        //--[ Ask the Transport class to send our mail message
        Transport.send( msg );

    }catch(Exception E){
        System.out.println( "Oops something has gone pearshaped!");
        System.out.println( E );
    }
}
}